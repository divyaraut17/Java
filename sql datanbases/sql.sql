--- to connect with the mysql---
mysql -u root -p

---- to check all the existing databases---
SHOW DATABASES;

--create a database---
CREATE DATABASE dkte_db;

----uSE dATABASES----
USE dkte_db;

-- to display all the tables inside the database--
SHOW TABLES; --NOTING ADDED IN TABLES SO IT SHOW EMPTY SET

-- create a student table (rollno , name, marks) 
CREATE TABLE student(rollno INT,name CHAR(10),marks DECIMAL(5,2));

-- add the dummy data inside the student
INSERT INTO student VALUES(1,"Divya",90);
INSERT INTO student VALUES(2,"Shrusti",98);
INSERT INTO student VALUES(3,"Suhana",77);
INSERT INTO student VALUES(4,"Aditya",30);
INSERT INTO student VALUES(5,"Ram",60);
INSERT INTO student VALUES(6,"Amay",80);

-- display all the contents from the table
SELECT *  FROM student;

-- delete the student with rollno 4
DELETE FROM student WHERE rollno=4;

-- delete the student having marks = 60
DELETE FROM student WHERE marks=60;

-- update the marks of ram to 75
UPDATE student set marks=75 WHERE name="Ram";

-- delete the student having marks = 75
DELETE FROM student WHERE marks = 75 ;