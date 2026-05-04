import java.sql.SQLOutput;
import java.util.Scanner;

public class chap04_control_flow {
    public static void main(String[] args) {
        chap04_control_flow c = new chap04_control_flow();
//        c.Scores();
//        c.Calculator();
//        c.Test();
        c.Random();
    }

        public void Scores(){

        Scanner sc = new Scanner(System.in);
        int[] scores = new int[3];
        String[] subjects = {"국어", "영어", "수학"};

        int sum = 0;
        boolean isPass =true;

        for(int i = 0; i<scores.length; i++){
            System.out.print(subjects[i] + "점수를 입력하세요: ");
            scores[i] = sc.nextInt();
            sum += scores[i];
        }

        int avg = sum / scores.length;

        if(avg < 60) {
            System.out.println("평균 점수 미달로 불합격입니다.");
            isPass = false;
        }

        for(int i = 0; i < scores.length; i++){
            if(scores[i] < 40){
                System.out.println(subjects[i] + "점수 미달로 불합격입니다.");
                isPass = false;
            }
        }
        if(isPass){
            System.out.println("합격입니다.");
        }
        }
        public void Calculator() {
            Scanner sc = new Scanner(System.in);
            System.out.println("월 급여를 입력하세요");
            int salary = sc.nextInt();
            System.out.println("매출액을 입력하세요");
            int sales = sc.nextInt();
            double bonusRate = 0;

            if(sales >= 50000000) {
                bonusRate = 0.05;
            }else if(sales >= 30000000){
                bonusRate = 0.03;
            }else if(sales >= 10000000){
                bonusRate = 0.01;
            }else{
                bonusRate = 0;
            }

            int bonus = (int)(sales * bonusRate);

            int totalSalary = salary + bonus;

            System.out.println("======================");
            System.out.println("매출액 : " + sales);
            System.out.println("보너스율 : " + (int)(bonusRate * 100) + "%");
            System.out.println("월 급여 : " + salary);
            System.out.println("보너스 금액 : " + bonus);
            System.out.println("======================");
            System.out.println("총 급여 : " + totalSalary);
        }

        public void Test() {
        Scanner sc = new Scanner(System.in);
            System.out.println("정수를 입력하세요");
            int count = sc.nextInt();

            for(int i = 0; i<count; i++){
                if(i % 2 == 1){
                    System.out.print("수");
                }else{
                    System.out.print("박");
                }
            }
        }

        public void Random() {
        Scanner sc = new Scanner(System.in);
        int randNum =(int) (Math.random() * 100) + 1;
        int count = 0;

            while (true) {
                System.out.print("정수를 입력하세요 : ");
                int num = sc.nextInt();
                count++;

                if (num > randNum) {
                    System.out.println("입력하신 정수보다 작습니다.");
                } else if (num < randNum) {
                    System.out.println("입력하신 정수보다 큽니다.");
                } else {
                    System.out.println("정답입니다. " + count + "회 만에 정답을 맞추셨습니다.");
                    break;
                }
            }

        }
    }

