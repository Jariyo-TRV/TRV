package com.ssafy.jariyo.domain.board.dto;
import com.ssafy.jariyo.domain.board.entity.BoardDomain;
import lombok.Data;

@Data
public class BoardResponseGetDto {
    private Long userId;
    private Long storeId;
    private BoardDomain domain;
    private String title;
    private String content;
}