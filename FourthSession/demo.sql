# Single line comments

/*
this 
is multiline comment
*/

/*DDL*/

create database demo;
use demo;

alter database demo
character set latin1
collate latin1_swedish_ci;

# drop
drop database demo;

# Table
create table course (
	id int primary key,
    title varchar(20)
);

create table student (
	id int primary key,
    fullname varchar(20) not null,
    course_id int not null,
    phone_number char(10) unique,
    foreign key(course_id) references course(id)
    
); 

create table teacher (
	id int primary key auto_increment,
    fullname char(20) 
);

show tables;

alter table student
modify column phone_number char(11);


/* DML */
insert into course(id, title) values(1, "Python");
insert  into course(title, id) values("Machine Learning", 2);

insert into course values(3,"Django");
insert into course values(4, "Java");

/*Select data*/

select id,title from course;
select * from course;

/*Delete data*/
delete from course where id = 1;

update course set title = "AWS" where id = 2;

update course set id = 1 where title = "Django";

/*DCL*/

create user 'test'@'localhost' identified by 'password';
drop user 'test'@'localhost';
SELECT user,authentication_string,plugin,host FROM mysql.user;

FLUSH PRIVILEGES;

SELECT * FROM mysql.user;

CREATE USER 'root'@'%' IDENTIFIED BY 'root';
GRANT ALL ON *.* TO 'root'@'%' WITH GRANT OPTION;

FLUSH PRIVILEGES;


