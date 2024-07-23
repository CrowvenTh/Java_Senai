use Papelaria;

INSERT INTO funcionario (nome, endereco, funcao, email) VALUES
('Ana Oliveira', 'Quadra 301, Águas Claras', 'Vendedora', 'ana.oliveira@example.com'),
('Carlos Santos', 'Quadra 602, Samambaia', 'Atendente', 'carlos.santos@example.com'),
('Mariana Costa', 'Avenida JK, Taguatinga', 'Estoquista', 'mariana.costa@example.com'),
('Pedro Rodrigues', 'Quadra 202, Ceilândia', 'Caixa', 'pedro.rodrigues@example.com'),
('Juliana Silva', 'Rua das Flores, Sobradinho', 'Auxiliar de Vendas', 'juliana.silva@example.com'),
('Lucas Souza', 'Quadra 102, Gama', 'Gerente de Loja', 'lucas.souza@example.com'),
('Fernanda Almeida', 'Rua 10, Vicente Pires', 'Operadora de Caixa', 'fernanda.almeida@example.com'),
('Rafaela Pereira', 'Quadra 503, Recanto das Emas', 'Consultor de Vendas', 'rafaela.pereira@example.com'),
('Gustavo Lima', 'Avenida dos Pioneiros, Valparaíso de Goiás', 'Assistente Administrativo', 'gustavo.lima@example.com'),
('Isabela Santos', 'Quadra 601, Águas Lindas de Goiás', 'Supervisor de Estoque', 'isabela.santos@example.com'),
('Marcos Oliveira', 'Quadra 102, Luziânia', 'Atendente de Papelaria', 'marcos.oliveira@example.com'),
('Tatiana Costa', 'Quadra 201, Planaltina', 'Vendedor Externo', 'tatiana.costa@example.com'),
('Daniel Ferreira', 'Quadra 402, Sobradinho II', 'Gerente de Filial', 'daniel.ferreira@example.com'),
('Camila Alves', 'Rua 8, Águas Claras', 'Estoquista', 'camila.alves@example.com'),
('Roberto Santos', 'Quadra 303, Samambaia', 'Auxiliar Administrativo', 'roberto.santos@example.com'),
('Patrícia Silva', 'Rua das Palmeiras, Taguatinga', 'Atendente de Caixa', 'patricia.silva@example.com'),
('Fábio Oliveira', 'Quadra 501, Ceilândia', 'Consultor de Vendas', 'fabio.oliveira@example.com'),
('Aline Costa', 'Avenida JK, Gama', 'Vendedora de Papelaria', 'aline.costa@example.com'),
('Bruno Souza', 'Quadra 202, Recanto das Emas', 'Auxiliar de Loja', 'bruno.souza@example.com'),
('Larissa Santos', 'Rua das Violetas, Valparaíso de Goiás', 'Assistente de Compras', 'larissa.santos@example.com');
    
    select * from produto;
    
INSERT INTO cliente (cpf, nome, email, endereco) VALUES
(12345678901, 'João da Silva', 'joao.silva@example.com', 'Quadra 301, Águas Claras'),
(23456789012, 'Maria Santos', 'maria.santos@example.com', 'Quadra 602, Samambaia'),
(34567890123, 'Carlos Oliveira', 'carlos.oliveira@example.com', 'Avenida JK, Taguatinga'),
(45678901234, 'Ana Souza', 'ana.souza@example.com', 'Quadra 202, Ceilândia'),
(56789012345, 'Paula Lima', 'paula.lima@example.com', 'Rua das Flores, Sobradinho'),
(67890123456, 'Lucas Rodrigues', 'lucas.rodrigues@example.com', 'Quadra 102, Gama'),
(78901234567, 'Fernanda Costa', 'fernanda.costa@example.com', 'Rua 10, Vicente Pires'),
(89012345678, 'Rafael Santos', 'rafael.santos@example.com', 'Quadra 503, Recanto das Emas'),
(90123456789, 'Gustavo Oliveira', 'gustavo.oliveira@example.com', 'Avenida dos Pioneiros, Valparaíso de Goiás'),
(10234567890, 'Isabela Silva', 'isabela.silva@example.com', 'Quadra 601, Águas Lindas de Goiás'),
(11223344556, 'Marcos Almeida', 'marcos.almeida@example.com', 'Quadra 102, Luziânia'),
(12233445567, 'Tatiana Costa', 'tatiana.costa@example.com', 'Quadra 201, Planaltina'),
(13243546578, 'Daniel Pereira', 'daniel.pereira@example.com', 'Quadra 402, Sobradinho II'),
(14253647589, 'Camila Santos', 'camila.santos@example.com', 'Rua 8, Águas Claras'),
(15263748590, 'Roberto Costa', 'roberto.costa@example.com', 'Quadra 303, Samambaia'),
(16273849501, 'Patrícia Oliveira', 'patricia.oliveira@example.com', 'Rua das Palmeiras, Taguatinga'),
(17283940512, 'Fábio Santos', 'fabio.santos@example.com', 'Quadra 501, Ceilândia'),
(18294051234, 'Aline Costa', 'aline.costa@example.com', 'Avenida JK, Gama'),
(19204162345, 'Bruno Oliveira', 'bruno.oliveira@example.com', 'Quadra 202, Recanto das Emas'),
(20214273456, 'Larissa Silva', 'larissa.silva@example.com', 'Rua das Violetas, Valparaíso de Goiás');

INSERT INTO fornecedor (cnpj, nome, telefone, email, endereco) VALUES
('12.345.678/0001-01', 'Papelaria Brasília', 6134567890, 'contato@papelariabrasilia.com', 'Quadra 301, Águas Claras'),
('23.456.789/0001-12', 'Papel e Caneta LTDA', 6145678901, 'contato@papelecaneta.com', 'Quadra 602, Samambaia'),
('34.567.890/0001-23', 'Papelaria Central', 6156789012, 'contato@papelariacentral.com', 'Avenida JK, Taguatinga'),
('45.678.901/0001-34', 'Papel e Cia', 6167890123, 'contato@papelecia.com', 'Quadra 202, Ceilândia'),
('56.789.012/0001-45', 'Papel Bom Preço', 6178901234, 'contato@papelbompreco.com', 'Rua das Flores, Sobradinho'),
('67.890.123/0001-56', 'Papelaria Ideal', 6189012345, 'contato@papelariaideal.com', 'Quadra 102, Gama'),
('78.901.234/0001-67', 'Papelaria Moderna', 6190123456, 'contato@papelariamoderna.com', 'Rua 10, Vicente Pires'),
('89.012.345/0001-78', 'Papelaria Express', 6201234567, 'contato@papelariaexpress.com', 'Quadra 503, Recanto das Emas'),
('90.123.456/0001-89', 'Papelaria Nacional', 6212345678, 'contato@papelarianacional.com', 'Avenida dos Pioneiros, Valparaíso de Goiás'),
('01.234.567/0001-90', 'Papel e Arte', 6223456789, 'contato@papelearte.com', 'Quadra 601, Águas Lindas de Goiás'),
('11.223.344/0001-56', 'Papelaria Criativa', 6234567890, 'contato@papelariacriativa.com', 'Quadra 102, Luziânia'),
('12.233.445/0001-67', 'Papelaria Alegria', 6245678901, 'contato@papelariaalegria.com', 'Quadra 201, Planaltina'),
('13.243.546/0001-78', 'Papel e Cores', 6256789012, 'contato@papelecores.com', 'Quadra 402, Sobradinho II'),
('14.253.647/0001-89', 'Papelaria Charme', 6267890123, 'contato@papelariacharme.com', 'Rua 8, Águas Claras'),
('15.263.748/0001-90', 'Papel e Estilo', 6278901234, 'contato@papeleestilo.com', 'Quadra 303, Samambaia'),
('16.273.849/0001-01', 'Papelaria Diversa', 6289012345, 'contato@papelariadiversa.com', 'Rua das Palmeiras, Taguatinga'),
('17.283.940/0001-12', 'Papel e Design', 6290123456, 'contato@papeleesign.com', 'Quadra 501, Ceilândia'),
('18.294.051/0001-23', 'Papelaria Innovare', 6301234567, 'contato@papelariainnovare.com', 'Avenida JK, Gama'),
('19.204.162/0001-34', 'Papel e Luxo', 6312345678, 'contato@papeleluxo.com', 'Quadra 202, Recanto das Emas'),
('20.214.273/0001-45', 'Papelaria Master', 6323456789, 'contato@papelariamaster.com', 'Rua das Violetas, Valparaíso de Goiás');

INSERT INTO produto (nome, preco, descricao, validade, quantidade, cnpj) VALUES
('Caderno Universitário', 15.90, 'Caderno espiral 100 folhas', '2024-12-31', 100, '12.345.678/0001-01'),
('Caneta Esferográfica', 2.50, 'Ponta média azul', NULL, 500, '23.456.789/0001-12'),
('Lápis HB', 0.80, 'Lápis preto número 2', NULL, 300, '34.567.890/0001-23'),
('Borracha Branca', 1.20, 'Borracha escolar macia', NULL, 200, '45.678.901/0001-34'),
('Marca Texto Amarelo', 3.50, 'Marca texto ponta chanfrada', NULL, 150, '56.789.012/0001-45'),
('Papel A4', 19.90, 'Papel sulfite branco 500 folhas', NULL, 50, '67.890.123/0001-56'),
('Fichário 4 Argolas', 29.90, 'Fichário com 100 folhas pautadas', '2025-06-30', 80, '78.901.234/0001-67'),
('Pasta Catálogo', 8.75, 'Pasta de plástico com 50 folhas', NULL, 120, '89.012.345/0001-78'),
('Grampeador', 12.50, 'Grampeador pequeno', NULL, 100, '90.123.456/0001-89'),
('Clips Metálicos', 1.50, 'Caixa com 100 unidades', NULL, 200, '01.234.567/0001-90'),
('Tesoura Escolar', 6.80, 'Tesoura escolar sem ponta', NULL, 80, '11.223.344/0001-56'),
('Lápis de Cor', 7.99, 'Caixa com 12 cores', NULL, 120, '12.233.445/0001-67'),
('Apontador', 2.00, 'Apontador com depósito', NULL, 150, '13.243.546/0001-78'),
('Réguas Transparentes', 3.25, 'Régua de 30 cm transparente', NULL, 100, '14.253.647/0001-89'),
('Corretivo Líquido', 4.50, 'Corretivo com pincel aplicador', NULL, 200, '15.263.748/0001-90'),
('Pasta Suspensa', 7.00, 'Caixa com 10 unidades', NULL, 60, '16.273.849/0001-01'),
('Pincéis Marcadores', 9.50, 'Caixa com 6 unidades sortidas', NULL, 80, '17.283.940/0001-12'),
('Agenda Escolar', 18.00, 'Agenda diária capa dura', '2025-01-31', 70, '18.294.051/0001-23'),
('Dossel Plástico', 5.75, 'Dossel para encadernação', NULL, 150, '19.204.162/0001-34'),
('Envelopes Brancos', 6.50, 'Pacote com 50 unidades', NULL, 100, '20.214.273/0001-45');

INSERT INTO venda (matricula, cpf) VALUES
(1000, 12345678901),
(1001, 23456789012),
(1002, 34567890123),
(1003, 45678901234),
(1004, 56789012345),
(1005, 67890123456),
(1006, 78901234567),
(1007, 89012345678),
(1008, 90123456789),
(1009, 10234567890),
(1010, 11223344556),
(1011, 12233445567),
(1012, 13243546578),
(1013, 14253647589),
(1014, 15263748590),
(1015, 16273849501),
(1016, 17283940512),
(1017, 18294051234),
(1018, 19204162345),
(1019, 20214273456);

INSERT INTO listarProdutos (id, codigo, qtdVendido) VALUES
(10000, 100, 2), 
(10000, 102, 1), 
(10001, 101, 3), 
(10001, 103, 2),
(10002, 105, 1), 
(10002, 107, 4), 
(10003, 104, 2), 
(10003, 106, 3),
(10004, 108, 5), 
(10004, 109, 1), 
(10005, 110, 2), 
(10005, 111, 2),
(10006, 112, 3), 
(10006, 113, 1), 
(10007, 114, 4), 
(10007, 115, 2),
(10008, 116, 1), 
(10008, 117, 3), 
(10009, 118, 2), 
(10009, 119, 2);
