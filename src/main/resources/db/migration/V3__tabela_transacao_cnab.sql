CREATE TABLE transacao
(
    id        bigserial       PRIMARY KEY,
    tipo      bigint       not null,
    data      date         not null,
    valor     decimal      not null,
    cpf       bigint       not null,
    cartao    varchar(100) null,
    hora      time         not null,
    dono_loja varchar(255) not null,
    nome_loja varchar(255) not null
);

