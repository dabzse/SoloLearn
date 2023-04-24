SELECT Authors.name, COUNT(Books.id) AS books
FROM Authors
LEFT JOIN Books
ON Authors.id = Books.author_id
GROUP BY Authors.name
ORDER BY books DESC;