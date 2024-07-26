-- creating a table
CREATE TABLE Leaderboard (
    place INT,
    nickname VARCHAR(255),
    rating INT
);

-- inserting data
INSERT INTO Leaderboard (place, nickname, rating)
VALUES
    (1, 'Predator', 9500),
    (2, 'JohnWar', 9300),
    (3, 'NightWarrior', 8900);

-- showing the result
SELECT * FROM Leaderboard;
