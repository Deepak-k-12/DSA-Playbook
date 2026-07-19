CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  DECLARE offsetVal INT;
  SET offsetVal = N - 1;
  RETURN (
     select distinct salary 
     from employee
     order by salary desc 
     limit offsetVal ,1
  );
END