show databases;
use db;
show tables;
select * from emp;
SELECT ENAME, JOB FROM emp WHERE SAL > 1500;

SELECT JOB,MAX(SAL)
FROM emp
GROUP BY JOB;

SELECT *, MAX(sal) OVER() as Max_Salary
FROM emp;

SELECT e.*, MAX(SAL) OVER(partition by deptno) as Max_Salary
FROM emp e;

SELECT *, MIN(sal) OVER(partition by deptno) as Max_Salary
FROM emp;

-- ROW_NUMBER()

SELECT *, ROW_NUMBER() OVER() as RN
FROM emp;

SELECT *, ROW_NUMBER() OVER(partition by deptno) as RN
FROM emp;

SELECT *, ROW_NUMBER() OVER(partition by deptno order by empno) as RN
FROM emp;

SELECT *
FROM (SELECT e.*, ROW_NUMBER() OVER(partition by job order by empno) as RN
	  FROM emp e) x
WHERE x.RN > 3;

-- RANK()

SELECT *, RANK() OVER(partition by deptno order by sal) AS RNK
FROM emp;

SELECT *
FROM (SELECT e.*, RANK() OVER(partition by deptno order by sal DESC) as RNK
	  FROM emp e) x
WHERE x.RNK > 3;

-- DENSE_RANK()

SELECT *, RANK() OVER(order by sal desc) AS RNK, dense_rank() OVER(order by sal DESC) as DENSE_RNK
FROM emp;

-- LAG()

SELECT *, LAG(sal) OVER(PARTITION BY deptno) AS Previous_Emp_Salary
FROM emp;

SELECT *, LAG(sal,2,0) OVER(partition by deptno) as Previous_Emp_Salary
FROM emp;

-- LEAD()

SELECT *, LEAD(sal) OVER(partition by deptno) AS Next_Emp_Salary
FROM emp;

-- LAG() & LEAD()
SELECT *, LAG(sal) OVER(PARTITION BY deptno) AS Previous_Emp_Salary, LEAD(sal) OVER(partition by deptno) AS Next_Emp_Salary
FROM emp;

-- Salary Comparison

SELECT e.*, LAG(sal) OVER(PARTITION BY deptno) AS Previous_Emp_Salary,
CASE WHEN e.sal > LAG(sal) OVER(PARTITION BY deptno) THEN 'Highen than previous employee'
	 WHEN e.sal < LAG(sal) OVER(PARTITION BY deptno) THEN 'Lower than previous employee'
     ELSE 'Same as previous employee'
END sal_range
FROM emp e;
