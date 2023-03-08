SELECT CONCAT(LOWER(firstname),'.',LOWER(lastname),'@company.com') 
AS email 
FROM employees
ORDER BY email;