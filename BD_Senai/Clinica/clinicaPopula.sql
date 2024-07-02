use Clinica;

insert into medico (crm, estadoCrm, nomeMed) values
(123456,'DF', 'Augusto Moraes Sales'),
(654321,'PA','Miranda Casades Botella'),
(768593,'DF','Carlos Mandrake feiosa');
select * from medico;

insert into paciente(idPaciente, sexo, cidade, estado, complemento, cep, nascimento, nomePaciente) values
(null,'F','Abaitetuba','PA','Rua 4', 12345678,'2000-09-30','Melissa Almeida'),
(null, 'M','Taguatinga','DF','Avenida 8', 87654321, '1998-11-28','Antonio Gomes'),
(null, 'F','Samambaia','DF','Quadra 520', 75869483,'1995-10-12','Rafaela Duarte Lima');
select * from paciente;

show tables;

insert into especialidade(nomeEspecialidade, idEspecialidade) values
('Ortopedia',null),
('Dentista',null),
('Cardiologia',null);
select * from especialidade;

insert into consulta(idConsulta, datahora, crm, estadoCrm, idPaciente) values
(null, '2024-06-29 16:50:30','123456','DF',2),
(null, '2024-07-01 14:20:45','654321','PA',3),
(null, '2024-06-30 13:45:44','768593','DF',1); 
select * from consulta;

insert into telefone(telefone, idPaciente) values
(61988889999, 1),
(61909907667, 2),
(61923345446, 3);
select * from telefone;
select * from PossuiEspecialidade;
insert into PossuiEspecialidade (idEspecialidade, numeroCrm, estadoCrm) values
(1, 123456, 'DF'),
(2, 654321, 'PA'),
(3, 768593, 'DF');

select m.crm as CRM, m.estadoCrm as UF, m.nomeMed as Nome, e.nomeEspecialidade as Especialidade
	from medico as m
		inner join especialidade as e
			on e.idEspecialidade = m.crm;