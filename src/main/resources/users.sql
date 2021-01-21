create table users
( 
userId varchar(30) not null primary key,
password varchar(100) not null,
username varchar(100)
);
insert into users values ('admin', 'admin','wonjae');
commit;