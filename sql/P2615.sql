CREATE TABLE customers (
    id numeric,
    name varchar(255),
    street varchar(255),
	city varchar(255)
	);

	
INSERT INTO customers (id, name, street, city)
VALUES (1,'Giovanna Goncalves Oliveira', 'Rua Mato Grosso', 'Canoas'),
		(2, 'Kauã Azevedo Ribeiro', 'Travessa Ibiá', 'Uberlândia'),
		(3, 'Rebeca Barbosa Santos', 'Rua Observatório Meteorológico', 'Salvador'),
		(4, 'Sarah Carvalho Correia', 'Rua Antônio Carlos da Silva', 'Apucarana'),
		(5, 'João Almeida Lima', 'Rua Rio Taiuva', 'Ponta Grossa'),
		(6, 'Diogo Melo Dias', 'Rua Duzentos e Cinqüenta', 'Várzea Grande');


--Resolução:

SELECT DISTINCT city FROM customers;

