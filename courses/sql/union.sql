SELECT * FROM (
    SELECT * FROM NorwayChess
    UNION
    SELECT * FROM TataSteel
) AS subquery
ORDER BY Rating DESC;


-- and this will work as well

/**

SELECT * FROM NorwayChess
UNION
SELECT * FROM TataSteel
ORDER BY rating DESC;

*/