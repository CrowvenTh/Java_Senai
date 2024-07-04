use Clinica;


insert into medico (crm, estadoCrm, nomeMed) values
(123456,'DF', 'Augusto Moraes Sales'),
(654321,'PA','Miranda Casades Botella'),
(768593,'DF','Carlos Mandrake feiosa');

insert into paciente(idPaciente, sexo, cidade, estado, complemento, cep, nascimento, nomePaciente) values
(null,'F','Abaitetuba','PA','Rua 4', 12345678,'2000-09-30','Melissa Almeida'),
(null, 'M','Taguatinga','DF','Avenida 8', 87654321, '1998-11-28','Antonio Gomes'),
(null, 'F','Samambaia','DF','Quadra 520', 75869483,'1995-10-12','Rafaela Duarte Lima'),
(NULL, 'M', 'Taguatinga', 'DF', 'Rua das Flores', 98765432, '1988-05-20', 'Pedro Antonio Silva'),
(NULL, 'F', 'Plano Piloto', 'DF', 'SHS Quadra 6', 65432109, '1992-12-15', 'Carolina Santos Antonio'),
(NULL, 'M', 'Ceilândia', 'DF', 'Quadra 23', 12345678, '1997-08-30', 'Marcos Antonio Oliveira'),
(NULL, 'F', 'Gama', 'DF', 'Quadra 40', 45678901, '1985-04-25', 'Juliana Antonio Pereira');

insert into especialidade(nomeEspecialidade, idEspecialidade) values
('Ortopedia',null),
('Dentista',null),
('Cardiologia',null);

insert into consulta(idConsulta, datahora, crm, estadoCrm, idPaciente) values
(null, '2024-06-29 16:50:30','123456','DF',2),
(null, '2024-07-01 14:20:45','654321','PA',3),
(null, '2024-06-30 13:45:44','768593','DF',1); 

insert into telefone(telefone, idPaciente) values
(61988889999, 1),
(61909907667, 2),
(61923345446, 3);

insert into PossuiEspecialidade (idEspecialidade, numeroCrm, estadoCrm) values
(1, 123456, 'DF'),
(2, 654321, 'PA'),
(3, 768593, 'DF');

insert into receita (idReceita, idConsulta, descricao) values
(null, 1, '2x por dia'),
(null, 2, '12h em 12h'),
(null,3,'1 por semana');

insert into medicamentoPresc (medicamento, idReceita) values
('Nosvalgina',1),
('Dorflex',2),
('Torcilax',3);