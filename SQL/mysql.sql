create database finaltest;
use finaltest;

create table classroom(
  id int primary key auto_increment,
  classroom varchar(255)
);

create table student(
    id int primary key auto_increment,
    name varchar(255),
    birth date,
    address varchar(255),
    phone varchar(255),
    email varchar(255),
    class_id int,
    foreign key (class_id) references classroom(id)
);