`create table users
(
ID bigint not null
constraint users_id_pk
primary key,
FIRST_NAME varchar(100) not null,
LAST_NAME varchar(100) not null,
ADDRESS varchar(100) not null
);`
