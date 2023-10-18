DELIMITER //
create procedure get_dept(inout e_id int , out firstname varchar(10),out departmentid int)
begin
	select first_name,department_id from employees
    where employee_id = e_id;
end;
DELIMITER

set @e_id = 103;
call get_dept(@e_id,@firstname,@departmentid);

select * from employees;