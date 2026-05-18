package com.ohgiraffers.section02.preparedStatement;

import com.ohgiraffers.model.dto.EmployeeDTO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application4 {
    public static void main(String[] args) {

        /* XML 파일에 별도로 입력한 sql문을 통해 처리 */
        // Connection 선언
        Connection con = getConnection();

        // PreparedStatement 선언
        PreparedStatement pstmt = null;

        // ResultSet 선언
        ResultSet rset = null;

        // EmployeeDTO 선언
        EmployeeDTO row = null;

        // List<EmployeeDTO> 선언
        List<EmployeeDTO> employeeList = null;

        // 사용자에게 성 입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.println("성을 입력해주세요: ");
        String employeeName = sc.nextLine();

        // Properties 객체 생성하고 파일 읽어오기
        Properties prop = new Properties();


        try(FileInputStream queryStream = new FileInputStream("src/main/java/com/ohgiraffers/section02/preparedStatement/employee-query.xml")) {
            prop.loadFromXML(queryStream);

            String query = prop.getProperty("selectEmpByFamilyName");
            // PreparedStatement 객체 생성
            pstmt = con.prepareStatement(query);
            // 위치홀더 값 설정
            pstmt.setString(1, employeeName);
            // 쿼리 실행하여 ResultSet으로 반환받기
            rset = pstmt.executeQuery();

            employeeList = new ArrayList<>();
            // while문 작성
            while(rset.next()){
                row = new EmployeeDTO();

                row.setEmpId(rset.getString("EMP_ID"));
                row.setEmpName(rset.getString("EMP_NAME"));
                row.setEmpNo(rset.getString("EMP_NO"));
                row.setEmail(rset.getString("EMAIL"));
                row.setSalary(rset.getInt("SALARY"));

                employeeList.add(row);
            }
            System.out.println("query = " + query);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } // finally 구문 작성
        catch (SQLException e) {
            e.printStackTrace();
        }finally{
            close(rset);
            close(pstmt);
            close(con);
        }

        // List에 담긴 직원 목록 출력하기

        for(EmployeeDTO list : employeeList) {
            System.out.println(list);
        }
    }
}
