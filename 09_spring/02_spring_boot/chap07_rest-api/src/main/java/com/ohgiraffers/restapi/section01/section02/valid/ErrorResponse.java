package com.ohgiraffers.restapi.section01.section02.valid;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ErrorResponse {

    private String code;        //에러코드
    private String description; // 에러 종류 설명
    private String detail;      // 실제 검증 메세지 or 예외 메세지

}
