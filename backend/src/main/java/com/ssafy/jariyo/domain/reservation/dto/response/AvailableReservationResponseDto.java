package com.ssafy.jariyo.domain.reservation.dto.response;

import lombok.*;

@NoArgsConstructor
@Getter
@ToString
@AllArgsConstructor
@Builder
public class AvailableReservationResponseDto {
    private Long storeId;
    private String time;
    private DiningTableResponseDto diningTableResponseDto;
}