create database campeonato;

use campeonato;

create table login (
id long ,
nome varchar(30),
senha varchar(30)

);


select * from login;

insert into login (nome, senha) values ("admin", "admin");

create table jogos (

id long,
nome varchar(30),
genero varchar(30),
desenvolvedora varchar(30),
publicadora varchar(30),
anoComprado int,
anoJogo int,
preco double,
quantidade varchar(30)

);

select * from jogos;

delete from jogos where nome='lucas';

drop table local;


create table consoles (

id long,
nome varchar(30),
preco double,
dtLancamento date,
produtora varchar(30),
versao varchar(30)


);
