/**
    table name: games
    calculate the avg number of goals scored by each team
    during games in Miami

    -- pro
*/

SELECT team, AVG(goals) AS avg
FROM games
WHERE city = 'Miami'
GROUP BY team;