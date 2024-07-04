use clinica;

-- tabelas --

select * from medicamentoPresc;
select * from receita;
select * from telefone;
select * from PossuiEspecialidade;
select * from consulta;
select * from especialidade;
select * from paciente;
select * from medico;

-- consultas --

select m.crm as CRM, m.estadoCrm as UF, m.nomeMed as Nome, e.nomeEspecialidade as Especialidade
	from medico as m
		inner join especialidade as e
			on e.idEspecialidade = m.crm;

drop view medico_especialidade_cardiologia;

create view medico_especialidade_cardiologia (nomeMed, crm, estadoCrm)
	as select m.nomeMed, m.crm, m.estadoCrm from medico as m, possuiespecialidade as pe
    where m.crm = pe.numeroCrm and pe.idEspecialidade = 3;
    
select * from medico_especialidade_cardiologia;

select p.idPaciente, p.nomePaciente,p.cidade,p.estado, p.cep, p.sexo from paciente as p
	where nomePaciente like '%Antonio%' group by nomePaciente asc;