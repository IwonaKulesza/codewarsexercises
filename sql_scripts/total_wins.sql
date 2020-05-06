*/
    Return name, won, and lost columns displaying the name, total number of wins and total number of losses. Group by the fighter's name.
    Do not count any wins or losses where the winning move was Hadoken, Shouoken or Kikoken.
    Order from most-wins to least
    Return the top 6. Don't worry about ties.
/*



SELECT
  name,
  SUM (won) as won,
  SUM (lost) as lost
FROM fighters
WHERE move_id > 3
GROUP BY name
ORDER BY won DESC
LIMIT 6;