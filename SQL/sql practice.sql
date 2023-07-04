use hr;
-- get max salary from each department

select max(salary), DEPARTMENT_ID
from employees
group by department_id;

-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- get max salary of every jobs

select max(salary), JOB_ID
from employees
group by JOB_ID;

-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- max salary using without using max() salary.

select SALARY
from employees
order by SALARY desc limit 1;

-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- get max salary of every department which has more than 10 employees

select max(salary), DEPARTMENT_ID
from employees
group by DEPARTMENT_ID
having count(EMPLOYEE_ID)>10;

-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------
select max(salary), DEPARTMENT_ID
from employees
group by DEPARTMENT_ID
having count(EMPLOYEE_ID)<10;

-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- Write a query to get the total salary, maximum, minimum, average salary of employees (job ID wise), for department ID 90 only.

select sum(SALARY), max(SALARY), min(SALARY), avg(SALARY)
from employees
where DEPARTMENT_ID=90
group by JOB_ID;

-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------
select job_id, count(*) from employees group by JOB_ID;

-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------
select DEPARTMENT_ID, count(*)
from employees
group by DEPARTMENT_ID;

-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------

-- write a query to get a average salary, count of employees working under different managers

select avg(SALARY), count(*), MANAGER_ID
from employees
group by MANAGER_ID;

-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- write a query to find the manager id and the salary of the lowest-paid employee for that manager.

select manager_id, min(SALARY)
from employees
group by MANAGER_ID;

-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- sub-query

-- Write a query to find the name (first_name, last_name) of the employees who have a manager and worked in a USA based department.
select concat(first_name," ",last_name) as Emp_Name, SALARY
from employees
where MANAGER_ID in (select distinct(MANAGER_ID) from departments where MANAGER_ID <> 0) and DEPARTMENT_ID in (select DEPARTMENT_ID from departments where location_id in (select LOCATION_ID from locations where country_id="us"));
select * from employees;
select * from locations;
-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------

select * from employees order by department_id limit 20 offset 10;

-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------


-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------


-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------