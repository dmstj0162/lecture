# Q1
SELECT
	EMP_NAME,
    CONCAT(
		SUBSTRING(PHONE, 1, 3),
        '-',
        SUBSTRING(PHONE, 4, 4),
        '-',
        SUBSTRING(PHONE, 8, 4)) AS PHONE
FROM
	employee;
    
# Q2
SELECT
	EMP_NAME AS 직원명,
    CONCAT(
		SUBSTRING(HIRE_DATE, 1, 4),
        '년 ',
        SUBSTRING(HIRE_DATE, 7, 1),
        '월 ',
        SUBSTRING(HIRE_DATE, 9, 2),
        '일 ') AS 입사일,
	FORMAT(SALARY, 0) AS 급여
FROM
	employee
ORDER BY
	HIRE_DATE ASC,
    SALARY DESC;

# Q3
SELECT
	EMP_NAME,
    SALARY,
    BONUS,
    SUM(SALARY + (SALARY * BONUS)) AS TOTAL_SALARY
FROM
	employee
GROUP BY
	TOTAL_SALARY ASC;
    
    
