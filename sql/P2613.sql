SELECT mov.id, mov.name
FROM movies mov
INNER JOIN prices pri ON pri.id = mov.id_prices
WHERE pri.value < 2;
