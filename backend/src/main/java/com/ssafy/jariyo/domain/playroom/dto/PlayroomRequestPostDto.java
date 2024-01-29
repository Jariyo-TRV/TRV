package com.ssafy.jariyo.domain.playroom.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class PlayroomRequestPostDto {
    private String title;
    private String info;
    private String category;
}
