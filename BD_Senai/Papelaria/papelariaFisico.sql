drop database papelaria;

create schema if not exists papelaria default character set utf8;
use papelaria;

create table if not exists funcionario (
	matricula int not null unique auto_increment,
    nome varchar(50) not null,
    endereco varchar(50) not null,
    funcao varchar (20) not null,
    email varchar(70) not null,
		constraint funcionario_pk primary key (matricula)
) engine = InnoDB;

create table if not exists cliente (
	cpf decimal(11) unique not null,
    nome varchar (50) not null,
    email varchar(70) not null,
    endereco varchar(50) not null,
		constraint cliente_pk primary key (cpf)
) engine = InnoDB;

create table if not exists fornecedor (
	cnpj bigint unique not null,
    nome varchar(50) not null,
    telefone decimal(11) not null,
    email varchar(70) not null,
    endereco varchar(50) not null,
		constraint fornecedor_pk primary key (cnpj)
) engine = Innodb;

create table if not exists produto (
	codigo int unique not null auto_increment,
    nome varchar(50) not null,
    preco double not null,
    descricao varchar(50) not null,
    validade date,
    quantidade int not null,
    cnpj bigint not null,
		constraint produto_pk primary key (codigo),
        constraint fornecedor_produto_fk foreign key (cnpj) references fornecedor(cnpj)
			on delete cascade
) engine = InnoDB;

create table venda (
	id int unique not null auto_increment,
    matricula int  not null,
    cpf decimal(11) not null,
		constraint venda_pk primary key (id),
        constraint funcionario_venda_pk foreign key (matricula) references funcionario(matricula),
        constraint cliente_venda_fk foreign key (cpf) references cliente(cpf)
) engine = InnoDB;

create table if not exists listarProdutos (
	codigo int not null,
    produtoNome varchar(30) not null,
    produtoQtd int not null,
		constraint produtoNome_uk unique (produtoNome, codigo),
        constraint listarProduto_fk foreign key (codigo) references produto(codigo)
) engine  InnoDB;