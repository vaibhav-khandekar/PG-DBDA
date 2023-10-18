-- write a procedure to get information firstname,lastname of employees 
-- through employee_id 

DELIMITER //
create procedure get_emp_flname(in emp_id int , out firstname varchar(10) , out lastname varchar(10))
begin
	select first_name,last_name from employees where employee_id = emp_id;
end;
DELIMITER

call get_emp_flname(103,@firstname,@lastname);