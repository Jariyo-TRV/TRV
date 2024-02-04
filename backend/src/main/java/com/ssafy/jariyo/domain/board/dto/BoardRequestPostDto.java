package com.ssafy.jariyo.domain.board.dto;

import lombok.Data;

@Data
public class BoardRequestPostDto {
    private String domain;
    private Boolean useStoreId;
    private String title;
    private String content;
}
