DELIMITER //
create procedure insert_into_new(inout result int , in x int , in y int)
begin
	set result=x+y;
end;
DELIMETER

call insert_into_new(@result,5,7);
select @result;