/**
    select title, genre, and rating
    filter by the 'Action' genre
    order by rating

    -- pro
*/


SELECT title, genre, rating
FROM movies
WHERE genre = 'Action'
ORDER BY rating DESC;