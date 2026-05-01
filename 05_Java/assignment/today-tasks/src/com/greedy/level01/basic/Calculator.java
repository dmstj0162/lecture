package com.greedy.level01.basic;

public class Calculator {

    public void checkMethod() {
        System.out.println("메소드 호출 확인");
    }

    public int sum1to10() {

        int sum1to10 = 0;

        for (int i = 1; i <= 10; i++) {
            sum1to10 += i;
        }
        return sum1to10;
    }

    public void checkMaxNumber(int a, int b) {
        if(a > b){
            System.out.println("두 수 중 큰 수는" + a +"입니다");
        }else{
            System.out.println("두 수 중 큰 수는 " + b + "입니다");
        }

    }

    public int sumTwoNumbers(int a, int b) {
        return a + b;

    }

    public int minusTwoNumbers(int a, int b){
        return a - b;
    }
}
