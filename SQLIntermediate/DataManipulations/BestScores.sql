SELECT nickname, MAX(score) AS best FROM scores
GROUP BY nickname
ORDER BY best DESC;