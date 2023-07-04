use db;
create table A
(f_name varchar(20) not null,
 dob date not null,
 address varchar(50) not null);
 
 create table B
(l_name varchar(20) not null,
 dob date not null,
 address varchar(50) not null);
 
insert into A(f_name, dob, address) values
('vaibhav','2001-04-18','malad west, mumbai 64'),
('surya','1998-02-05','JK, india');
 
insert into B(l_name, dob, address) values
('jamwal','1998-02-05','JK, india'),
('khandekar','2001-04-18','malad west, mumbai 64');

select a.f_name, b.l_name
from A a, B b
where a.dob = b.dob and a.address = b.address;

-- -------------------------------------------------------------------------------

create table AA(first int);
create table BB(second);

SELECT fir
FROM AA
LEFT JOIN BB
ON AA.fir = BB.sec;