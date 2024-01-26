package com.ssafy.jariyo.domain.user.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
public class UserUpdateDto {
    private String nickname;
    private String email;
}
