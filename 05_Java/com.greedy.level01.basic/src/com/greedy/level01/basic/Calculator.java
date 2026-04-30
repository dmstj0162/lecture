import com.greedy.level01.basic.Application;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {


    }
    public void checkMethod() {
        int sum1to10 = 0;

        for(int i = 1; i<=10; i++) {
            sum1to10 += i;
        }
        System.out.println("sum1to10 = " + sum1to10);
    }

    public void checkMaxNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("a와 b값을 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sumTwoNumbers = a + b;
        System.out.println("합계는 : " +sumTwoNumbers );
        int minusTwoNumber = a - b;
        System.out.println("차이는 : " +minusTwoNumber);
    }
}
