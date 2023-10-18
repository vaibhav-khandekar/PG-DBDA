use hr;
-- 1. Write a query to find the name (first_name, last_name) and the salary of the employees who have a higher salary than the employee whose last_name='Bull'.
select concat(first_name," ",last_name) as Emp_Name, SALARY
from employees
where SALARY > (select SALARY from employees where LAST_NAME="Bull");

-- 2. Write a query to find the name (first_name, last_name) of all employees who works in the IT department.
select concat(first_name," ",last_name) as Emp_Name, DEPARTMENT_ID
from employees
where DEPARTMENT_ID = (select DEPARTMENT_ID from departments where DEPARTMENT_NAME='IT');

-- 3. Write a query to find the name (first_name, last_name) of the employees who have a manager and worked in a USA based department. 
-- Hint : Write single-row and multiple-row subqueries
select concat(first_name," ",last_name) as Emp_Name 
from employees
where MANAGER_ID <> 0 and (select COUNTRY_NAME from countries where country_id='US');

-- 4. Write a query to find the name (first_name, last_name) of the employees who are managers. 
select concat(first_name," ",last_name) as Emp_Name
from employees
where EMPLOYEE_ID = (select EMPLOYEE_ID from employees where EMPLOYEE_ID = MANAGER_ID);

-- 5. Write a query to find the name (first_name, last_name), and salary of the employees whose salary is greater than the average salary. 
select concat(first_name," ",last_name) as Emp_Name, SALARY
from employees
where SALARY > (select avg(SALARY) from employees);

-- 6. Write a query to find the name (first_name, last_name), and salary of the employees whose salary is equal to the minimum salary for their job grade. 
select EMPLOYEE_ID, concat(first_name," ",last_name) as Emp_Name, SALARY
from employees
where SALARY = (select min(SALARY) from employees);

-- 7. Write a query to find the name (first_name, last_name), and salary of the employees who earns more than the average salary and works in any of the IT departments. 
select concat(first_name," ",last_name) as Emp_Name, SALARY, DEPARTMENT_ID
from employees 
where SALARY > (select avg(SALARY) from employees) and DEPARTMENT_ID = (select DEPARTMENT_ID from departments where department_name = 'IT');

-- 8. Write a query to find the name (first_name, last_name), and salary of the employees who earns more than the earning of Mr. Bell.
select EMPLOYEE_ID, concat(first_name," ",last_name) as Emp_Name, SALARY
from employees
where SALARY > (select SALARY from employees where LAST_NAME='Bell');

-- 9. Write a query to find the name (first_name, last_name), and salary of the employees who earn the same salary as the minimum salary for all departments.
select EMPLOYEE_ID, concat(first_name," ",last_name) as Emp_Name, SALARY
from employees
where SALARY = (select SALARY from employees where SALARY);

select * from departments;
-- 10. Write a query to find the name (first_name, last_name), and salary of the employees whose salary is greater than the average salary of all departments.
select EMPLOYEE_ID, concat(first_name," ",last_name) as Emp_Name, SALARY
from employees
where salary > (select avg(salary) from employees);

-- 11. Write a query to find the name (first_name, last_name) and salary of the employees who earn a salary that is higher than the salary of all the Shipping Clerk (JOB_ID = 'SH_CLERK'). Sort the results of the salary of the lowest to highest. 
select concat(first_name," ",last_name) as Emp_Name, SALARY
from employees
where SALARY > (select SALARY from employees where JOB_ID='SH_CLERK')
order by SALARY;

select * from employees;

-- 12. Write a query to find the name (first_name, last_name) of the employees who are not supervisors. 
select concat(first_name," ",last_name) as Emp_Name;
select * from employees
where employee_id not in (select distinct manager_id from employees);

-- 13. Write a query to display the employee ID, first name, last name, and department names of all employees. 
select EMPLOYEE_ID, concat(first_name," ",last_name) as Emp_Name, DEPARTMENT_ID
from employees
where ;

-- 14. Write a query to display the employee ID, first name, last name, salary of all employees whose salary is above average for their departments.
select EMPLOYEE_ID, concat(first_name," ",last_name) as Emp_Name, SALARY
from employees
where SALARY > (select avg(SALARY) from departments);

-- 15. Write a query to fetch even numbered records from the employees table. 
select * from employees;

-- 16. Write a query to find the 5th maximum salary in the employees table. 


-- 17. Write a query to find the 4th minimum salary in the employees table. 
select column_name
from table1_name
left join table2_name
on table1_name. 

-- 18. Write a query to select the last 10 records from a table. 
select * from employees
order by employee_id desc limit 10;

-- 19. Write a query to list the department ID and name of all the departments where no employee is working. 


-- 20. Write a query to get 3 maximum salaries. 
select salary
from employees
order by salary desc limit 3;

-- 21. Write a query to get 3 minimum salaries.
select salary
from employees
order by salary limit 3;

-- 22. Write a query to get nth max salaries of employees.

