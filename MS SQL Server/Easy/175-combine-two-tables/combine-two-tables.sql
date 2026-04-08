/* Write your T-SQL query statement below */
-- We must begin by selecting the necessary fields from the person table. We will also need a join statement to join the address table. However, because we need all of the fields in the Person table instead of only the matching fields, we will need to use a left join.
SELECT Person.firstName, Person.lastName, Address.city, Address.state
FROM Person
LEFT JOIN Address on Person.personId = Address.personId;
