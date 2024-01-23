package com.ssafy.jariyo.domain.user.dto;

import com.ssafy.jariyo.domain.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
@AllArgsConstructor
public class UserResponseDto {
    private Long userId;
    private String userName;


}

