public class chap01_tasks {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;

        System.out.println("더하기 결과 :" + (a + b));
        System.out.println("빼기 결과 :" + (a - b));
        System.out.println("곱하기 결과 :" + (a * b));
        System.out.println("나누기한 몫 : " +(a / b));
        System.out.println("나누기한 나머지 : " +(a % b));

        double fw = 12.5;
        double fh = 36.4;

        System.out.println("면적 : " + (fw * fh));
        System.out.println("둘레 : " + 2 *(fw + fh));

        char ch = 'a';
        int unicode = (int) ch;
        System.out.println("문자 a의 unicode : " + unicode);

        double koreanScore = 80.5;
        double mathScore = 50.6;
        double englishScore = 70.8;

        double sum = koreanScore + mathScore + englishScore;
        int iSum = (int) sum;

        double avg = sum / 3;
        int iAvg = (int) avg;

        System.out.println("총점 : " +iSum);
        System.out.println("평균 : " +iAvg);

    }

}
