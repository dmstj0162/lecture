
import java.util.Scanner;

public class chap05_06 {
    public static void main(String[] args) {
        chap05_06 ch = new chap05_06();
//        ch.Array();
        ch.Game();
    }
        public void Array(){
            Scanner sc = new Scanner(System.in);
            System.out.print("홀수인 양의 정수를 입력하세요: ");
            int size = sc.nextInt();

            if(size <= 0 || size % 2 == 0){
                System.out.println("양수 혹은 홀수만 입력해야 합니다.");
                return; // 메서드 종료
                }
            int[] arr = new int[size];
            int mid = size / 2;     // 배열의 중간 인덱스 계산

            int value = 1;
            for(int i = 0; i < arr.length; i++){
                arr[i] = value;

                // 중간 지점(mid) 이전까지는 증가, 이후부터는 감소
                if(i < mid){
                    value++;
                }else{
                    value--;
                }
            }

            // 배열 결과 출력
            for(int i = 0; i < arr.length; i++){
                // 마지막 숫자이면 공백을 붙이지 않는다.
                System.out.print(arr[i] + (i == arr.length -1 ? "": " "));
            }
        }

        public void Game(){
            Scanner sc = new Scanner(System.in);

            int[] arr = new int[4];

            // 중복되지 않는 0~9 난수 생성
            for(int i = 0; i < arr.length; i++){
                arr[i] = (int)(Math.random() * 10);
                for(int j = 0; j < i; j++){
                    if(arr[i] == arr[j]){
                        i--;
                        break;
                    }
                }
            }

            // 게임 진행
            int chance = 10;
            while(chance > 0){
                System.out.println(chance + "회 남으셨습니다.");
                System.out.println("4자리 숫자를 입력하세요 : ");
                String input = sc.next(); //"1234" 같은 문자열이라 여기서 글자를 하나씩 뽑아 int형 숫자로 변환해야함.

                // 4자리 정수 확인
                if(input.length() != 4){
                    System.out.println("4자리의 정수를 입력해야 합니다.");
                    continue;
                }

                // 스트라이크/볼 계산
                int strike = 0;
                int ball = 0;
                for(int i = 0; i < 4; i++){
                    int userNum = input.charAt(i) - '0'; //문자를 숫자로 변환
                    for(int j = 0; j < 4; j++){
                        if(userNum == arr[j]){
                            if(i==j) strike++;
                            else ball++;
                        }
                    }
                }

                if(strike==4){
                    System.out.println("정답입니다.");
                    return;
                }else{
                    System.out.println("아쉽네요 " + strike + "S " + ball + "B 입니다.");
                    chance --;
                }
            }

            System.out.println("10번의 기회를 모두 소진하셨스니다. 프로그램을 종료합니다.");
        }



}
