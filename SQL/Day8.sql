use hr;
show tables;

select * from employees;

select concat(first_name,"",last_name) as full_name, salary
from employees where salary > 10000;

select concat(first_name,"",last_name) as full_name, salary
from employees where SALARY=17000 and DEPARTMENT_ID=90;

select concat(first_name,"",last_name) as full_name, salary
from employees where MANAGER_ID=100 or DEPARTMENT_ID=100;

select concat(first_name,"",last_name) as full_name, salary
from employees where SALARY between 10000 and 50000;

select concat(first_name,"",last_name) as full_name, HIRE_DATE
from employees where HIRE_DATE between '1987-04-18' and '1987-06-23';

-- in is work as logical or
select concat(first_name,"",last_name) as full_name, DEPARTMENT_ID
from employees where DEPARTMENT_ID in (90,60,30,100);

-- any is work as logical and (any will only work in sub-queries)
select concat(first_name,"",last_name) as full_name, DEPARTMENT_ID
from employees where DEPARTMENT_ID any (90,60,30,100);

-- delete work for row level
-- truncate will use to delete only the contents of data
-- drop will use to delete whole structure of a table
-- update is perform on row level (add column,remove column ,modify column)
-- 
-- ------------------------------------------------------------------------------------------
select * from employees;

update employees set salary=20000 where employee_id=101;
update employees set commission_pct=0.5 where employee_id=101;

-- alter command is used to modify only table structure...
alter table employees rename column PHONE_NUMBER to CONTACT_NUMBER;

alter table employees drop column age;
-- this command is used to drop column age

alter table employees modify column SALARY int;
-- this command

alter table employees add column age int after hire_date;
-- this command is used to add column in table

alter table employees add constraint fsk_manager
foreign key(manager_id) references manager(manager_id);

alter table employees drop constraint fsk_manager;

alter table employees add constraint age_check check(age>18);
-- it will check for the age is greater than 18 or not.

