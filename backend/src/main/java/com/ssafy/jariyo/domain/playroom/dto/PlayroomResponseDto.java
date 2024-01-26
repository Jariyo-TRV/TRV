package com.ssafy.jariyo.domain.playroom.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.List;

@NoArgsConstructor
@Getter
@ToString
@AllArgsConstructor
public class PlayroomResponseDto {
    private Long playroomId;
    private String store;
    private String title;
    private String image;
    private String category;
    private Timestamp startTime;
}

