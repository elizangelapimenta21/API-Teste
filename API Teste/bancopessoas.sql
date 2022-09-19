create database pessoas;
use pessoas;
create table pessoas(
id integer auto_increment primary key,
nome_completo varchar(200) not null,
cpf varchar(11) not null,
data_nascimento varchar(8) not null,
email varchar(50) not null,
);

insert into pessoas values (null, 'Elizangela', '999999999', '04/07/1990', 'elizangela@gmail.com');

select * from pessoas;

