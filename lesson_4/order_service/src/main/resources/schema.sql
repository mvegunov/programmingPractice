drop table IF EXISTS orders;

create TABLE orders(
    order_id INT NOT NULL PRIMARY KEY,
    customer_name VARCHAR(255) NOT NULL,
    price INT UNSIGNED NOT NULL
);


