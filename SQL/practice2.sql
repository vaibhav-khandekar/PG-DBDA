use hr;

select * from employees;
select * from departments;

-- ---------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- left join
select concat(e.first_name," ",e.last_name) as Emp_Name, d.department_id, d.department_name from employees e
left join departments d
on e.department_id = d.department_id;

-- ---------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- right join
select concat(first_name," ",last_name) as Emp_Name, d.department_id, d.department_name from employees e
right join departments d
on e.department_id = d.department_id;

-- ---------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- full join
select * from employees e
full join departments d
on e.department_id = d.department_id;

-- ---------------------------------------------------------------------------------------------------------------------------------------------------------------------
--  full join in working
SELECT * FROM employees
LEFT JOIN departments ON employees.department_id = departments.department_id
UNION
SELECT * FROM employees
RIGHT JOIN departments ON employees.department_id = departments.department_id;

-- ---------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- view
create view view2 as select * from employees;

select * from view2;

drop view view1;
-- ---------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- equi join
select * from employees
equi join departments
on employees.department_id = departments.department_id;

-- ---------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- cross join
select * from employees
cross join departments
cross join locations
cross join job_history;