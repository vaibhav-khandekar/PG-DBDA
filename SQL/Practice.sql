create database db;
use db;
create table flat(
sr_no int unique not null, 
c_name varchar(30) not null,
contact int unique not null,
email varchar(20) unique not null,
address varchar(50) not null);

desc flat;

insert into flat(sr_no, c_name, contact, email, address) values
(1,'vaibhav',771901702,'vaibhav69@gmail.com','malad west, mumbai 64'),
(2,'nitesh',987328134,'nitesh24@gmail.com','dombivali'),
(3,'shreekant',880384453,'shree01@gmail.com','aurangabad'),
(4,'dhanush',908229489,'dhanush04@gmail.com','thane'),
(5,'mahesh',987828965,'mahesh0001@gmail.com','nagpur'),
(6,'mrudal',917854979,'mrudal78@gmail.com','nagpur');

select * from flat;

show table status;


create table class(sr_no int AUTO_INCREMENT primary key, s_name varchar(30) not null, branch varchar(20) not null);
insert into class (s_name, branch) values
("vaibhav khandekar" , "Info Tech"),
("Shree Dandale" , "Mechanical"),
("Mahesh Talmale" , "Info Tech"),
("Dhanush Shetty" , "Mechanical"),
("Nitesh Narkhdede" , "Computer Science"),
("Mrudal" , "ENTC");
insert into class(s_name, branch) values ("Mrudal" , "ENTC") , ("Prasad" , "Mechanical");

update class set branch="Mechanical" where sr_no=6;
select * from class;
-- limit, offset
select * from class limit 3;

-- aggregate functions
select count(sr_no) from flat;
select avg(contact) from flat;
select max(contact) from flat;
select min(contact) from flat;
select sum(contact) from flat;
delete from class where sr_no=6;

-- like (pattern matching)

select * from class where s_name like 'v%';
select * from class where branch like '_e%';

-- in
select * from class where branch in ("Info Tech" , "ENTC" , "Mechanical");

-- not in
select * from class where branch not in ("Info Tech");

-- between
select * from class where sr_no between 2 and 4;

-- not between
select * from class where sr_no not between 2 and 4;

-- index
create index index1 on class (sr_no , s_name);


-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------
drop function get_name;
use hr;

DELIMITER //
	create function get_name(id int)
    returns varchar(50)
    deterministic
    begin
		declare emp_name varchar(50);
        select concat(first_name," ",last_name) into emp_name from employees where employee_id=id;
        return emp_name;
	end;
DELIMITER

drop function get_total_sal_manager;

select get_name(101);
