package com.ohgiraffers.springmybatis.menu.model.dao;

import com.ohgiraffers.springmybatis.menu.model.dto.CategoryDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CategoryMapper {
    List<CategoryDTO> findCategoryList();
}
