package com.ssafy.jariyo.domain.reservation.dto;

import lombok.*;

@NoArgsConstructor
@Getter
@ToString
@AllArgsConstructor
@Builder
public class AvailableReservationDto {
    private String time;
    private Integer diningTableNumber;
}
