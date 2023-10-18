use hr;
-- 1. Write a query to find the addresses (location_id, street_address, city, state_province, country_name) of all the departments. 
-- Hint : Use NATURAL JOIN.
select location_id, street_address, city, state_province, country_name
from locations natural join countries;

select * from employees;
select * from locations;
select * from countries;
select * from departments;

-- 2. Write a query to find the name (first_name, last name), department ID and name of all the employees.
select concat(e.first_name," ",e.last_name) as Emp_Name, d.department_id
from employees e
join departments d;

-- 3. Write a query to find the name (first_name, last_name), job, department ID and name of the employees who works in London. 
select concat(e.first_name," ",e.last_name) as Emp_Name, j.job_title, e.department_id
from employees e
join jobs j;

-- 4. Write a query to find the employee id, name (last_name) along with their manager_id and name (last_name). 
select e.employee_id, e.last_name, d.manager_id
from employees e join departments d;

-- 5. Write a query to find the name (first_name, last_name) and hire date of the employees who was hired after 'Jones'. 
select concat(first_name," ",last_name) as Emp_Name, hire_date
from employees
where hire_date;
select * from employees where first_name="james";
6. Write a query to get the department name and number of employees in the department. 
7. Write a query to find the employee ID, job title, number of days between ending date and starting date for all jobs in department 90. 
8. Write a query to display the department ID and name and first name of manager. 
9. Write a query to display the department name, manager name, and city. 
10. Write a query to display the job title and average salary of employees. 
11. Write a query to display job title, employee name, and the difference between salary of the employee and minimum salary for the job. 
12. Write a query to display the job history that were done by any employee who is currently drawing more than 10000 of salary. 
13. Write a query to display department name, name (first_name, last_name), hire date, salary of the manager for all managers whose experience is more than 15 years.