SELECT products.productname, products.price, categories.categoryname
FROM products
INNER JOIN categories
ON products.categoryid = categories.id;