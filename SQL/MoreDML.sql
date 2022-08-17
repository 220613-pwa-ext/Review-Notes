-- DML (and DQL)
-- SELECT (Read) - arguably is part of DQL because it does not "modify" the data
-- INSERT (Create)
-- UPDATE (Update)
-- DELETE (Delete)

-- (More advanced) DQL commands
select * from film;

--I only want the film title and description 
select title, description from film;

--provide aliases for the columns 
select title as Movie_Title, description from film;

--We would like to filter out some of the movies 
-- I want movies that have a PG rating 
select * from film where rating = 'PG';
select title, description from film where rating = 'PG';

-- I want movies that don't have a PG rating 
select * from film where not rating = 'PG';

-- I want movies that aren't PG or G 
select * from film where not rating = 'PG' and not rating = 'G';
select title, description from film where not rating = 'PG' and not rating = 'G';


----------------------------------------------------------------------------
--LIKE 
-- What about regex?
-- I want all the movies that begin with an A 
-- Wildcards
-- A placeholder for a character, to help us find records based of a pattern 
-- % - is a placeholder for 0 or more characters. 
-- _ - is a placeholder for 1 characer
-- When we use wildcards, we use the 'LIKE' keyword
select * from film where title like 'A%'; -- anything beginning with an A 
select * from film where title like 'A%%%%%%%%%%%%%'; -- anything beginning with an A 
select * from film where title like '%n'; -- anything ending with n 
select * from film where title like '%el%'; -- anything containing el at any point

select * from film where title like 'E_________'; -- anything beginning with an E and exactly 10 characters long

select * from film where title like '_c__e%';

-------------------------------------------------------------------------------------
--BETWEEN
-- I want to select movies that cost between 0.99 and 2.99 
select * from film where rental_rate between -0.99 and 2.99;

-------------------------------------------------------------------------------------
--IN keyword 

--Tangent to albumns because movies don't work here. 
--I want to select the albums made by AC/DC 
select * from album where artist_id = 1;
select * from artist where name='AC/DC';

select * from album where artist_id = (select artist_id from artist where name='AC/DC');

--I want to select all the albums made by artistis beginning with an A 

select * from artist where name like 'A%';
select * from album where artist_id = 
	(select artist_id from artist where name like 'A%');

-- Our problem is that our nested query is returning multiple rows. 
select * from album where artist_id in
	(select artist_id from artist where name like 'A%');

select * from album where artist_id in (1,2,3,99,100);



------------------------------------------------------------------------------
--GROUPS 
-- We don't want to filter anything, but would like to group together records 
-- When grouping we have to use agregate functions 
-- Agregate takes in multiple values (or records) and returns a single value 
-- count, sum, min, max, avg, etc ... 

select count(*) from film; -- Count up all the records in the film table 
select count(rental_rate) from film; -- count up by a single column, this will ignore null values
select sum(rental_rate) from film;


select min(rental_rate) from film group by rating; -- we're not filtering, we're just grouping.

select rating , count(*) from film group by rating; -- how many movies are in each category. 


-- if you want filter the group, you have to use the 'HAVING' keyword
-- 'HAVING' is used to filter based on the group's property 
select rating, count(*) from film group by rating having count(*) > 200;
select rating, count(*) from film group by rating having count(*) between 140 and 200;


--If I wanted to filter individual first before grouping them. 
-- e.g. I want to group the movies that only cost 99 cents 
select rating, count(*) from film where rental_rate between 0.99 and 2.99 group by rating;

-- I want to see the rating group that have more than 130 movies in them
-- that only have movies between 99 cents and 2.99 cents; 

select rating, count(*) from film where rental_rate between 0.99 and 2.99 
	group by rating having count(*) > 130;


