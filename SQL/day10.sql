-- to find the total salary of all employees who reports a specific manager

-- total salary -- sum(salary) -- return type (int / float)

-- function return salary -- float / int
-- manager_id int

-- drop function get_total_sal_manager(m_id int)

DELIMITER //
	create function get_total_sal_manager(m_id int)
	returns float(10,2)
    deterministic
    begin
		declare total_salary float(10,2);
        select sum(salary) into total_salary from employees where manager_id=m_id;
		return total_salary;
    end;
//
DELIMITER ;

-- print salary by taking first name and last name

drop function get_sal;

DELIMITER //
	create function get_sal(e_f varchar(10), e_l varchar(10))
    returns float(8,2)
    deterministic
    begin
		declare sal float(8,2);
        select salary into sal from employees where FIRST_NAME=e_f and LAST_NAME=e_l;
        return sal;
	end;
//
DELIMETER;

-- retrieve dept name with highest average package
drop function get_dept;

DELIMITER //
	create function get_dept()
	returns varchar(20)
    deterministic
    begin
		declare dept varchar(30);
        select d.DEPARTMENT_NAME into dept 
        from employees e, departments d 
        where e.DEPARTMENT_ID=d.DEPARTMENT_ID
        group by d.DEPARTMENT_ID
        order by avg(SALARY) desc limit 1;
        return dept;
	end;
//
DELIMITER ;

-- return list of employees where salary is greater than or equal to given ammount
drop function get_list;

DELIMITER //
	create function get_list(sal float(8,2))
    returns varchar(1000)
    deterministic
    begin
		declare emp_list varchar(1000);
        select group_concat(concat(first_name," ",last_name)separator', ') into emp_list from employees where SALARY >= sal;
        return emp_list;
	end;
//
DELIMITER ;

-- find the employees with their experience
drop function get_exp;

DELIMITER //
	create function get_exp(id int)
    returns int
    deterministic
    begin
		declare emp_exp int;
        select year(now()) - year(hire_date) into emp_exp
		from employees
		where employee_id=id;
        return emp_exp;
	end;
//
DELIMETER ;
-- ----------------------------------------------------------------------------------------------------------------------------------------------------
drop function get_exp2;

DELIMITER //
	create function get_exp2(id int)
    returns int
    deterministic
    begin
		declare emp_exp int;
        select year(end_date) - year(start_date) into emp_exp
		from job_history
		where employee_id=id;
        return emp_exp;
	end;
//
DELIMETER ;
-- -----------------------------------------------------------------------------------------------------------------------------------------------------------------
drop function get_emp_experience;

DELIMITER //
	create function get_emp_experience(id int)
    returns varchar(1000)
    deterministic
    begin
		declare years_of_experience varchar(1000);
        select group_concat(concat(datediff(end_date, start_date)/365)separator ', ') into years_of_experience
        from job_history j
        join employees e on e.EMPLOYEE_ID = j.EMPLOYEE_ID
        where e.EMPLOYEE_ID=id;
        if years_of_experience is not null
			then
            return concat(id," hsa ",years_of_experience," years of experience.");
		else
			return concat("sorry employee with id ",id," is not found in our database.");
		end if;
	end;
//
DELIMITER ;

-- -------------------------------------------------------------------------------------------------------------------------------------------------------------------
drop procedure get_all_data;
-- procedure is a pre-compiled code thats why it is efficient as compare to function

DELIMITER //
create procedure get_all_data() -- to create procedure
begin
select * from employees;
end;
//
DELIMITER ;

call get_all_data;

-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------
drop procedure get_emp_name_with_id;
USE HR;
DELIMITER //
create procedure get_emp_name_with_id(in emp_id int)
begin
select concat(first_name," ",last_name) as Emp_Name from employees where EMPLOYEE_ID;
end;
//
DELIMITER ;

call get_emp_name_with_id(101);

-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------
drop procedure get_update_sal;

DELIMITER //
create procedure get_update_sal(in emp_id int, in sal float(10,3))
begin
update employees set salary=sal where employee_id = emp_id;
end;
//
DELIMITER
;
call get_update_sal(102,60000);

select employee_id,concat(first_name," ",last_name) as Emp_Name,salary from employees where employee_id=102;
-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------

set @employee_id=101;
select @employee_id;
set @sal = 3000;
select @sal;
call get_update_sal_using_inout(@employee_id, @sal);
select @employee_id, @sal;

select * from employees where employee_id=102;

-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- write a procedure to first name and last name employee through emp_id 
drop procedure get_emp_name;

DELIMITER //
create procedure get_emp_name(in id int)
begin
select concat(first_name," ",last_name) as Emp_Name from employees where EMPLOYEE_ID = id;
end;
//
DELIMITER ;

call get_emp_name(101);

-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------
drop procedure insert_into;

DELIMITER //
create procedure insert_into (INOUT emp_id int, in f_name varchar(50), in sal decimal(10,2))
begin
	insert into employees(first_name, salary) values (f_name, sal);
    set emp_id = last_insert_id();
end;
//
DELIMITER ;

set @emp_id=101;
call insert_into(@emp_id,"john doe",5600.7);
select @emp_id;
select * from salary_history;

-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- out
drop procedure get_dept;

DELIMITER //
create procedure get_dept(inout emp_id int, out f_name varchar(50), out d_id int)
begin
	select first_name, department_id into f_name, d_id
    from employees
    where employee_id = emp_id;
end;
DELIMITER

set @emp_id=102;
call get_dept(@emp_id, @f_name, @d_id);
select @f_name, @d_id;

-- drop procedure get_dept;

-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------
use hr;
drop procedure get_dept;
use db;
DELIMITER //
create procedure get_dept(inout emp_id int, out f_name varchar(50), out d_id int)
begin
	select first_name, department_id into f_name, d_id
    from employees
    where employee_id = emp_id
    limit 1;
end;
//
DELIMITER ;

set @emp_id=101;
call get_dept(@emp_id, @f_name, @d_id);
select @emp_id,@f_name, @d_id;

-- what can be use for validation
-- -> triggers and procedures

-- triggers

DELIMITER //
create trigger before_insert_into_employee
before insert on employees
for each row
begin
	if new.salary<0 then
		signal sqlstate '45000' set message_text="cannot insert negative salary";
	end if;
end;
//
DELIMITER ;

-- ---------------------------------------------------------------------------------------------------------------------------------------
