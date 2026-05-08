package com.greedy.level01.basic.student.run;

import com.greedy.level02.normal.book.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 객체 배열 선언
        StudentDTO[] students = new StudentDTO[10];
        int count = 0;

        // while
        while(count < 10){
            System.out.print("학년 : ");
            int grade = sc.nextInt();
            System.out.print("반 : ");
            int classroom = sc.nextInt();
            System.out.print("이름 : ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("국어점수 : ");
            int kor = sc.nextInt();
            System.out.print("영어점수 : ");
            int eng = sc.nextInt();
            System.out.print("수학점수 : ");
            int math = sc.nextInt();

            StudentDTO student = new StudentDTO(grade, classroom, name, kor, eng, math);

            students[count] = student;
            count++;

            System.out.println("계속 추가하시겠습니까?(y/n) : ");
            String answer = sc.next();
            if(!answer.equalsIgnoreCase("y")){
                break;
            }

        }
            for(int i = 0; i < count; i++){
                int iAvg = students[i].getAvg();
                System.out.println(students[i].getInformation() + ", 평균: " + iAvg +" " );
            }



    }
}
