# Q1
SELECT
	category_code,
    category_name
FROM
	tbl_category
WHERE
	category_code IS NOT NULL
ORDER BY
	category_code DESC;
    
# Q2
SELECT
	menu_name,
    menu_price
FROM
	tbl_menu
WHERE
	menu_price BETWEEN 20000 AND 30000 AND menu_name LIKE '%밥%';

# Q3
SELECT
	menu_code,
	menu_price,
    menu_name,
    category_code,
    orderable_status
FROM
	tbl_menu
WHERE
	menu_price < 10000 OR menu_name LIKE '%김치%'
ORDER BY
	menu_price,
    menu_name DESC;

# Q4
SELECT * FROM tbl_menu
WHERE
	category_code NOT IN(10, 9, 8) AND menu_price = 13000 AND orderable_status = 'Y';

	

    
