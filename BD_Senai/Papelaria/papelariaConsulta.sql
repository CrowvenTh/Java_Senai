use papelaria;

show tables;
select * from funcionario;
select * from cliente;
select * from fornecedor;
select * from produto;
select * from venda;
select * from listarProdutos;

-- total do valor dos produtos 
select p.nome as 'Produto',sum(p.preco * lp.qtdVendido)as 'Total' , sum(lp.qtdVendido) as 'Quantidade'
	from produto p 
		inner join listarProdutos lp
			on p.codigo = lp.codigo
				group by p.nome;
                
-- nome dos funcionarios e sua funções                
select f.nome, f.funcao
	from funcionario as f
		inner join venda as v
			on f.matricula = v.matricula
				group by f.nome;
        
-- exemplo de left join        
select v.id, v.matricula, v.cpf
	from venda v
		left join funcionario f
			on v.matricula = f.matricula;
            
-- Qual fornecedor teve mais produtos vendidos ? -- 
select f.nome as 'Nome', p.nome as 'Produto', lp.qtdVendido as 'Quantidade'
	from fornecedor as f
		inner join produto as p
			on f.cnpj = p.cnpj
				inner join listarProdutos as lp
					on lp.codigo = p.codigo
						 group by qtdVendido, f.nome desc;
-- correção --                          
SELECT f.nome as 'Nome Fornecedor', p.nome as 'Produto', SUM(lp.qtdVendido) as 'Quantidade'
	FROM fornecedor as f
		INNER JOIN produto as p ON f.cnpj = p.cnpj
			INNER JOIN listarProdutos as lp ON lp.codigo = p.codigo
				GROUP BY f.nome, p.nome
					ORDER BY SUM(lp.qtdVendido) DESC;
                    
select * from produto;
-- inserindo mais dados na tabela -- 
INSERT INTO produto (nome, preco, descricao, validade, quantidade, cnpj) VALUES
('Bola quadrada', 20.90, 'Infantil', '2024-12-31', 16, '12.345.678/0001-01');

-- atualizando dados da tabela -- 
update produto set nome  = 'Revolver 38', preco = 500.00 where cnpj = '12.345.678/0001-01' and codigo = 120;

-- deletando dados da tabela roduto --
delete from produto where codigo = 120;