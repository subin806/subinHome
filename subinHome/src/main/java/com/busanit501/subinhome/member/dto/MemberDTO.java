package com.busanit501.subinhome.member.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class MemberDTO {
    private Long mno;
    private String id;
    private String password;
}
