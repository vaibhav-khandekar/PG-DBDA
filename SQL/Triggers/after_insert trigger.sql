use hr;
show tables;
CREATE TABLE employee1 (
  employee_id INT PRIMARY KEY,
  name VARCHAR(50),
  salary FLOAT
);
INSERT INTO employee1 (employee_id, name, salary)
VALUES
  (1, 'John Smith', 50000.0),
  (2, 'Jane Doe', 60000.0),
  (3, 'Bob Johnson', 55000.0),
  (4, 'Mary Brown', 65000.0),
  (5, 'Tom Davis', 70000.0);
  
  -- ------------------------------------------------------------------
  
  DELIMITER //
  create trigger after_insert_empsalary
  after insert on employee1
  for each row
  begin
	if not exists(select * from salary_history
    where employee_id=new.employee_id and old_salary=new.salary) then
		
		insert into salary_history(employee_id,first_name,old_salary,new_salary,department_id)
        values(new.employee_id,new.name,new.salary,new.salary,department_id);
	
    end if;
  end;
  DELIMITER
  
  -- ------------------------------------------------------------------------
  
  insert into employee1 values(11,'Sayali',6000);
  
  select * from salary_history;