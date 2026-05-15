# Q1
SELECT
	SUM(SALARY) AS SUM_SAL
FROM
	employee
GROUP BY
	DEPT_CODE;

SELECT
	MAX(SUM_SAL)
FROM
	(SELECT
		SUM(SALARY) AS SUM_SAL
	FROM
		employee
	GROUP BY
		DEPT_CODE) AS temp;
	
# Q2
SELECT
	DEPT_ID
FROM
	department
WHERE
	DEPT_TITLE LIKE '%영업%';

SELECT
	EMP_ID,
    EMP_NAME,
	DEPT_CODE,
    SALARY
FROM
	employee
WHERE DEPT_CODE IN (SELECT
						DEPT_ID
					FROM
						department
					WHERE
						DEPT_TITLE LIKE '%영업%');

# Q3
SELECT
	DEPT_ID,
    DEPT_TITLE
FROM
	department
WHERE
	DEPT_TITLE LIKE '%영업%';
    
SELECT
	e.EMP_ID,
    e.EMP_NAME,
    temp.DEPT_TITLE,
    e.SALARY
FROM
	employee e
JOIN
	(SELECT
		DEPT_ID,
		DEPT_TITLE
	FROM
		department
	WHERE
		DEPT_TITLE LIKE '%영업%') AS temp
ON e.DEPT_CODE = temp.DEPT_ID;
		
# Q4-1
SELECT
	d.DEPT_ID,
    d.DEPT_TITLE,
    l.LOCAL_NAME,
    n.NATIONAL_NAME
FROM
	department d
JOIN
	location l ON d.LOCATION_ID = l.LOCAL_CODE
JOIN
	nation n ON l.NATIONAL_CODE = n.NATIONAL_CODE;

# Q4-2
SELECT
	e.EMP_ID,
    e.EMP_NAME,
    e.SALARY,
    temp.DEPT_TITLE,
    temp.NATIONAL_NAME
FROM
	employee e
JOIN (SELECT
		d.DEPT_ID,
		d.DEPT_TITLE,
		l.LOCAL_NAME,
		n.NATIONAL_NAME
	FROM
		department d
	JOIN
		location l ON d.LOCATION_ID = l.LOCAL_CODE
	JOIN
		nation n ON l.NATIONAL_CODE = n.NATIONAL_CODE) AS temp
	ON e.DEPT_CODE = temp.DEPT_ID
	ORDER BY
		temp.NATIONAL_NAME DESC;
	




	

	



	
    