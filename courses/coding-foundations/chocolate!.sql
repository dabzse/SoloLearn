/**
  * select the dessert name and price
  * where the name contains 'chocolate'
  */

SELECT name, price
FROM desserts
WHERE name LIKE '%chocolate%'