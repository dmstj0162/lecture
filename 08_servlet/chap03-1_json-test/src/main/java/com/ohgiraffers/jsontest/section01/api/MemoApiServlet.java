package com.ohgiraffers.jsontest.section01.api;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/api/memos")
public class MemoApiServlet extends HttpServlet {

    private static final ObjectMapper mapper = new ObjectMapper();
    private static final List<MemoDTO> memos = new ArrayList<>();
    private static int sequence = 1;

    @Override
    public void init(ServletConfig config) throws ServletException {
        if(memos.isEmpty()){
            memos.add(new MemoDTO(sequence++, "React에서 Servlet API 호출하기"));
            memos.add(new MemoDTO(sequence++, "다음 과제에서는 static List를 JDBC로 교체하기"));
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json; charset=UTF-8");

        // writeValue(출력대상, 자바객체): memos 객체를 json으로 바꿔서 HTTP 응답에 출력해라
        mapper.writeValue(resp.getWriter(), memos);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json; charset=UTF-8");

        // JSON Body를 req.getReader()로 읽고 Jackson의 readValue()로 MemoDTO로 변환
        MemoDTO requestMemo = mapper.readValue(req.getReader(), MemoDTO.class);
        String content = requestMemo.getContent() == null ? "":requestMemo.getContent().trim();

        if(content.isEmpty()){
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            mapper.writeValue(resp.getWriter(), new ErrorResponse("content is required"));
        }

        MemoDTO savedMemo = new MemoDTO(sequence++, content);
        memos.add(savedMemo);

        resp.setStatus(HttpServletResponse.SC_CREATED);

        // savedMemo를 json으로 바꿔서 응답
        mapper.writeValue(resp.getWriter(), savedMemo);
    }

    // 에러를 {"message" : "content is required"} 형태로 응답하기 위한 객체
    static class ErrorResponse {

        private final String message;

        ErrorResponse(String message){
            this.message = message;
        }

        public String getMessage(){
            return message;
        }
    }


}
