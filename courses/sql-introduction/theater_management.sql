-- pro

/**
    table name: orders
    select name, surname of those who
    - pre-booked a ticket
    - selected a seat number
*/

SELECT name, surname
FROM orders
WHERE pre_book = TRUE
AND seat_num IS NOT NULL;