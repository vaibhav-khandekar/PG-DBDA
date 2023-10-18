use hr;
-- 1. Calculate the average rating of all salaries, with an alias for the average salary.
select avg(salary) as average_salary from employees;

-- 2. Retrieve the name and email address of all customers, with an alias for the concatenation of their first and last name: Retrieve the number of departments, with an alias for the count_of_dept.
select * from employees;
select concat(first_name,last_name);

-- 3. Write a query to calculate the total revenue generated from sales, and alias the sum as "Total Sales Revenue"


-- 4. Display all the employees whose salary is greater than the average salary of their department.
select e.first_name, e.salary
from employees e, departments d
where e.salary > (select avg(e.salary) from employees e, departments d where e.DEPARTMENT_ID=d.DEPARTMENT_ID);

-- 5. Display employees where length of employee name is 5
select first_name
from employees
where length(first_name)=5;

-- 6. Display all employees where employee name start with J and ends with S
select * from employees
where FIRST_NAME like 'J%S';

-- 7. Display all employees where employee does not belong to 10,20,40 department_id
select first_name from employees
where EMPLOYEE_ID not in (10,20,40);

-- 8. Display all employees where jobs do not belong to the PRESIDENT and MANAGER?
select * from employees
where JOB_ID not in ('PRESIDENT','MANAGER');

-- 9. Display all three figures salary in emp table
select FIRST_NAME, LAST_NAME, SALARY
from employees
where length(salary)=7;

-- 10. Display all records in emp table for employee who does not receive any commission
select * from employees
where COMMISSION_PCT=0;

-- 12. Display all employee names where the first character could be anything, but the second character should be L?
select first_name from employees
where first_name like ('_L%');

-- 13. Display nth highest and nth lowest salary in emp table?
select max(salary), min(salary) from employees;

-- 14. Display all the departments where the department has 3 employees?
select * from departments;
where DEPARTMENT_ID=;

-- 15. Display emp name and corresponding subordinates. Use CONNECT BY clause.

-- 16. Display all employee name, sal, dept id,department name from emp, dept table where all departments which have employees as well as department does not have any employees. This query should include non matching rows.

-- 17. Display all employee name, sal, dept id from emp, dept table where all employees which 
-- have matching departments as well as employee does not have any departments. This query should include non matching rows.
-- Note: In the below query, employees will always have matching records in dept table. Emp, dept table may not be a good example to answer this question.
select e.first_name, e.salary, e.department_id
from employees e, departments d
where e.DEPARTMENT_ID=d.DEPARTMENT_ID;
select * from employees;
show tables;
-- 18. Display all employee name, sal, dept id from emp, dept table where all employees which have matching and non matching department as well as all departments 
-- in dept table which has matching and non matching employees. This query should include non matching rows on both the tables. 
-- Note: In the below query, employees will always have matching records in the dept table. Emp, dept table may not be a good example to answer this question.

select * from employees;
select * from departments;
select * from locations;
-- 19. Display all ename, empno, dname, loc from emp, dept table without joining two tables
select concat(e.FIRST_NAME,"",e.LAST_NAME) as Emp_Name, e.CONTACT_NUMBER, d.DEPARTMENT_NAME -- concat(l.street_address,"",l.city,"",l.postal_code) as location
from employees e, departments d; -- locations l;

-- 20. Display all the departments where department does not have any employees
select e.DEPARTMENT_ID, d.DEPARTMENT_NAME
from employees e, departments d
where e.DEPARTMENT_ID=null;

-- 21. Display all the departments where department does have at least one employee
select e.DEPARTMENT_ID, d.DEPARTMENT_NAME
from employees e, departments d
where e.DEPARTMENT_ID>0;

-- 22. Display all employees who are not managers?
select EMPLOYEE_ID, FIRST_NAME
from employees
where ;

-- 23. Display ename, deptno from emp table with format of {ename} belongs to {deptno}
select concat(first_name," ",last_name," belongs to ",department_id)
from employees;

-- 24. Display total number of employees hired for 1980,1981,1982. The output should be in one record.
select count(employee_id) from employees where year(hire_date) in (1980,1981,1982);

-- 25. Display employee name, dept id from employee table. Also add another column in the same query and it should display ten for dept 10, twenty for dept 20, thirty for dept 30, fourty for dept 40
select concat(first_name," ",last_name) as Emp_Name, department_id
from employees;

-- 26. Display all the records in the emp table. The employee name should be lower case. The job first character should be uppercase and the rest of the character in the job field should be lowercase.
select * from employees
where lower(first_name) ;

-- 27. Display all employees who have joined in the first week of the month ?


-- 28. Display all employees who have joined in the 49th week of the year?

-- 29. Display empid, deptid, salary, salary difference between current record and previous record in emp table. Deptno should be in descending order.


-- 30. Create table emp1 and copy the emp table for dept id 10 while creating the table
Create table emp2 with the same structure of emp table. Do not copy the data
Insert new record in emp1 table, Merge the emp1 table on emp table.
Display all the records for dept id which belongs to employee name JAMES? 
Display all the records in the emp table where salary should be less then or equal to ADAMS salary?
Display all employees that were joined before employee WARD joined?
Display all subordinates who are working under BLAKE?
Display all subordinates(all levels) for employee BLAKE?
Display all records in the emp table for the dept id which belongs to KING's Job? 
Write a SQL statement to increase the salary of employees under the department 40, 90 and 110 according to the company rules that salary will be increased by 25% for department 40, 15% for department 90 and 10% for department 110 and the rest of the departments will remain the same.
Display list of employee names of those who have joined in Year 81 as MANAGER?
Display who is making the highest commission?
Display who is the senior most employee? How many years has been working?
Display who is the most experienced and least experienced employee?
Display employee name, sal, grade, dept name, loc for each employee.
Display all employees whose location is DALLAS?
Display ename, job, dname, deptno for each employee by using INLINE view?
List employee name, job, sal and department of all employees whose salary is not within the salary grade?
Use EMP and EMP1 tables. Query should have only three columns. Display empno,ename,sal from both tables including duplicates. 
Display the employees for empno which belongs to job PRESIDENT?
Display the total number of records in the Emp table?
Display emp table with salary descending order?
Display all the records in emp table order by ascending deptno, descending salary?
Display all employees with how many years they have been servicing in the company?
Select hire_date + 1 from employees limit 1;
Select hire_date + interval 1 month from employees limit 1;
Select hire_date - interval 1 year from employees limit 1;
datediff() : return the number of days between two days
Add 3 months with hiredate in the EMP table and display the result?
Find the date, 15 days after today’s date.
Write a query to display the current date?
Display a distinct job from the emp table?
Display all the records in the emp table where employees hired after 28-SEP-81 and before 03-DEC-81?
Write a query that displays the employee’s names with the first letter capitalized and all other letters lowercase for all employees whose name starts with J, A, or M
Display all jobs that are in department 10. Include the location of the department in the output.
Write a query to display the employee name, department name of all employees who earn a commission
Display the empno, employee name, sal, and salary increased by 15%.
Display employee name, sal, grade. Use emp, salgrade table

			Salary > 15000 Grade A
			Salary > 10000 and < 15000 Grade B
			Salary between  5000 abd 10000  Grade C
			Salary < 5000 Grade D
			
			And Sort on the basis of Grades
