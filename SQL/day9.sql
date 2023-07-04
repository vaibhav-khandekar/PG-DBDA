create user 'alpha'@'localhost' identified by 'VK';
grant all privileges on week2 to 'alpha'@'localhost';
flush privileges;

-- use hr;
-- start transaction;
-- select * from employees;

-- user 1 root
use week2;
show tables;
desc student;
alter table student add primary key (student_id);
select * from student;
begin;
update student set student_name = 'RANI' where student_id=1;
savepoint a;

delete from student where student_id=2;
rollback to a;
select * from student;
set autocommit=OFF;
-- show triggers from hr like 'employees';

-- user 2 ALPHA
set autocommit=OFF;
use week2;


begin;
savepoint a;
update student set student_name ='Rano' where student_id=3;
update student set course_id ='cs-501' where student_id=3;
update student set course_id ='Rano' where student_id=3;

rollback to a;
savepoint b;
delete from student ;


-- group by
use hr;

select avg(SALARY)
from employees
group by DEPARTMENT_ID;

select DEPARTMENT_ID, max(SALARY)
from employees
group by DEPARTMENT_ID;

select DEPARTMENT_ID, min(SALARY)
from employees
group by DEPARTMENT_ID;

-- find the number of employees with same salary from each department
select DEPARTMENT_ID, SALARY, count(EMPLOYEE_ID)
from employees
group by DEPARTMENT_ID, SALARY;

-- show the number of employees in each dept who earns more than the avg salary from their dept.

select DEPARTMENT_ID, count(EMPLOYEE_ID)
from employees
where SALARY > (select avg(SALARY) from employees)
group by EMPLOYEE_ID;


-- query function

-- drop function get_emp_name;

use hr;

DELIMITER //
create function get_emp_name(emp_id int)
returns varchar(50)
deterministic
begin
	declare emp_name varchar(50);
    select first_name into emp_name from employees
    where EMPLOYEE_ID = emp_id;S
    return emp_name;
end;
DELIMITER

select get_emp_name