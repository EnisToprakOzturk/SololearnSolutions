SELECT CONCAT(firstname, ' ', lastname) AS fullname, 12*salary+experience*500 AS total
FROM staff
ORDER BY total;