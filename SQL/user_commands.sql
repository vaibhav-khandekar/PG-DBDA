select user from mysql.user;
show grants for vaibhav@localhost;
set password for 'prasad'@'localhost'='1234';
-- using alter
alter user 'prasad'@'localhost' identified by 'abcd';
-- using update
use mysql
update user set prasad = 

-- rename a user
rename user 'prasad'@'localhost' to 'pasaad'@'localhost';
select user from mysql.user;

-- drop user 
drop user 'sayali'@'localhost';
select user from mysql.user;

-- grant

grant all privileges on '*' to vaibhav@localhost;
show grants for vaibhav@localhost
