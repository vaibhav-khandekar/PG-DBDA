SELECT FIRST_NAME, SALARY+1000 INCREMENT FROM employees ORDER BY INCREMENT;

-- 
SELECT SALARY, EMPLOYEE_ID FROM employees
group by SALARY
order by EMPLOYEE_ID ASC;


update employees set salary = 100000 where employee_id=110;
select * from employees;

alter table employees add age int(60);
desc employees;

alter table employees modify age float;
desc employees;

create database check1;
use check1;
CREATE TABLE IF NOT EXISTS `regions` (
  `REGION_ID` decimal(5,0) NOT NULL,
  `REGION_NAME` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`REGION_ID`),
  UNIQUE KEY `sss` (`REGION_NAME`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `regions`
--

INSERT INTO `regions` (`REGION_ID`, `REGION_NAME`) VALUES
('1', 'Europe\r'),
('2', 'Americas\r'),
('3', 'Asia\r'),
('4', 'Middle East and Africa\r');
desc regions;
show tables;
select * from regions;
delete from regions where REGION_ID=4;
select * from regions;

truncate table regions;

use hr;
select salary from employees where SALARY > avg(SALARY);

select department_id, count(*) number_of_employee
from employees group by department_id;

select count(*) from employees where DEPARTMENT_ID=80;

select * from employees;
select hire_date, count(*) number_of_employee
from employees group by HIRE_DATE;

select year(hire_date), count(*) number_of_employee
from employees group by year(hire_date);

select department_id, count(*) number_of_employee
from employees where DEPARTMENT_ID=50 group by DEPARTMENT_ID;

-- write a query to find total salary paid to eacg each dept and orderd the result in descending order of total salary paid
select DEPARTMENT_ID, sum(salary) total_sal
from employees
group by DEPARTMENT_ID 
order by total_sal desc;

-- 
select DEPARTMENT_ID, max(salary) total_sal
from employees
group by DEPARTMENT_ID 
order by total_sal desc;

select department_id, sum(salary) total_salary
from employees
group by DEPARTMENT_ID having sum(SALARY)>6000;

-- waq to get avg salary to all the dept who has emplyees more than 10
select DEPARTMENT_ID, avg(salary) average_salary, count(*) count 
from employees group by DEPARTMENT_ID
having count(*) > 10;

select first_name, e.department_id, department_name
from employees e, departments d
where e.DEPARTMENT_ID=d.DEPARTMENT_ID;

select e.department_id, department_name
from employees e, departments d
where e.department_id=d.department_id
and d.department_name !='IT';

-- waq to find who has score higher than 80 marks
select g.student_id, student_name
from students s;

-- Cartesian join
select first_name, department_name
from employees, departments;

select e.department_id, department_name
from employees e left join departments d
on e.department_id=d.department_id;

select e.department_id, department_name
from employees e right join departments d
on e.department_id=d.department_id;