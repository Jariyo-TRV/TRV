package com.ssafy.jariyo.domain.waiting.dto;

import lombok.Data;

@Data
public class WaitingRequestPostDto {
    private Long storeId;
    private String storeName;
    private Long userId;
    private String userName;
    private Integer waitingSequence;
    private Integer waitingUserCount;
    private Boolean waitingIsPostpone;
}
