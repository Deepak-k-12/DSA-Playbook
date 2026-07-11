select p.product_id,p.product_name
from product p
join sales  s on p.product_id=s.product_id
group by 
    p.product_id,
    p.product_name
having sum(
    case
        when s.sale_date<'2019-01-01'
        or s.sale_date>'2019-03-31'
        then 1
        else 0
    end
)=0;