package com.ssafy.jariyo.domain.playroom.dto;

import lombok.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
public class PlayroomResponseGetDto {
    private Long storeId;
    private String title;
    private LocalDateTime startTime;
    private String image;
    private String info;
    private Integer userCount;
    private String category;

    private Long userId;
    private String userNickname;
    private String userImage;
}


