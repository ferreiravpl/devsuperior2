INSERT INTO tb_category (id, descricao) VALUES (1, 'Curso');
INSERT INTO tb_category (id, descricao) VALUES (2, 'Oficina');

INSERT INTO tb_participant (id, nome, email) VALUES (1, 'José Silva', 'jose@gmail.com');
INSERT INTO tb_participant (id, nome, email) VALUES (2, 'Tiago Faria', 'tiago@gmail.com');
INSERT INTO tb_participant (id, nome, email) VALUES (3, 'Maria do Rosário', 'maria@gmail.com');
INSERT INTO tb_participant (id, nome, email) VALUES (4, 'Teresa Silva', 'teresa@gmail.com');

INSERT INTO tb_activity (id, nome, descricao, preco, category_id) VALUES (1, 'Curso de HTML', 'Aprenda HTML de forma prática', '80.00', 1);
INSERT INTO tb_activity (id, nome, descricao, preco, category_id) VALUES (2, 'Oficina de GitHub', 'Controle versões de seus projetos', '50.00', 2);

INSERT INTO tb_blocks (activity_id, id, inicio, fim) VALUES (1, 1, '2017-09-25 08:00:00', '2017-09-25 11:00:00');
INSERT INTO tb_blocks (activity_id, id, inicio, fim) VALUES (2, 2, '2017-09-25 14:00:00', '2017-09-25 18:00:00');
INSERT INTO tb_blocks (activity_id, id, inicio, fim) VALUES (2, 3, '2017-09-26 08:00:00', '2017-09-26 11:00:00');

INSERT INTO tb_activity_participant (activity_id, participant_id) VALUES (1, 1);
INSERT INTO tb_activity_participant (activity_id, participant_id) VALUES (1, 2);
INSERT INTO tb_activity_participant (activity_id, participant_id) VALUES (1, 3);

INSERT INTO tb_activity_participant (activity_id, participant_id) VALUES (2, 2);
INSERT INTO tb_activity_participant (activity_id, participant_id) VALUES (2, 3);
INSERT INTO tb_activity_participant (activity_id, participant_id) VALUES (2, 4);