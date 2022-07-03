CREATE TABLE leaderboard (
    place INT,
    nickname VARCHAR,
    rating INT
);

INSERT INTO leaderboard
VALUES 
(1, 'Predator', 9500),
(2, 'JohnWar', 9300),
(3, 'NightWarrior', 8900);

SELECT * 
FROM leaderboard;