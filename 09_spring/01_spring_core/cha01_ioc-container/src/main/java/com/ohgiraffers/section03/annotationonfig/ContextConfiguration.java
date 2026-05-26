package com.ohgiraffers.section03.annotationonfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/* Component bias
* Base Package 로 설정된 경로에 특정 어노테이션을 가지고 있는 클래스를 bean으로 등록하는 기능
* @Component, @Controller, @Servie, @Repository, @Configuration 등*/
@Configuration
@ComponentScan(basePackages = "com.ohgiraffers.common")
public class ContextConfiguration {
}
