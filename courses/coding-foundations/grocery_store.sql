-- pro

/**
    table name: products
    select the name, price, and discount
    where the discount is greater than 0
    order by the discount amount in descending order
*/

SELECT name, price, discount
FROM products
WHERE discount > 0
ORDER BY discount DESC;