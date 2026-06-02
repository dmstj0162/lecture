package com.ohgiraffers.prompthub_backendlogin;

import java.sql.Connection;

public class ConnectionTest {
    public static void main(String[] args) {
        Connection con = JDBCTemplate.getConnection();

        if(con != null) {
            System.out.println("DB 연결 성공");
        }


    }
}
