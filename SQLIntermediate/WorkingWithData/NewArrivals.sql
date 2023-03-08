SELECT name, year FROM Books
WHERE Books.year > 1900
UNION
SELECT name, 2022 FROM New
ORDER BY name;