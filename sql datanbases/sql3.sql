-- create a database classwork_db;
CREATE DATABASE classwork_db;

USE classwork_db;

SOURCE <path to the db file>

SHOW TABLES;

--SELECT
-- 1. select all the data from the BOOK table
SELECT * FROM books;
-- 1. select all the data from the EMP table
SELECT * FROM emp;
-- 1. select all the data from the DEPSAL table
SELECT * FROM salgrade;
-- 1. select all the data from the DEP table
SELECT * FROM dept;

-- 2. display only the empno,ename and salary of all emps
 SELECT empno,ename,sal FROM emp;

-- 3. display empname and commission.
SELECT ename,comm from emp;

--4. display all the jobs from emp table.
SELECT job FROM emp;

-- 5. find unique jobs in the organization
SELECT DISTINCT job from emp;

-- 5. find deptno in the organization
SELECT deptno FROM emp;

-- 5. find unique depno in the organization
SELECT DISTINCT deptno FROM emp;

-- display deptno and job from the emp table;
SELECT deptno,job from emp;

-- display unique jobs in every dept
SELECT DISTINCT deptno,job from