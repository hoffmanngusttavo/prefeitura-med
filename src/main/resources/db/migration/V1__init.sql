
CREATE TABLE ubs
(
    id        bigserial       PRIMARY KEY,
    nome      varchar(100) not null unique,
    uuid  varchar(100) not null unique,
    telefone  varchar(15)  not null,
    logradouro  varchar(200) not null,
    bairro  varchar(200) not null
);

CREATE TABLE medicamentos
(
    id        bigserial       PRIMARY KEY,
    nome      varchar(100) not null ,
    laboratorio  varchar(200) not null,
    disponivel  boolean  not null,
    miligramas  decimal not null,
    data_ultima_atualizacao  timestamp not null,
    uuid  varchar(100) not null unique,
    ubs_id bigint   not null,

    constraint fk_medicamentos_ubs_id foreign key (ubs_id) references ubs (id)
);

