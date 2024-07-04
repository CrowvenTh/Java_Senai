-- drop database clinica;

create schema if not exists Clinica default character set utf8;
use Clinica;

create table if not exists medico (
	crm bigint not null,
    estadoCrm char(2) not null,
    nomeMed varchar(100) not null,
		constraint medico_pk primary key(crm, estadoCrm)
)Engine = InnoDB;

create table if not exists paciente (
	idPaciente int not null auto_increment,
    sexo enum('M','F') not null,
    cidade varchar(30) not null,
    estado char(2) not null,
    complemento varchar(100),
    cep bigint not null,
    nascimento date,
    nomePaciente varchar(100) not null,
		constraint paciente_pk primary key(idPaciente)
)engine = InnoDB;

create table if not exists especialidade (
	nomeEspecialidade varchar(30) not null,
    idEspecialidade int not null auto_increment,
		constraint especialidade_pk primary key(idEspecialidade)
)engine = InnoDB;

create table if not exists consulta (
	idConsulta int not null auto_increment,
    datahora timestamp not null,
    crm bigint not null,
    estadoCrm char(2) not null,
    idPaciente int not null,
		constraint consulta_pk primary key (idConsulta),
		constraint consulta_medico_fk foreign key (crm, estadoCrm) references medico(crm, estadoCrm)
			on delete cascade,
		constraint consulta_paciente_fk foreign key (idPaciente) references paciente (idPaciente)
			on delete cascade
)engine = InnoDB;

create table telefone (
	telefone decimal(11) not null,
    idPaciente int not null,
		constraint telefone_uk unique(telefone, idPaciente),
        constraint telefone_paciente_fk foreign key (idPaciente) references paciente (idPaciente)
			on delete cascade
) engine = InnoDB;

create table PossuiEspecialidade (
	idEspecialidade int not null,
    numeroCrm bigint not null,
    estadoCrm char(2) not null,
		constraint Possui_Especialidade_uk unique (idEspecialidade, numeroCrm, estadoCrm),
        constraint possui_medico_fk foreign key (numeroCrm, estadoCrm) references medico(crm, estadoCrm)
			on delete cascade,
            constraint Possui_Especialidade_fk foreign key (idEspecialidade) references especialidade(idEspecialidade)
)engine = InnoDB;

create table receita (
	idReceita int not null auto_increment,
    idConsulta int not null,
    descricao varchar(100) not null,
		constraint idReceita_pk primary key (idReceita),
		constraint idConsulta_fk foreign key (idConsulta) references consulta(idConsulta)
		on delete cascade
)engine = InnoDB;

create table medicamentoPresc(
	medicamento varchar(50) not null,
    idReceita int not null,
		constraint idReceita_fk foreign key (idReceita) references receita(idReceita)
        on delete cascade
) engine = InnoDB;

show tables;