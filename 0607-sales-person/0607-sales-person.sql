select name
from salesperson
where sales_id not in (
select o.sales_id 
from orders o
where o.com_id=(
    select com_id
    from company
    where name="RED"
)
)