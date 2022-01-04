CREATE TABLE customers (
    id numeric,
    name varchar(255),
    street varchar(255),
	city varchar(255)
	);

CREATE TABLE rentals (
	id numeric,
	rentals_date date,
    id_customers numeric
	);
	
INSERT INTO customers (id, name, street, city)
VALUES (1,'Giovanna Goncalves Oliveira', 'Rua Mato Grosso', 'Canoas'),
		(2, 'Kauã Azevedo Ribeiro', 'Travessa Ibiá', 'Uberlândia'),
		(3, 'Rebeca Barbosa Santos', 'Rua Observatório Meteorológico', 'Salvador'),
		(4, 'Sarah Carvalho Correia', 'Rua Antônio Carlos da Silva', 'Apucarana'),
		(5, 'João Almeida Lima', 'Rua Rio Taiuva', 'Ponta Grossa'),
		(6, 'Diogo Melo Dias', 'Rua Duzentos e Cinqüenta', 'Várzea Grande');


INSERT INTO rentals (id, rentals_date, id_customers)
VALUES (1, '2016-09-10', 3),
		(2, '2016-02-09', 1),
        (3, '2016-02-08', 4),
        (4, '2016-02-09', 2),
		(5, '2016-02-03', 6),
        (6, '2016-04-04', 4);

--Resolução:
SELECT cus.name, ren.rentals_date
FROM customers cus
INNER JOIN rentals ren ON cus.id = ren.id_customers
WHERE ren.rentals_date >= '2016-09-01' and ren.rentals_date <= '2016-09-30';
