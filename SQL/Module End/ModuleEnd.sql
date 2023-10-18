-- 1. Create a orders tables and having 4 constraints in the table.

create database ModuleEnd;
use ModuleEnd;
CREATE TABLE orders(
  order_id int(11) UNIQUE NOT NULL,
  order_date date NOT NULL,
  shipped_date date DEFAULT NULL,
  deliver_sts varchar(15) NOT NULL,
  PRIMARY KEY (`order_id`));
  
-- 2. Insert minimum three records in the table(2 Marks)

insert  into orders(order_id,order_date,shipped_date,deliver_sts) values
(1,'2023-04-08','2023-04-10','Shipped'),
(2,'2023-04-12','2023-04-14','Shipped'),
(3,'2023-04-15','2023-04-18','Shipped'),
(4,'2023-04-18','2023-04-20','Shipped'),
(5,'2023-04-22','2023-04-25','Shipped');

select * from orders;

-- 3. Write an Query to find name of employee whose name contains ‘ma’ at any position(2 Marks)
use hr;

select first_name as Employee_Name from employees where first_name like "%ma%";

-- 4. Displays number of employees work in each department.
select count(*) from employees group by department_id;

-- 5. Write a query that returns all employees who have a salary greater than the average salary of their department.
select concat(first_name," ",last_name) as Emp_Name, department_id 
from employees 
where salary > any 
(select avg(salary) from employees group by department_id);

-- 6. Write a query to select all employees and their corresponding department names, but only display those employees who have a manager.
select concat(first_name," ",last_name) as Emp_Name, d.department_name
from employees e
join departments d
on e.department_id = d.department_id
where e.manager_id <> 0;

-- 7. Write a stored procedure that updates the salary of all employees in a given department by a specified percentage.
-- The procedure should take input parameters for the department ID and the percentage increase in salary.

DELIMITER //
create procedure update_salary(in d_id int, in increment float, out sal float)
begin
update employees set salary=salary*increment where department_id = d_id;
end;
//
DELIMITER ;

call update_salary(20,4.5,@sal);
select @sal;

-- 8.Write a stored function that takes an employee ID as an input parameter and returns the number of months the employee has been with the company.(5 Marks)

drop function get_exp;
DELIMITER //
	create function get_exp(e_id int)
    returns int
    deterministic
    begin
		declare emp_exp int;
        select year(now()) - year(hire_date) into emp_exp
		from employees
		where employee_id=e_id;
        return emp_exp;
	end;
//
DELIMETER ;

select get_exp(102);
