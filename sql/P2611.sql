SELECT mov.id, mov.name
FROM movies mov
INNER JOIN genres gen ON gen.id = mov.id_genres
WHERE gen.description LIKE 'Action';

