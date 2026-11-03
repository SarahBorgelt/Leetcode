<h2><a href="https://leetcode.com/problems/second-highest-salary/description/">Second Highest Salary</a></h2> <img src='https://img.shields.io/badge/Difficulty-medium-yellow' alt='Difficulty: Medium' /><hr><p>Table: <code>SecondHighestSalary</code></p>

<pre>
+-------------+------+
| Column Name | Type |
+-------------+------+
| id          | int  |
| salary      | int  |
+-------------+------+
id is the primary key (column with unique values) for this table.
</pre>

Each row of this table contains information about the salary of an employee.
 

Write a solution to find the second highest distinct salary from the Employee table. If there is no second highest salary, return null (return None in Pandas).

The result format is in the following example.

 

<strong>Example 1:</strong>

<strong>Input:</strong>
<pre>
Employee table:
+----+--------+
| id | salary |
+----+--------+
| 1  | 100    |
| 2  | 200    |
| 3  | 300    |
+----+--------+
</pre>
<strong>Output:</strong>
<pre>
+---------------------+
| SecondHighestSalary |
+---------------------+
| 200                 |
+---------------------+
</pre>
<strong>Example 2:</strong>

<strong>Input:</strong>
<pre>
Employee table:
+----+--------+
| id | salary |
+----+--------+
| 1  | 100    |
+----+--------+
</pre>
<strong>Output: </strong>
<pre>
+---------------------+
| SecondHighestSalary |
+---------------------+
| null                |
+---------------------+
</pre>
