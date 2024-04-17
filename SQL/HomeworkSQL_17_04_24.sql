-- 1 Найти общую сумму заказов для каждого клиента.
use shop;
select t1.cname as client_name, sum(t2.amt) as sum_orders
from customers t1
join orders t2
on t1.cust_id = t2.cust_id
group by t1.cname; 
-- 2 Получить количество заказов для каждого продавца.
select t1.sname as sellers_name, count(t2.sell_id) as count_sellers
from sellers t1
join orders t2
on t1.sell_id = t2.sell_id
group by t1.sname;
-- 3 Получить количество клиентов с рейтингом выше среднего.
select avg(rating)  as averege_rating    
from customers;

select count(*)
from customers
where rating > (select avg(rating)      
from customers);

-- 4 Получить количество клиентов в каждом городе с рейтингом выше 200.
select count(cust_id), city
from customers
where rating > 200
group by city;
-- 5 Получить количество заказов, сделанных в каждый месяц.
select count(order_id), odate
from orders
group by odate;

-- 6 Найти клиентов, у которых сумма заказов превышает среднюю сумму заказов всех клиентов.
select avg(total_amt)
from (select sum(amt) as total_amt from orders group by cust_id)as totals;

select t1.cname
from customers t1
join (select cust_id, sum(amt) as total_amt from orders group by cust_id)t2
on t1.cust_id = t2.cust_id
where t2.total_amt > (select avg(total_amt)
from (select sum(amt) as total_amt from orders group by cust_id)as totals);