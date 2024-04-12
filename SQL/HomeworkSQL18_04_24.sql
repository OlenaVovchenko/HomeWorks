use airport;
-- 1 Посчитать количество рейсов по каждой модели самолета. Вывести modelname и flightcount.
select
model_name, count(country) as flight_count
from airliners
group by model_name;

-- 2 Вычислить среднюю стоимость билета по классам обслуживания. Вывести serviceclass и averageprice.
select
service_class,
avg(price) as average_price
from tickets
group by service_class;

-- 3 Определить средний возраст клиентов, сгруппированных по классу обслуживания. Вывести serviceclass и averageage.
select
t1.service_class, avg(t2.age) as average_age
from tickets t1
join clients t2
on t1.client_id = t2.id
group by t1.service_class;

-- 4 Получить общее количество билетов, купленных каждым клиентом. Вывести name и ticket_count.
select
name, count(*) as ticket_count
from clients t1
join tickets t2
on t2.client_id = t1.id
group by name;

-- 5 Определить количество рейсов, отправленных из каждого аэропорта. Вывести departure и departure_count.
select
departure, count(*) as departure_count
from trips 
group by departure;

-- 6 Вычислить общий доход от продажи билетов для каждой страны производителя самолетов. Вывести country и total_sum.
select
t1.country, sum(price) as total_sum
from airliners t1
join trips t2 
on t1.id = t2.airliner_id
join tickets t3
on t2.id = t3.trip_id
group by t1.country;
