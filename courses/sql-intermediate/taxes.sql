SELECT firstname, lastname, salary,
CASE
    WHEN salary >= 0 AND salary <= 1500
        THEN salary * 0.1
    WHEN salary >= 1501 AND salary <= 2000
        THEN salary * 0.2
    ELSE salary * 0.3
END
AS tax FROM Employees
ORDER BY lastname ASC;