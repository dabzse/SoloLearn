/**

-- get the email addresses of the top 5 customers in descending order
-- pro

*/

SELECT email
FROM giveaway
ORDER BY total_amount DESC
LIMIT 5;