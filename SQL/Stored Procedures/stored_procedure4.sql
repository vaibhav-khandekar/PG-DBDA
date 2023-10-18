-- update salary
-- creation of procedure using inout

DELIMITER //
create procedure update_sal_inout(inout employee_id int , in sal int)
begin
	update employees set salary = sal where employee_id = employee_id;
end;
DELIMITER

set @employee_id=103;
set @sal=15000;
call update_sal_inout(@employee_id,@sal);

set SQL_SAFE_UPDATES=0;

SELECT * FROM EMPLOYEES;