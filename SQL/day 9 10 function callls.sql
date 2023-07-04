use hr;
-- set gobal log_bin_trust_function_creators=1;
select get_emp_name(101);
--

select get_total_sal_manager(101);
--

select get_sal("neena","kochhar");
--

select get_dept();
--

select * from employees
order by salary desc;
--

select get_list(17000.00);
--

select get_emp();

select get_exp(101);
select get_exp2(102);

select year(end_date) - year(start_date)
		from job_history
		where employee_id=101;
        
select * from job_history;
-- ------------------------------------------------------------------------------------------------------------------------------------------------------

select get_emp_experience(102);
-- -------------------------------------------------------------------------------------------------------------------------------------------------------------

