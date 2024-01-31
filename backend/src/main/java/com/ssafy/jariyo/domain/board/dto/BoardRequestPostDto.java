package com.ssafy.jariyo.domain.board.dto;

import lombok.Data;

@Data
public class BoardRequestPostDto {
    private Long storeId;
    private String domain;
    private String title;
    private String content;
}
