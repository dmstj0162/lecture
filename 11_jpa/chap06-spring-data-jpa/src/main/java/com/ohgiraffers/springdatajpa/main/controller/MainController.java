package com.ohgiraffers.springdatajpa.main.controller;

import com.ohgiraffers.springdatajpa.menu.dto.MenuRequestDTO;
import com.ohgiraffers.springdatajpa.menu.dto.MenuResponseDTO;
import com.ohgiraffers.springdatajpa.menu.service.MenuService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MainController {

    private final MenuService menuService;

    public MainController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("/")
    public ResponseEntity<Map<String, String>> main() {
        return ResponseEntity.ok(Map.of("message", "메인 API 페이지에 오신 것을 환영합니다."));
    }


}