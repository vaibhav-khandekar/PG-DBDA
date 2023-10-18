use hr;
-- 1. Display the total number of records in the Emp table?
SELECT count(*) FROM employees;

-- 2. Display emp table with salary descending order?
SELECT * FROM employees
ORDER BY salary DESC;

-- 3. Display all the records in emp table order by ascending deptno, descending salary?
SELECT * FROM employees
ORDER BY salary DESC;

-- 4. Display all employees with how many years they have been servicing in the company?
select round(datediff(end_date, start_date)/365,2) as experience, start_date, end_date from job_history;

-- 5. Add 3 months with hiredate in the EMP table and display the result?
select month(hire_date)+3, hire_date, date_add(hire_date, interval 3 month) from employees;

-- 6. Find the date, 15 days after today’s date.
select curdate()+15;

-- 7. Write a query to display the current date?
select curdate();

-- 8. Display a distinct job from the emp table?
select distinct job_id from employees;

-- 9. Display all the records in the emp table where the employee was hired after 28-SEP-81 and before 03-DEC-81?
select * from employees
where hire_date between '1981-9-28' and '1982-12-3';

-- 10. Write a query that displays the employee’s names with the first letter capitalized and all other letters lowercase for all employees whose name starts with J, A, or M
select upper(substring(first_name,1)) from employees 
where first_name like "J%" or first_name like "A%" or first_name like "M%";

-- 11. Display all jobs that are in department 10. Include the location of the department in the output.
select * from departments
where department_id=10;

-- 12. Write a query to display the employee name, department name of all employees who earn a commission
select e.first_name, e.last_name, d.department_name
from employees e, departments d
where commission_pct <> 0;

-- 13. Display the empno, ename, sal, and salary increased by 15%.
select employee_id, first_name, salary, salary*0.15 as increase_salary from employees;

-- 14. Display ename, sal, grade. Use emp, salgrade table
-- Salary > 15000 Grade A
-- Salary > 10000 and < 15000 Grade B
-- Salary between  5000 abd 10000  Grade C
-- Salary < 5000 Grade D
-- And Sort on the basis of Grades

select first_name, salary,
case
	when salary > 15000 then 'grade A'
    when salary > 10000 and salary < 15000 then 'grade B'
    when salary > 5000 and salary < 10000 then 'grade C'
    when salary < 5000 then 'grade D'
end as grade from employees;