# Write your MySQL query statement below

/* By grouping the results by teacher,
we are telling the database to group all the rows that have the same teacher_id together. 
This way, we can apply the COUNT function to each group separately, 
which gives us the number of courses made by each teacher.*/

select teacher_id, count(distinct subject_id) as cnt from Teacher group by Teacher_id;