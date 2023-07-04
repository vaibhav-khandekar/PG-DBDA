use hr;
desc countries;
desc departments;
desc employees;
desc job_history;
desc jobs;
desc locations;
desc regions;

select * from employees;
select * from employees where last_name='king';
-- column alias
select first_name AS fname from employees;
-- table alias
select e.first_name from employees e;
-- using shorthand
select first_name fname from employees;

select first_name AS fname, salary*10 increment from employees;
select * from employees;
