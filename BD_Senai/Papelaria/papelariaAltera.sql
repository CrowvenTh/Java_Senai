use papelaria;
-- criando mais uma coluna de telefone 
alter table cliente add column telefone decimal(11);

-- inserindo o telefone de um clinete
update cliente set telefone = 61983457677 where cpf = 12345678901;

-- atualizando os dados do telefone 
update cliente set telefone = 61911112222 where cpf = 12345678901;

-- atualizando os dados do telefone II
update cliente set telefone = 61911112222 where endereco like '%Águas%';

-- apagando a coluna criada
alter table cliente drop telefone;

-- renomeando o campo telefone da tabela cliente 
alter table cliente change column telefone telefoneCliente decimal(11);

select * from cliente where endereco like '%Águas%';
select * from cliente;
select * from produto;

-- inserindo mais dados na tabela -- 
INSERT INTO produto (nome, preco, descricao, validade, quantidade, cnpj) VALUES
('Bola quadrada', 20.90, 'Infantil', '2024-12-31', 16, '12.345.678/0001-01');

-- atualizando dados da tabela -- 
update produto set nome  = 'Revolver 38', preco = 500.00 where cnpj = '12.345.678/0001-01' and codigo = 120;

-- deletando dados da tabela roduto --
delete from produto where codigo = 120;

-- deletando os produtos cujo valor é menor que R$6,00
delete from produto where preco < 6 and cnpj = '23.456.789/0001-12';

select * from produto where preco < 6 and cnpj = '23.456.789/0001-12';

-- atribuindo 10% sobre o preço de caderno

update produto set preco = preco * 0.10 where nome like '%lapis%' or nome like '%borracha%' or nome like '%caneta%';

select * from produto;