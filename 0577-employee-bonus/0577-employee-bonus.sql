select *
from(select e.name ,b.bonus
from employee e
left join bonus b
on e.empId=b.empId
) temp
where bonus<1000 or bonus is null