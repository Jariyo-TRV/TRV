package com.ssafy.jariyo.domain.reservation.dto.response;

import lombok.*;

@NoArgsConstructor
@Getter
@ToString
@AllArgsConstructor
@Builder
public class DiningTableResponseDto {
    private Integer diningTableNumber;
    private Integer diningTableCapacity;
    private String diningTableType;
    private Integer diningTableX;
    private Integer diningTableY;
}
