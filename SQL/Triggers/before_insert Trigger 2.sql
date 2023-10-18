DELIMITER //
create trigger to_check_emp_id
before insert on employees 
for each row
begin
	if exists (select * from employees where employee_id = new.employee_id) then
		signal sqlstate '45000' set message_text='Already existing employee_id';
	end if;
end;
DELIMITER

INSERT INTO `employees` (`EMPLOYEE_ID`, `FIRST_NAME`, `LAST_NAME`, `contact_no`, `HIRE_DATE`, `JOB_ID`, `SALARY`, `COMMISSION_PCT`, `MANAGER_ID`, `DEPARTMENT_ID`) VALUES
('100', 'Steven', 'King','515.123.4567', '1987-06-17', 'AD_PRES', '+24000', '0.00', '0', '90');
