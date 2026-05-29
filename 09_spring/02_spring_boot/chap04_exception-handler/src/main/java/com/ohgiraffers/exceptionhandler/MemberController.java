package com.ohgiraffers.exceptionhandler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/members")
public class MemberController {

    private final List<MemberDTO> members = new ArrayList<>();

    public MemberController() {
        members.add(new MemberDTO(1, "판다", 4));
        members.add(new MemberDTO(2, "호랑이", 5));
        members.add(new MemberDTO(3, "토끼", 6));
    }

    @GetMapping
    public ResponseEntity<List<MemberDTO>> findMembers() {
        return ResponseEntity.ok(members);
    }

    @GetMapping("/{memberNo}")
    public ResponseEntity<MemberDTO> findMember(@PathVariable int memberNo){
        MemberDTO foundMember = members.stream()
                .filter(member -> member.getNo() == memberNo)
                .findFirst()
                .orElseThrow(()-> new MemberNotFoundException(memberNo + "번 회원을 찾을 수 없습니다."));

        return ResponseEntity.ok(foundMember);

    }
}
