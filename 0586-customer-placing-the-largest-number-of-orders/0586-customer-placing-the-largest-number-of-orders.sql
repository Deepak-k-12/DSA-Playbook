select customer_number
from orders
group by customer_number
having count(*) = (
    select max(order_count)
    from (
        select count(*) as order_count
        from orders
        group by customer_number
    ) temp
);
