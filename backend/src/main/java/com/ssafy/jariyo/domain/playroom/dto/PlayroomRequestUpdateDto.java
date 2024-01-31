package com.ssafy.jariyo.domain.playroom.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class PlayroomRequestUpdateDto {
    private String title;
    private String image;
    private String status;
    private String info;
    private String category;
}


