INSERT INTO Employees(firstname, lastname, salary)
VALUES 
    ('Wang', 'Lee', 1900), 
    ('Greta', 'Wu', 1200);

SELECT id, firstname, lastname, salary FROM Employees
ORDER BY id DESC;