INSERT INTO ubs (id, nome, uuid, telefone, logradouro, bairro)
VALUES(1, 'UBS PONTE IMARUIM', 'eda22daf-8ce5-4f46-8bbd-4b33e848d4fb', '(84) 2759-1818', 'MARIANA FERNADES', 'PONTE DO IMARUIM');


INSERT INTO ubs (id, nome, uuid, telefone, logradouro, bairro)
VALUES(2, 'UBS PEDRA BRANCA', 'a36c6244-52ed-45d9-b3b7-62121a3f8fb4', '(62) 2775-2358', 'ANTONIO SILVA', 'PEDRA BRANCA');

INSERT INTO ubs (id, nome, uuid, telefone, logradouro, bairro)
VALUES(3, 'UBS CAMINHO NOVO', '0e3176c7-28b9-4e0e-a2e2-939d11f84172', '(88) 2553-2523', 'PEDRO MORAIS', 'CAMINHO NOVO');




INSERT INTO medicamentos (nome, laboratorio, disponivel, miligramas, data_ultima_atualizacao, uuid, ubs_id)
VALUES('Bacitracina', 'Santa', true, 10, now(), '5f706abc-8a4c-4ff7-b7b6-ad55fa29229c', 1);

INSERT INTO medicamentos (nome, laboratorio, disponivel, miligramas, data_ultima_atualizacao, uuid, ubs_id)
VALUES('Baclofeno', 'Santa', true, 10, now(), 'c9cbe021-463c-4e7f-af51-a367b478ff83', 1);

INSERT INTO medicamentos (nome, laboratorio, disponivel, miligramas, data_ultima_atualizacao, uuid, ubs_id)
VALUES('Betanecol', 'Santa', true, 10, now(), '933b50d2-1287-42d2-b13a-17be1ddca504', 1);

INSERT INTO medicamentos (nome, laboratorio, disponivel, miligramas, data_ultima_atualizacao, uuid, ubs_id)
VALUES('Cantaridina', 'Santa', true, 10, now(), 'ae054991-ca9f-4dbb-9708-c0d9a9d1690e', 1);

INSERT INTO medicamentos (nome, laboratorio, disponivel, miligramas, data_ultima_atualizacao, uuid, ubs_id)
VALUES('Bacitracina', 'Santa', true, 10, now(), '5f706abc-8a4c-4ff7-b7b6-ad55fa29229e', 2);

INSERT INTO medicamentos (nome, laboratorio, disponivel, miligramas, data_ultima_atualizacao, uuid, ubs_id)
VALUES('Baclofeno', 'Santa', true, 10, now(), 'c9cbe021-463c-4e7f-af51-a367b478ff81', 2);

INSERT INTO medicamentos (nome, laboratorio, disponivel, miligramas, data_ultima_atualizacao, uuid, ubs_id)
VALUES('Carisoprodol', 'Santa', true, 10, now(), '3ca893d1-a5eb-4efd-910e-fc6032fc2fc8', 2);

INSERT INTO medicamentos (nome, laboratorio, disponivel, miligramas, data_ultima_atualizacao, uuid, ubs_id)
VALUES('Celecoxibe', 'Santa', true, 10, now(), 'ef7d8779-8cd6-45a1-a69f-30896e463542', 2);