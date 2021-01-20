create table users
( 
userid varchar(30) not null primary key,
username varchar(100) not null,
gender varchar(10),
city varchar(30)
);
insert into users values ('wonjae', 'wonjaeG', 'male', 'Boseong');
commit;