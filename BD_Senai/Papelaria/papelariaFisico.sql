-- drop database papelaria;

create schema if not exists papelaria default character set utf8;
use papelaria;

create table if not exists funcionario (
	matricula int not null auto_increment,
    nome varchar(50) not null,
    endereco varchar(50) not null,
    funcao varchar (20) not null,
    email varchar(70) not null,
		constraint funcionario_pk primary key (matricula)
) engine = InnoDB, auto_increment = 1000;

create table if not exists cliente (
	cpf decimal(11) unique not null,
    nome varchar (50) not null,
    email varchar(70) not null,
    endereco varchar(50) not null,
		constraint cliente_pk primary key (cpf)
) engine = InnoDB;

create table if not exists fornecedor (
	cnpj varchar(18) not null,
    nome varchar(50) not null,
    telefone decimal(11) not null,
    email varchar(70) not null,
    endereco varchar(50) not null,
		constraint fornecedor_pk primary key (cnpj)
) engine = Innodb;

create table if not exists produto (
	codigo int not null auto_increment,
    nome varchar(50) not null,
    preco decimal(7,2) not null,
    descricao varchar(50) not null,
    validade date,
    quantidade int not null,
    cnpj varchar(18) not null,
		constraint produto_pk primary key (codigo),
        constraint produto_fornecedor_fk foreign key (cnpj) references fornecedor(cnpj)
			on delete cascade
) engine = InnoDB, auto_increment = 100;

create table venda (
	id int not null auto_increment,
    matricula int not null,
    cpf decimal(11) not null,
		constraint venda_pk primary key (id),
        constraint venda_funcionario_pk foreign key (matricula) references funcionario(matricula)
			on delete cascade,
        constraint venda_cliente_fk foreign key (cpf) references cliente(cpf)
			on delete cascade
) engine = InnoDB, auto_increment = 10000;

create table if not exists listarProdutos (
	id int not null,
    codigo int not null,
    qtdVendido int not null,
		constraint listarProdutos_venda_fk foreign key (id) references venda(id)
			on delete cascade,
        constraint listarProduto_produto_fk foreign key (codigo) references produto(codigo)
			on delete cascade
) engine = InnoDB;
