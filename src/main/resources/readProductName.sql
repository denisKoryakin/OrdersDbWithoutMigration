select orders.* from netology.orders join netology.customers on netology.customers.id = netology.orders.customer_id where UPPER(name) LIKE '%'||UPPER(:name)||'%'