create database finaltest;
use finaltest;
drop table student;

create table classroom(
  id int primary key auto_increment,
  name varchar(255)
);

create table student(
    id int primary key auto_increment,
    name varchar(255),
    birth date,
    address varchar(255),
    phone varchar(255),
    email varchar(255),
    class_id int,
    foreign key (class_id) references classroom(id),
    status varchar(255) default 'on'
);
# Class:
select * from classroom;
insert into classroom (name) values ('English Class');
insert into classroom (name) values ('Germany Class');
insert into classroom (name) values ('Japanese Class');
insert into classroom (name) values ('Korean Class');
# Student
select * from student;
insert into student (name, birth, address, phone, email, class_id) VALUES ('DucAnh','2000-08-22','HN','0969282458','DucAnh@gmail.com',3);
