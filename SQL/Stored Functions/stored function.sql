use hr;

DELIMITER //
create function get_emp_name(emp_id int)
returns varchar(50)
DETERMINISTIC 
begin
	declare emp_name varchar(50);
    select first_name into emp_name from employees 
    where employee_id = emp_id;
    return emp_name;
end;
DELIMITER

use hr;
select get_emp_name(110);

-- set global log_bin_trust_function_creators=1;