CREATE TABLE salary_history (
  employee_id INT,
  first_name VARCHAR(50),
  old_salary DECIMAL(10,2),
  new_salary DECIMAL(10,2),
  department_id INT
);
INSERT INTO salary_history (employee_id, first_name, old_salary, new_salary, department_id)
VALUES
  (1, 'John', 50000.00, 55000.00, 101),
  (2, 'Jane', 60000.00, 65000.00, 102),
  (3, 'Bob', 45000.00, 48000.00, 103);
INSERT INTO salary_history (employee_id, first_name, old_salary, new_salary, department_id)
VALUES
  (101, 'John', 50000.00, 55000.00, 101),
  (201, 'Jane', 60000.00, 65000.00, 102),
  (301, 'Bob', 45000.00, 48000.00, 103);
  
select * from salary_history;

-- -------------------------------------------------------------------------
use hr;
DELIMITER $$
create trigger after_update_salary
after UPDATE on employee1
for each row
begin
if(new.salary!=old.salary) then
	insert into salary_history(employee_id,first_name,old_salary,new_salary,department_id) 
    values 
	(new.employee_id, new.name,old.salary,new.salary,department_id); 
END IF;
end
$$
DELIMITER ;

drop trigger after_insert_salary;

select * from employee1;

update employee1 set salary=3000 where employee_id=11;

select * from salary_history;