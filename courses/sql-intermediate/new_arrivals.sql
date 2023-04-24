SELECT name, year
FROM Books
WHERE year > 1900
UNION
SELECT name, 2022 AS year
FROM New
ORDER BY name ASC;