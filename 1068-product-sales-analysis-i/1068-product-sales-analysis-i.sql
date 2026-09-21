# Write your MySQL query statement 
SELECT 
    product_name, s.year, s.price
FROM 
    Sales s
left join 
  Product p
ON p.product_id=s.product_id