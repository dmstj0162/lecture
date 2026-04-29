

public class chap02_tasks {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        System.out.println((a > b) ? a : b);

        int num1 = 50;
        int num2 = 20;

        System.out.println((num1+num2) > 60 ? "합격입니다" : "아쉽지만 불합격입니다");

        int num3 = 10;

        System.out.println((num3 % 2) == 0 ? "짝수입니다" : "홀수입니다.");

        double dNum = 80.5;
        int dNumI = (int)dNum;

        System.out.println(dNumI >= 90 ? "A": dNumI >= 80 ? "B" : dNumI >= 70 ? "c" : dNumI >= 60 ? "D" : "F" );

        int userMonth = 1;
        int userDay = 13;

        String name = "박은서";
        String gift;

        if(userMonth >= 1 && userMonth <=6 && userDay >= 1 && userDay <= 15) {
            gift = "배민쿠폰";
        }else if(userMonth >= 7 && userMonth <= 12 && userDay >= 16 && userDay <=31){
            gift = "스타벅스 커피";
        }else{
            gift = "사탕";
        }
        System.out.println(name+ "의 선물은 " + gift + " 입니다.");


    }
}
