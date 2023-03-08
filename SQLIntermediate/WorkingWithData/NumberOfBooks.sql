SELECT A.name, COUNT(B.id) AS books
FROM Authors AS A LEFT JOIN Books AS B
ON A.id = B.author_id
GROUP BY A.name
ORDER BY books DESC;