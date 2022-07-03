INSERT INTO Animals 
VALUES ('Slim', 'Giraffe', 1);

SELECT Animals.name,Animals.type,Countries.country
FROM   Animals 
INNER JOIN Countries
ON Animals.country_id=Countries.id
ORDER BY country;