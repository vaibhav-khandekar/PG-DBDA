-- find out the employees with their experience

DELIMITER //
create function emp_experience()
returns varchar(3000) 
deterministic
begin
	declare emp_with_exp varchar(3000);
	select group_concat(concat(first_name,' ',(year(curdate())-year(hire_date)))separator',') into emp_with_exp
    from employees;
    return emp_with_exp;
end;
DELIMITER

select emp_experience();