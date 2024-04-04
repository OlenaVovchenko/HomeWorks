use shop;

-- 1 Определить какие из покупок были совершены в июне
select order_id, odate 
from orders
where month(odate) = 6;

-- 2 Определить какие из покупок были совершены в интервале
-- от 10 апреля 2022 до 10 мая 2022 года
select order_id, odate
from orders
where odate between '2022-04-10' and '2022-05-10';

-- 3 Определить сколько покупок было совершено в марте
select count(odate) as count_order_in_march
from orders
where month(odate) = 3;

-- 4 Определить среднюю стоимость покупок в марте
select avg(amt)as average_purchase_price_in_March
from orders
where month(odate) = 3;

-- 5 Выведите минимальный рейтинг(rating) покупателя среди сделавших заказ 
-- в апреле 2022 года.
select min(t1.rating)
from customers t1
join orders t2
on t1.cust_id = t2.cust_id
where date(t2.odate)between '2022-04-01' and '2022-04-30'; 

-- 6 Выведите продавцов, которые оформили заказ на наибольшую сумму в период 
-- с 1 марта по 1 май 2022 года.
-- Вывести : sell_id, amt
select t1.sell_id, t2.amt
from sellers t1
join orders t2
on t1.sell_id = t2.sell_id
where t2.amt = (select max(amt) from orders where t2.odate between '2022-03-01'
and '2022-05-01');