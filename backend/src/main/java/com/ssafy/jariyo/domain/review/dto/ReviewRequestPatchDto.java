package com.ssafy.jariyo.domain.review.dto;

import lombok.Data;

@Data
public class ReviewRequestPatchDto {
    private String title;
    private String content;
}
