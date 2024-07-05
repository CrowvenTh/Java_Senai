use papelaria;

show tables;
select * from funcionario;
select * from cliente;
select * from fornecedor;
select * from produto;
select * from venda;
select * from listarProdutos;

select p.nome as 'Produto',sum(p.preco * lp.qtdVendido)as 'Total' , sum(lp.qtdVendido) as 'Quantidade'
	from produto p 
		inner join listarProdutos lp
			on p.codigo = lp.codigo
				group by p.nome;


select p.nome, p.preco, f.nome, p.quantidade
	from produto as p, funcionario as f
		inner join listarProdutos as lp
			on p.codigo = lp.codigo;