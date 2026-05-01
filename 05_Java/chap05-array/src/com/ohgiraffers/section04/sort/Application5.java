package com.ohgiraffers.section04.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Application5 {
    public static void main(String[] args) {

        /*배열과 정렬을 응용하여 중복 없는 로또 번호 생성하기*/

        //1. 6개의 숫자를 담을 배열 생성
        int [] lotto = new int[6];

        // 숫자 몇개 넣었는지 체크하는 변수
//        int index = 0;

        //2. 중복되지 않는 난수를 생성하여 배열에 담기
        for(int i = 0; i < lotto.length; i++) {
            lotto[i] = (int) (Math.random()*45) + 1;

            //중복 검사
            for( int j = 0; j < i; j++) {
                if(lotto[i] == lotto[j]){
                    i--;    // 이번 회차 무효(다시 뽑기)
                    break;
                }
            }
        }

//        while(index < 6) {
//            int num = (int)(Math.random() * 45) +1;
//
//            boolean isDuplicate = false;
//
//            //중복 검사
//            for(int i = 0; i < index; i++){
//                if(lotto[i] == num){
//                    isDuplicate = true;
//                    break;
//                }
//            }
//
//            if(!isDuplicate) {
//                lotto[index] = num;
//                index++;
//            }
//        }

        //3. 정렬하여 출력
        Arrays.sort(lotto);
        System.out.println("로또 번호 : " + Arrays.toString(lotto));

    }
}
