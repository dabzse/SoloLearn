/**
  * table name: posts
  * extract the sum of likes for each topic
  */

SELECT topic, SUM(likes)
FROM posts
GROUP BY topic