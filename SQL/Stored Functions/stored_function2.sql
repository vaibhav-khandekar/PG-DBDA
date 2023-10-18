-- to find total salary of all employees who reports to a specific manager

-- delimiter is used to make the whole code execute as a block
select manager_id,sum(salary) from employees group by manager_id;

-- total salary -- sum(salary) -- return type int
-- func return salary -- float/int
-- manager_id int

DELIMITER //
create function get_total_sal(mg_id int)
returns int
deterministic
begin
	declare total_sal int;
    select sum(salary) into total_sal from employees
    where manager_id = mg_id;
    return total_sal;
end;
DELIMITER

select get_total_sal(100);