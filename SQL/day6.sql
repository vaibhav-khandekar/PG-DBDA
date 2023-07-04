create database week2;
use week2;
CREATE TABLE student(student_id INTEGER, student_name VARCHAR(50), course_id varchar(10) );

INSERT INTO student (student_id, student_name, course_id) VALUES
(1, 'John', 'CS-101'),
 (2, 'Jane', 'CS-101'),
 (3, 'Dave', 'CS-201'),
 (4, 'Alice', 'CS-201'),
(5, 'Bob', 'CS-301'),
(6, 'Frank', 'CS-301'),(7, 'Johny', 'CS-601'), (8, 'Jane D', 'CS-501'),
(9, 'Dave John', 'CS-401'), (10, 'D John', 'CS-701');


CREATE TABLE course_detail ( course_id varchar(10), course_name VARCHAR(50),Student_id integer );
INSERT INTO course_detail (course_id, course_name,Student_id) VALUES
('CSE-101', 'Computer Programming',1),
('CSE-102', 'Data Structure',2),
('CSE-103', 'Database Management System',1),
('CSE-104', 'Computer Network',4),
('CSE-105', 'Operating System',6);

Select * from student;
Select * from course_detail;
use week2;

select s.student_id, c.course_id
from student s, course_detail c;

select s.student_id, c.course_id
from student s join course_detail c
on s.student_id=c.student_id;

-- left join
select s.student_id, c.course_id
from student s left join course_detail c
on s.student_id=c.student_id;

-- right join
select s.student_id, c.course_id
from student s right join course_detail c
on s.student_id=c.student_id;

-- self join
select s1.student_id, s1.student_name, s2.course_id
from student s1 join student s2 on s1.course_id=s2.course_id;

-- full join
select s.student_id, c.course_id
from student full join course_detail on s.student_id=c.student_id;

select = ;

find theaverage salary of employee in it, select 
select department;


select avg(salary) from employees
where department_id in(select department_id from departments)
group by department_id;

select id from departid = ;
use hr;
select count(*) from employees
where department_id=(select department_id from departments where department_name='Finance');

select FIRST_NAME, LAST_NAME, EMPLOYEE_ID from employees
where DEPARTMENT_ID=(select department_id from employees where FIRST_NAME='Steven' and LAST_NAME='King');

select department_id from employees where FIRST_NAME='Steven' and LAST_NAME='King';

select concat(first_name, " ", last_name) from employees
where DEPARTMENT_ID in
(select DEPARTMENT_ID from employees where FIRST_NAME='Steven' and LAST_NAME='King');

-- Find the dept where emp earns more than 4000
select first_name from employees where salary < 4000;

select department_id, department_name from departments
where department_id in (select DEPARTMENT_ID from employees where salary < 4000);

-- Find out employee details who has second highest salary.
select max(salary) from employees;

select max(salary) from employees
where 
salary < (select max(salary) from employees);

create view sal_emp as select first_name,salary,department_id from employees
where salary > 10000;

select * from sal_emp;

create view no_emp_dept as
select department_id, count(*) from employees group by DEPARTMENT_ID;

select * from no_emp_dept;

create view join_view1 as
select e.FIRST_NAME, d.DEPARTMENT_NAME, e.SALARY
from employees e
join departments d on e.department_id = d.department_id;

select * from join_view1;

create view sub_examp as
select max(salary) from employees
where SALARY < (select max(salary) from employees);

select * from sub_examp;

update sal_emp set first_name='John'
where salary=24000 and department_id=90 and first_name='Steven';
select * from sal_emp;

delete from sal_emp
where salary=24000 and department_id=90 and first_name='john';
select * from sal_emp;

drop view sal_emp;
show tables;