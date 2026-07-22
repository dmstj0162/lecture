package com.ohgiraffers.prompthub_backendlogin;

import com.ohgiraffers.prompthub_backendlogin.dao.UserDAO;
import com.ohgiraffers.prompthub_backendlogin.dto.UserDTO;

import java.sql.Connection;
import java.util.List;

import static com.ohgiraffers.prompthub_backendlogin.JDBCTemplate.close;
import static com.ohgiraffers.prompthub_backendlogin.JDBCTemplate.getConnection;

public class UserService {

    private final UserDAO userDAO = new UserDAO();

    public List<UserDTO> findAllUsers(){
        Connection con = getConnection();

        try{
            return userDAO.selectUserById(con, id);
        }finally {
            close(con);
        }
    }
}
