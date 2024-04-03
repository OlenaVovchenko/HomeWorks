-- Таблица - customers


-- 1 Вывести максимальный и минимальный credit_limit.
select min(credit_limit), max(credit_limit)
from customers;

-- 2 Вывести покупателей у которых creditlimit выше среднего creditlimit.
select cust_first_name, cust_last_name, CREDIT_LIMIT as credit_limit_below_average
from customers
where credit_limit > (select avg(credit_limit) from customers);

-- 3 Найти кол/во покупателей имя которых начинается на букву 'D' 
-- и credit_limit больше 500.
select count(cust_first_name)
from customers 
where cust_first_name like 'D%'and credit_limit > 500;

-- Таблица - order_items
-- 4 Найти среднее значение unit_price
select round(avg(unit_price), 2)
from order_items;

-- Таблицы - orderitems, productinformation
-- 5 Вывести имена продуктов(PRODUCT_NAME), кол/во(QUANTITY) 
-- которых меньше среднего.
select t1.PRODUCT_NAME, t2.QUANTITY
from product_information t1
join order_items t2
on t1.PRODUCT_ID = t2.PRODUCT_ID
where t2.QUANTITY < (select avg(QUANTITY)from order_items);

-- Таблицы - orders, customers
-- 6 Вывести имя и фамилию покупателя с максимальной общей суммой покупки(ORDER_TOTAL).
select t1.cust_first_name, t1.cust_last_name, t2.ORDER_TOTAL as max_Order
from customers t1
join orders t2
on t1.CUSTOMER_ID = t2.CUSTOMER_ID
where t2.ORDER_TOTAL = (select max(ORDER_TOTAL) from orders);

-- 7 Найти сумму общей суммы покупок(ORDER_TOTAL) всех женатых мужчин покупателей.
select sum(order_total)
from orders
join customers
on orders.CUSTOMER_ID = customers.CUSTOMER_ID
where customers.GENDER = 'M' and customers.MARITAL_STATUS = 'married';

