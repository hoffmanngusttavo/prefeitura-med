CREATE TABLE medicamentos
(
    id        bigint       not null auto_increment,
    nome      varchar(100) not null unique,
    laboratorio  varchar(200) not null,
    disponivel  tinyint  not null,
    miligramas  decimal not null,
    data_ultima_atualizacao  datetime not null,
    uuid  varchar(100) not null,

    primary key (id)
);

