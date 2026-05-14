# JOIN
-- 1. 컬럼 별칭
SELECT 
	menu_name AS '메뉴 이름',
    menu_price price
FROM
	tbl_menu;

-- 2. 테이블 별칭(JOIN에서 필수)
SELECT
	a.menu_name,
    a.menu_price
FROM
	tbl_menu AS a;

-- INNER JOIN(교집합) - 가장 기본적인 조인, INNER 키워드 생략 가능
SELECT
	a.menu_name,
    b.category_name
FROM
	tbl_menu a
JOIN
	tbl_category b ON a.category_code = b.category_code;

-- OUTER JOIN(LEFT/RIGHT)

-- LEFT : 조인구문을 기준으로 왼쪽 테이블의 데이터는 모두 보여주고,
-- 오른쪽 테이블에서 짝이 맞는 데이터가 없으면 'NULL'로 채워 보여준다.
-- RIGHT : 기준이 오른쪽 테이블이다.
SELECT
	a.category_name,
    b.menu_nametbl_category
FROM
	tbl_category a
LEFT JOIN tbl_menu b ON a.category_code = b.category_code;

-- SELF JOIN : 하나의 테이블을 자기 자신과 조인하는 것
SELECT 
	a.category_name AS '하위 카테고리',
    b.category_name AS '상위 카테고리'
FROM
	tbl_category a -- 하위 역할
JOIN tbl_category b ON a.ref_category_code = b.category_code; -- 상위 역할

# GROUP BY : 같은 값을 가진 행끼리 그룹으로 묶는 것 = 집계 함수
SELECT 
	category_code,
    COUNT(*) AS '메뉴 개수'
FROM 
	tbl_menu
GROUP BY
	category_code;
    
-- COUNT(): 각 그룹에 속한 행의 개수를 센다.
SELECT
	category_code
FROM 
	tbl_menu
GROUP BY
	category_code;
    
SELECT
	category_code,
    -- menu_code, GROUP BY를 사용할 때, GROUP BY에 사용된 컬럼과 집계 함수만 SELECT 절에 올 수 있다.
    SUM(menu_price) AS '가격 총합',
    AVG(menu_price) AS '가격 평균'
FROM
	tbl_menu
GROUP BY
	category_code;

-- HAVING (그룹에 대한 조건 필터링) - WHERE는 그룹화하기 전, 원본 데이터에 대한 조건
-- 카테고리별 메뉴 개수가 3개 이상인 카테고리만 보여주세요
SELECT
	category_code,
    COUNT(*)
FROM
	tbl_menu
GROUP BY
	category_code
HAVING
	COUNT(*) >= 3; -- 그룹화된 결과가 3개 이상인 그룹만 필터링

-- 작성 순서: FROM -> WHERE(원본 데이터에서 필터링) -> GROUP BY -> HAVING(GROUP BY에서 묶은걸 다시 필터링) -> ORDER BY

-- WITH ROLLUP(그룹별 집계 결과와 함께 그 그룹들의 총계를 보여준다)
SELECT
	category_code,
    SUM(menu_price)
FROM
	tbl_menu
GROUP BY
	category_code
WITH ROLLUP;

-- 가격대별, 그 안에서 카테고리별로 그룹화하고 ROLLUP 적용
SELECT
	menu_price,
    category_code,
    SUM(menu_price)
FROM
	tbl_menu
GROUP BY
	menu_price,
    category_code
WITH ROLLUP;


