-- create a student table (rollno , name, marks) 
-- where rollno needs to be auto generated
CREATE TABLE student(rollno INT PRIMARY KEY AUTO_INCREMENT,name VARCHAR(100),marks DECIMAL(5,2));

INSERT INTO student VALUES("Anil",50);
-- error Column count doesn't match value count at row 1

INSERT INTO student(name,marks) VALUES("Anil",50);
INSERT INTO student(name,marks) VALUES("Mukesh",55);
INSERT INTO student(name,marks) VALUES("Ramesh",60);
INSERT INTO student(name,marks) VALUES("Suresh",65);
INSERT INTO student(name,marks) VALUES("Suresh",70);
INSERT INTO student(name,marks) VALUES("Ram",60);

-- update the roll no of ramesh to 4
UPDATE student SET rollno = 4 WHERE name = "Ramesh"; ---error occur duplicate entry 4 for key 'student_primary key

-- add the student sham with no marks
INSERT INTO student(name) VALUES ("sham");
