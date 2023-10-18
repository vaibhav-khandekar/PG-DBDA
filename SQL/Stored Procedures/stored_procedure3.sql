DELIMITER //
create procedure update_sal(in sal int , in emp_id int)
begin
	update employees set salary = sal where employee_id = emp_id;
end;
DELIMITER

call update_sal(10000,103);

select * from employees;