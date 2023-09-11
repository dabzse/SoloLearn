/**
  * select the car make, model, and price per day
  * where the price per day is less than or equal to $100
  */

SELECT make, model, price_per_day
FROM cars
WHERE price_per_day <= 100