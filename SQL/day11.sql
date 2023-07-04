use hr;

DELIMITER //
create trigger to_check_emp_id
before insert on employees
for each row
begin
	if exists (select * from employees where employee_id = new.employee_id ) then
		signal sqlstate '45000' set message_text = "already exists employee_id";
    end if;
end;
//
DELIMITER ;

desc employees;

-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------

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
  
-- ---------------------------------------------------------------------------------------------------------------------------------------------------------------------

DELIMITER //
create trigger after_insert_salary
after insert on employees
for each row
when(new.salary <> old.salary)
begin
	insert into salary_history(employee_id, first_name, old_salary, new_salary, department_id)
    values(old.employee_id, old.first_name, old.old_salary, old.new_salary, old.department_id)
end;
//
DELIMITER ;

-- ---------------------------------------------------------------------------------------------------------------------------------------------------------------------

DELIMITER //
create trigger after_insert_salary
after insert on employees
for each row
begin
	if not exists (select * from salary_history
		where employee_id = new.employee_id) then
		insert into salary_history(employee_id, first_name, old_salary, new_salary, department_id)
		values(new.employee_id, new.first_name, new.salary, new.salary, department_id);
    end if;
end;
//
DELIMITER ;

insert into employees(employee_id,first_name,salary) values('1010',"vaibhav",35000);

-- ---------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- Jayesh

DELIMITER //
create trigger after_insert_salary
after update on employees
for each row
begin
	if(new.salary = old.salary) then
		insert into salary_history(employee_id, first_name, old_salary, new_salary, department_id)
		values(new.employee_id, new.first_name, old.salary, new.salary, old.department_id);
    end if;
end;
//
DELIMITER ;

select * from 

-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------


DELIMITER //
create trigger after_insert_salary
after update on employees
for each row
begin
	if new.salary != old.salary then
		insert into salary_history(employee_id, first_name, old_salary, new_salary, department_id)
		values(new.employee_id, new.first_name, new.salary, new.salary, department_id);
    end if;
end;
//
DELIMITER ;

-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------

