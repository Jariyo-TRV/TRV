package com.ssafy.jariyo.domain.board.dto;
import com.ssafy.jariyo.domain.board.entity.BoardDomain;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BoardResponseGetDto {
    private Long boardId;
    private Long userId;
    private Long storeId;
    private BoardDomain domain;
    private String title;
    private String content;
    private LocalDateTime regDate;
}