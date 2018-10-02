CREATE TABLE contato (
    codigo serial,
	codigo_pessoa serial,
	nome VARCHAR(50) NOT NULL,
	email VARCHAR(100) NOT NULL,
	telefone VARCHAR(20) NOT NULL,
  FOREIGN KEY (codigo_pessoa) REFERENCES pessoa(codigo),
   primary key (codigo)
);

insert into contato (codigo, codigo_pessoa, nome, email, telefone) values (1, 1, 'Marcos Henrique', 'marcos@kwan.com', '00 0000-0000');
