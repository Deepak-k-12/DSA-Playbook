select f.id
from weather f
join weather s
on DATEDIFF(f.recordDate,s.recordDate)=1
where s.temperature<f.temperature