use hr;
-- 1. From the following table return complete information about the employees.
SELECT * FROM employees;

-- 2. From the following table, write a  query to find the salaries of all employees. Return salary.
SELECT salary FROM employees;

-- 3. From the following table, write a  query to find the unique designations of the employees. Return job name.
SELECT DEPARTMENT_NAME FROM departments
WHERE DEPARTMENT_ID = ANY(SELECT DEPARTMENT_ID FROM EMPLOYEES);

select distinct job_id
from jobs;

-- 4. From the following table, write a  query to list the employees’ names, increase their salary by 15%, and express the number of Dollars.
SELECT first_name , SALARY*0.15 AS INCREASE_SALARY FROM employees;

-- 5. From the following table, write a  query to list the employee's name and job name as a format of "Employee & Job".
SELECT first_name as employee , job_id as job from employees;

-- 6. Write a query to produce the output of employees as follows.
select * from employees;

-- 7. From the following table, write a  query to find those employees with a hire date in the format like February 22, 1991. Return employee ID, employee name
select employee_id, date_format(hire_date, "%Y %M %D")
from employees;

-- 8. From the following table, write a query to count the number of characters except the spaces for each employee name. Return employee name length.
select char_length(first_name) from employees;

-- 9. From the following table, write a  query to find the employee ID, salary, and commission of all the employees.
select employee_id, salary, commission_pct from employees;

-- 10. From the following table, write a  query to find the unique department with jobs. Return department ID, Job name.
select distinct department_id, job_id as job_name
from employees;

-- 11. From the following table, write a  query to find those employees who do not belong to the department 2001.
select * from employees
where department_id !=2001;

-- 12. From the following table, write a  query to find those employees who joined before 1991. Return complete information about the employees.
select * from employees
where hire_date < '1991-1-1';

-- 13. From the following table, write a  query to calculate the average salary of employees who work as analysts. Return average salary.
select avg(e.salary)
from employees e, job_history j
where j.job_id='IT_PROG';

-- 14. From the following table, write a  query to find the details of the employee ‘John’. 
select * from employees
where first_name='John';

-- 15. From the following table, write a  query to identify employees whose commissions exceed their salaries. Return complete information about the employees.  
select * from employees
where salary < commission_pct;

-- 16. From the following table, write a  query to identify those employees whose salaries exceed 25000 after receiving a 25% salary increase. Return complete information about the employees.
select * from employees
where salary+salary*0.25 > 25000;

-- 17. From the following table, write a  query to find the names of the employees whose length is six. Return employee name.
select first_name from employees
where length(first_name) = 6;

-- 18. From the following table, write a  query to find out which employees joined in the month of January. Return complete information about the employees.
select * from employees
where month(hire_date)=1;

-- 19. From the following table, write a query to separate the names of employees and their managers by the string 'works for'.
select concat(first_name," works for ",manager_id) as Employee_Manager from employees;

-- 20. From the following table, write a  query to find those employees whose designation is ‘CLERK’. Return complete information about the employees.
select * from job_history;

-- 21. From the following table, write a query to identify employees with more than 3 years of experience. Return complete information about the employees.
select e.first_name, year(j.end_date) - year(j.start_date) as experience
from employees e, job_history j
where year(j.end_date) - year(j.start_date) > 3;

-- 22. From the following table, write a query to find those employees whose salaries are less than 3500. Return complete information about the employees.
select * from employees
where salary<3500;
-- 23. From the following table, write a query to find the employee whose designation is ‘ANALYST’. Return employee name, job name and salary.
select e.first_name, j.job_title, e.salary 
from employees e, jobs j
where j.job_title='STOCK CLERK';

-- 24.From the following table, write a query to identify those employees who joined the company in 1991. Return complete information about the employees.
select * from employees
where year(hire_date)=1991;

-- 25. From the following table, write a query to find those employees who joined before 1st April 1991. Return employee ID, employee name, hire date and salary.
select * from employees
where hire_date<'1991-4-1';

-- 26. From the following table, write a query to identify the employees who do not report to a manager. Return employee name, job name.
select first_name, job_id from employees
where manager_id=null;

-- 27. From the following table, write a query to find the employees who joined on the 1st of May 1991. Return complete information about the employees.
select * from employees
where hire_date='1991-5-1';

-- 28. From the following table, write a query to identify the experience of the employees who work under the manager whose ID number is 68319. Return employee ID, employee name, salary, experience.
select e.employee_id, e.first_name, e.salary, year(j.end_date)-year(j.start_date) as experience, manager_id
from employees e, job_history j
where manager_id=103;

-- 29. From the following table, write a query to find out which employees earn more than 100 per day as a salary. Return employee ID, employee name, salary, and experience.
select e.employee_id, e.first_name, e.salary, year(j.end_date)-year(j.start_date) as experience, round(e.salary/30) as salary_per_day
from employees e, job_history j
where round(e.salary/30)>100;

-- 30. From the following table, write a query to identify those employees who retired after 31-Dec-99, completing eight years of service. Return employee name.
select e.first_name, j.end_date
from employees e, job_history j 
where j.end_date='1999-12-31';
-- 31. From the following table, write a query to identify the employees whose salaries are odd. Return complete information about the employees.
select * from employees
where salary%2!=0;
-- 32. From the following table, write a query to identify employees whose salaries contain only three digits. Return complete information about the employees.
select * from employees
where length(salary)=3;

-- 33. From the following table, write a query to find those employees who joined in the month of APRIL. Return complete information about the employees.
select * from employees
where month(hire_date)='APRIL';

-- 34. From the following table, write a query to find out which employees joined the company before the 19th of the month. Return complete information about the employees.
select * from employees
where day(hire_date)<19;

-- 35. From the following table, write a query to identify those employees who have been working as a SALESMAN and month portion of the experience is more than 10. Return complete information about the employees.
select * from job_history
where job_id='SA_MAN' and month(end_date - start_date) > 10;