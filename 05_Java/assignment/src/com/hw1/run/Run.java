package com.hw1.run;

import com.hw1.model.dto.Employee;
import com.hw1.model.dto.Person;
import com.hw1.model.dto.Student;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 객체 배열 생성
        Student[] students = new Student[3];

        for (int i = 0; i < students.length; i++) {

            System.out.print("이름 : ");
            String name = sc.nextLine();
            System.out.print("나이 : ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("신장 : ");
            double height = sc.nextDouble();
            sc.nextLine();
            System.out.print("몸무게 : ");
            double weight = sc.nextDouble();
            sc.nextLine();
            System.out.print("학년 : ");
            int grade = sc.nextInt();
            sc.nextLine();
            System.out.print("전공 : ");
            String major = sc.nextLine();
            System.out.println((i + 1)+"번째 학생 저장");


            Student student = new Student(name, age, height, weight, grade, major);
            students[i] = student;
        }
            for(Person student : students) {
                System.out.println(student.information());
            }

        Employee[] employees = new Employee[10];
            int count = 0;
        while(count < employees.length){
            System.out.print("이름 : ");
            String name = sc.nextLine();
            System.out.print("나이 : ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("신장 : ");
            double height = sc.nextDouble();
            sc.nextLine();
            System.out.print("몸무게 : ");
            double weight = sc.nextDouble();
            sc.nextLine();
            System.out.print("급여 : ");
            int salary = sc.nextInt();
            sc.nextLine();
            System.out.print("부서 : ");
            String dept = sc.nextLine();

            Employee employee = new Employee(name, age, height, weight, salary, dept);
            employees[count] = employee;
            count++;

            System.out.print("계속 추가하시겠습니까?(y/n) : ");
            String answer = sc.nextLine();

            if(!answer.equalsIgnoreCase("y")){
                break;
            }

        }
            for(Employee employee : employees){
                if(employee != null){
                    System.out.println(employee.information());
                }
            }


    }
}
