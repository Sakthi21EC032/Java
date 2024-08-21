create database stu
use stu
CREATE TABLE stu(
rollno INT PRIMARY KEY,
sname VARCHAR(59),
age INT,
gender VARCHAR(10),
course VARCHAR(50)
);
SELECT * FROM stu;
INSERT INTO stu (rollno,sname,age,gender,course)
VALUES(113,'sakthi',20,'male','ECE'),
(126,'Kishore',20,'Male','CSE'),
(172,'Kowsik',21,'Male','IT');

UPDATE stu
SET Age=21,course='Physics'
WHERE rollno=126;

DELETE FROM stu
WHERE rollno=172;

