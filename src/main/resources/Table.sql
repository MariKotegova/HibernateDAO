create schema if not exists hibernate;

create table if not exists hibernate.PERSONS(
    name varchar(255) NOT NULL ,
    surname varchar(255) NOT NULL ,
    age int NOT NULL ,
    phone_number varchar(255),
    city varchar(255),
    primary key (name, surname,age)
    );