package com.ohgiraffers.springmybatis.menu.service;

import com.ohgiraffers.springmybatis.menu.model.dao.CategoryMapper;
import com.ohgiraffers.springmybatis.menu.model.dto.CategoryDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryService {

    private final CategoryMapper categoryMapper;

    public CategoryService(CategoryMapper categoryMapper){
        this.categoryMapper = categoryMapper;
    }

    public List<CategoryDTO> findCategoryList() {
        System.out.println(".서비스");
        return categoryMapper.findCategoryList();
    }
}
