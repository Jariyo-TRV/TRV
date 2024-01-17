package com.ssafy.jariyo.domain.connTest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
@AllArgsConstructor
public class UserResponseDto {
    private String name;
    private String stuNum;
    private String email;
}
