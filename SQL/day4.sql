use hr;

select concat(first_name," ",last_name) as EmployeeName from employees;

select * from employees where salary > 8000;
select * from employees where salary < 10000;
select * from employees where salary <> 17000;
select * from employees where department_id=100 and salary > 6000;

select * from employees where salary between 10000 and 12000;

select * from employees where not salary = 17000;

select * from employees where department_id=100 or salary > 6000;
-- write a querry where employee works for department whose id is either 60 or 20 and have salary 1700
select * from employees 
where department_id=60 or department_id=20 and salary=17000;

select * from employees 
where (department_id=60 or department_id=20) and salary=1000;

-- In operator
select * from employees
where department_id in (10,20,30);

-- not in
select * from employees
where salary not in (12000,17000,4800,9000);

-- any operator

SELECT * FROM employees
WHERE DEPARTMENT_ID = ANY(SELECT DEPARTMENT_ID FROM DEPARTMENTS);

SELECT * FROM employees
WHERE SALARY = ANY(SELECT SALARY BETWWEN 9000 AND 12000 FROM EMPLOYEES);

-- all operator
SELECT * FROM employees
WHERE department_id = ALL(SELECT department_id FROM departments);

select first_name fname, salary, salary*12 annual_salary from employees;

-- concat
select concat(first_name," ",last_name) as EmployeeName from employees;

-- instr
select instr(first_name,'ar') as pos_of_ar from employees;

select left(first_name,3) from employees;

-- select substring(column_name,position,number_of_characters) from table_name
select substring(first_name,3) from employees;

select substr(first_name,3) from employees;

-- substring index
use hr;
select * from STREET_ADDRESS from locations;
select substring_index(STREET_ADDRESS,' ',-1) as street from locations;

select lpad(first_name,10,'*') from employees;
select rpad(first_name,10,'*') from employees;


select intcap(first_name) from employees;

select concat(upper(substr(first_name,1,1)), lower (substr(first_name,2))) from employees;

-- replace
select replace(first_name,'a','Y') from employees;

-- reverse
select reverse(first_name) from employees;

-- locate
select locate('ell',first_name) from employees;

select department_id from departments
where find_in_set('IT',Department_name);

select avg(salary) from employees;

select sum(salary) from employees;

select count(*) from employees;

select min(salary), max(salary) from employees;

select location_id from locations where location_id is null;

select * from employees;
select first_name from employees where isnull(salary);

select least(salary,7000)

select salary from employees where salary=null;

select first_name from employees where first_name like '%a';


select first_name, last_name, salary,
case
	when salary<=6000 then salary*.10
    when salary<=10000 then salary*.20
    when salary<=20000 then salary*.30
    else salary*.5
end as bonus
from employees;

-- write a query to show bonus of employee who is working in particular department,
-- if employee working in marketting dept and earns > 6000 then add the bonus of 5%
-- if the employee working in hr dept, and have the salary of 5000, then add the bonus of 6%
-- if the employee working in it dept, then add the bonus of 50%

select * from employees;
select * from departments;
select first_name, last_name,
case
	when department_id=20 and salary>6000 then salary*.05
    when department_id=40 and salary>5000 then salary*.06
    when department_id=60 and salary>6000 then salary*.5
end as bonus
from employees;


-- write a query for student table for considering that equal students have scored marks 
-- below 16 in lab then fail
-- below 8 in mcq then fail
-- in lab between 35-40 then score is very good.
select first_name, last_name,
case
	when lab_marks < 16 then fail
    when mcq_marks < 8 then fail
    when lab_marks in between 35 and 40 then very good
end as result
from student;


select * from employees limit 10;
select * from employees; 

select salary from employees order by salary desc;