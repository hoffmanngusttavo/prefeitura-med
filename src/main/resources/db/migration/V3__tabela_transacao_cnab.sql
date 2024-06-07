CREATE TABLE transacao
(
    id        bigint       not null auto_increment,
    tipo      bigint       not null,
    data      date         not null,
    valor     decimal      not null,
    cpf       bigint       not null,
    cartao    varchar(100) null,
    hora      time         not null,
    dono_loja varchar(255) not null,
    nome_loja varchar(255) not null,

    primary key (id)
);

