use Papelaria;
show tables;
select * from funcionario;
select * from cliente;
select * from fornecedor;
select * from produto;

insert into funcionario (matricula, nome, endereco, funcao, email) values
	(null, 'Carlos Alberto Soares','Asa Sul','Gerente','carlos@gmail.com'),
    (null, 'Maria Fattola','Ceilandia ','Assistente','maria@gmail.com'),
    (null, 'Ana Maria Oliveira', 'Águas Claras', 'Vendedor', 'ana.maria@email.com'),
	(null, 'Fernando Santos', 'Taguatinga', 'Coordenador de Vendas', 'fernando.santos@email.com'),
	(null, 'Mariana Silva', 'Sudoeste', 'vendedor', 'mariana.silva@email.com');
    
insert into cliente (cpf, nome, email, endereco) values
	(35499988856, 'Gabriela Rocha', 'gabirock@gmail.com','Gama'),
	(12345678901, 'João da Silva', 'joaosilva@email.com', 'Ceilândia'),
	(98765432102, 'Aline Santos', 'aline_santos@email.com', 'Recanto das Emas'),
	(45678912303, 'Lucas Oliveira', 'lucas.oliveira@email.com', 'Santa Maria'),
	(56789012305, 'Carla Souza', 'carla.souza@email.com', 'Samambaia');

insert into fornecedor (cnpj, nome, telefone, email, endereco) values
	(87986124000110,'Marcelo papeis',69188887777,'marpel@gmail.com','Samambaia'),
	(98765432000143, 'Rodrigo Soluções', 6198765432, 'rodrigo.solucoes@email.com', 'Ceilândia'),
	(12345678000198, 'Ana Importações', 6187654321, 'ana.importacoes@email.com', 'Águas Claras'),
	(45678901234567, 'Paulo Comércio', 6143219876, 'paulo.comercio@email.com', 'Gama'),
	(98765432000125, 'Mariana Papelaria', 6198765432, 'mariana.papelaria@email.com', 'Plano Piloto');

insert into produto (codigo, nome, preco, descricao, validade, quantidade, cnpj) values 
	(null,'Tesoura',4.99,'sem ponta',null,68,98765432000125),
    (null,'Caderno',18.99,'sem pauta',null,35,45678901234567),
    (null, 'Calculadora',22.50,'de bolso',null,40,12345678000198),
    (null,'Cola',7.80,'em bastão','2030-04-22',80,98765432000143),
    (null, 'Resma',14.85,'500 páginas',null,15,87986124000110);
    