DELIMITER $$
create procedure get_all_data()
begin
select * from employees;
end;
DELIMITER

call get_all_data;