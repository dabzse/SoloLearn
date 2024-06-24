-- pro

/**
    select the song title and artist from the songs table
    where the song title contains the word 'love'
    and order the results by the rating in descending order
*/

SELECT title, artist
FROM songs
WHERE title LIKE '%Love%'
ORDER BY rating DESC;