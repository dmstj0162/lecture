package com.ohgiraffers.section03.layeredarchitecture;

import com.ohgiraffers.common.MemberDTO;

import java.util.List;

public class MemoryMemoRepository implements MemoRepository {


    @Override
    public List<MemoDTO> findAll() {
        return List.of(
                new MemoDTO(1, "Servlet에서 직접 만들던 객체 흐름 복습"),
                new MemoDTO(2, "Spring Container가 객체를 대신 조립")
        );
    }

    @Override
    public MemoDTO save(String content) {
        return null;
    }
}
