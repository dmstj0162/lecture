package com.greedy.level01.basic;

public class Application {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.checkMethod();

        int sum = cal.sum1to10();
        System.out.println("1부터 10까지의 합: " + sum);

        cal.checkMaxNumber(10, 20);

        int res1 = cal.sumTwoNumbers(10, 20);
        System.out.println("10과 20의 합은 : " + res1);

        int res2 = cal.minusTwoNumbers(10, 5);
        System.out.println("10과 5의 차는 : " + res2);
    }
}


