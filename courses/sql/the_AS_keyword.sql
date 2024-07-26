SELECT
    CONCAT(firstname, ' ', lastname)
        AS fullname,
    salary * 12 + experience * 500
        AS total
FROM staff
ORDER BY total ASC;
