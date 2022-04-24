INSERT INTO tb_livro(titulo, subtitulo, numero_de_paginas, ano_de_lancamento) VALUES ('CÓDIGO LIMPO', 'HABILIDADES PRÁTICAS DO AGILE SOFTWARE', 457, 2008);
INSERT INTO tb_livro(titulo, subtitulo, numero_de_paginas, ano_de_lancamento) VALUES ('COMO SER UM PROGRAMADOR MELHOR', 'UM MANUAL PARA PROGRAMADORES QUE SE IMPORTAM COM CÓDIGO', 384, 2015);
INSERT INTO tb_livro(titulo, subtitulo, numero_de_paginas, ano_de_lancamento) VALUES ('REFATORAÇÃO', 'APERFEIÇOANDO O DESIGN DE CÓDIGOS EXISTENTES', 456, 2020);
INSERT INTO tb_livro(titulo, subtitulo, numero_de_paginas, ano_de_lancamento) VALUES ('DOMAIN-DRIVEN DESIGN', 'ATACANDO AS COMPLEXIDADES NO CORAÇÃO DO SOFTWARE', 528, 2016);
INSERT INTO tb_livro(titulo, subtitulo, numero_de_paginas, ano_de_lancamento) VALUES ('O PROGRAMADOR PRAGMÁTICO', 'DE APRENDIZ A MESTRE', 344, 2010);

INSERT INTO tb_autor(nome, nacionalidade) VALUES ('ROBERT CECIL MARTIN', 'EUA');
INSERT INTO tb_autor(nome, nacionalidade) VALUES ('PETE GOODLIFFE', 'EUA');
INSERT INTO tb_autor(nome, nacionalidade) VALUES ('MARTIN FOWLER', 'EUA');
INSERT INTO tb_autor(nome, nacionalidade) VALUES ('KENT BECK', 'EUA');
INSERT INTO tb_autor(nome, nacionalidade) VALUES ('ERIC EVANS', 'EUA');
INSERT INTO tb_autor(nome, nacionalidade) VALUES ('ANDY HUNT', 'EUA');
INSERT INTO tb_autor(nome, nacionalidade) VALUES ('DAVE THOMAS', 'EUA');

INSERT INTO tb_livro_autores(livro_id, autores_id) VALUES (1, 1);
INSERT INTO tb_livro_autores(livro_id, autores_id) VALUES (2, 2);
INSERT INTO tb_livro_autores(livro_id, autores_id) VALUES (3, 3);
INSERT INTO tb_livro_autores(livro_id, autores_id) VALUES (3, 4);
INSERT INTO tb_livro_autores(livro_id, autores_id) VALUES (4, 5);
INSERT INTO tb_livro_autores(livro_id, autores_id) VALUES (5, 6);
INSERT INTO tb_livro_autores(livro_id, autores_id) VALUES (5, 7);