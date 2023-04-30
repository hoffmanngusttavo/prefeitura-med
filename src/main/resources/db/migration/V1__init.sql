
CREATE TABLE ubs
(
    id        bigint       not null auto_increment,
    nome      varchar(100) not null unique,
    uuid  varchar(100) not null unique,
    telefone  varchar(15)  not null,
    logradouro  varchar(200) not null,
    bairro  varchar(200) not null,

    primary key (id)
);

CREATE TABLE medicamentos
(
    id        bigint       not null auto_increment,
    nome      varchar(100) not null ,
    laboratorio  varchar(200) not null,
    disponivel  tinyint  not null,
    miligramas  decimal not null,
    data_ultima_atualizacao  datetime not null,
    uuid  varchar(100) not null,
    ubs_id bigint   not null,

    primary key (id),
    constraint fk_medicamentos_ubs_id foreign key (ubs_id) references ubs (id)
);

