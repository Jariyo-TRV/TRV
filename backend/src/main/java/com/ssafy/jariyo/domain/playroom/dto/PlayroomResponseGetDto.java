package com.ssafy.jariyo.domain.playroom.dto;

import lombok.*;

import java.sql.Timestamp;

@Data
public class PlayroomResponseGetDto {
    private Long storeId;
    private String title;
    private Timestamp startTime;
    private Timestamp endTime;
    private String image;
    private String status;
    private String info;
    private Integer userCount;
    private Integer likes;
    private String category;
}


