package com.ohgiraffers.section03.layeredarchitecture;

import com.ohgiraffers.common.MemberDTO;

import java.util.List;

public interface MemoRepository {

    List<MemoDTO> findAll();

    MemoDTO save(String content);
}
