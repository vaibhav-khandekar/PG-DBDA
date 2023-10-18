DELIMITER //
create procedure get_empname_with_id(in emp_id int)
begin
select concat(first_name,' ',last_name) from employees where employee_id = emp_id;
end;
DELIMETER

call get_empname_with_id(102);