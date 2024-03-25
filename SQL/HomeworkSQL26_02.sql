use hr; 
select * from employees;
-- 1. Напишите запрос, который выводит идентификатор сотрудника, его имя и фамилию, а также категорию зарплаты на основе следующих условий:
-- Если зарплата меньше 5000, категория "Низкая".
-- Если зарплата от 5000 до 10000, категория "Средняя".
-- Если зарплата больше 10000, категория "Высокая".
SELECT 
    employee_id,
    first_name,
    last_name,
    case
    when salary < 5000 then 'Низкая'
    when salary between 5000 and 10000 then 'Средняя'
    when salary > 10000 then 'Высокая'
    end as salary_category
    from employees;
    
    -- Определение размера премии сотрудникам:
-- Напишите запрос, который выводит идентификатор сотрудника, его имя и фамилию, а также размер премии на основе следующих условий:
-- Если зарплата меньше 5000, премия составляет 10% от зарплаты.
-- Если зарплата от 5000 до 10000, премия составляет 15% от зарплаты.
-- Если зарплата больше 10000, премия составляет 20% от зарплаты.
SELECT 
    employee_id,
    first_name,
    last_name,
    CASE 
        WHEN salary < 5000 THEN salary * 0.10
        WHEN salary BETWEEN 5000 AND 10000 THEN salary * 0.15
        WHEN salary > 10000 THEN salary * 0.20
    END AS bonus
FROM 
    employees;
    -- Получить список стран с указанием их региона и обозначением 
    -- страны "EU" для стран Европейского союза, "Non-EU" для остальных стран.
    
    SELECT 
    country_name,
    region_name,
    CASE 
        WHEN country_name IN ('Austria', 'Belgium', 'Bulgaria', 'Croatia', 'Cyprus', 'Czech Republic', 'Denmark', 'Estonia', 'Finland', 'France', 'Germany', 'Greece', 'Hungary', 'Ireland', 'Italy', 'Latvia', 'Lithuania', 'Luxembourg', 'Malta', 'Netherlands', 'Poland', 'Portugal', 'Romania', 'Slovakia', 'Slovenia', 'Spain', 'Sweden') 
        THEN 'EU' 
        ELSE 'Non-EU' 
    END AS eu_status
FROM 
    countries c
JOIN 
    regions r ON c.region_id = r.region_id;
    
    -- Получить список стран с указанием количества символов в их названиях.
SELECT 
    country_name,
    LENGTH(country_name) AS name_length
FROM 
    countries;
-- Получить список стран и их первые три символа в названии

SELECT 
    country_name,
    SUBSTRING(country_name FROM 1 FOR 3) AS name_fragment
FROM 
    countries;
-- 5 Получить список сотрудников с заменой их email на "Confidential", если он содержит слово "sqltutorial"
select
first_name, last_name,
case 
when email like '%sqltutorial%' then 'Confidential'
else email
end as email
from employees;

-- 6 Получить список сотрудников и указать их email в нижнем регистре.
select
first_name, last_name,
lower(email) as email
from employees;

-- 7.Получить список сотрудников(firstname, lastname) с указанием их должности(job_title).
select
t1.first_name, t1.last_name, t2.job_title
from employees t1
inner join jobs t2
on t1.job_id = t2.job_id;

-- 8 Получить список отделов(department_name) и их названий с указанием местоположения(city).
select
t1.department_name , t2.city
from departments t1
inner join locations t2
on t1.location_id = t2.location_id;

-- 9 Получить список отделов(departmentname) и их менеджеров(firstname, last_name).
select
t1.department_name, t2.first_name, t2.last_name
from departments t1
inner join employees t2
on t1.manager_id = t2.manager_id;
-- 10 Получить список сотрудников(firstname, lastname) с указанием их департамента(department_name), отсортированный по департаменту.
select
t1.department_name, t2.first_name, t2.last_name
from departments t1
inner join employees t2
on t1.manager_id = t2.manager_id
order by t1.department_name asc;

-- 11 Получить список сотрудников(firstname, lastname)  и их менеджеров(firstname, lastname) 

select
  t1.first_name as employee_firstname,
  t1.last_name as employee_lastname,
  t2.first_name as manager_firstname,
  t2.last_name as manager_lastname
from employees t1
inner join employees t2 
on t1.manager_id = t2.employee_id
order by t1.last_name, t1.first_name;

-- 12 Получить список стран, где местоположение находится в США.
select 
t1.country_name,
t2.city
from
countries t1 
inner join locations t2
on t1.country_id = t2.country_id
where t1.country_name = 'United States of America';

    