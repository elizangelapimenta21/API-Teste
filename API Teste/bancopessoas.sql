create database pessoas;
use pessoas;
create table pessoa(
id integer auto_increment primary key,
nome_completo varchar(200) not null,
cpf varchar(11) not null,
data_nascimento date not null,
email varchar(50) not null
);

insert into pessoa values (null, 'Elizangela', '999999999', '1990-07-04', 'elizangela@gmail.com');

select * from pessoas;

