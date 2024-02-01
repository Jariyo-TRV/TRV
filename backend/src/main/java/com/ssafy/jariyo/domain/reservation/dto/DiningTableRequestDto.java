package com.ssafy.jariyo.domain.reservation.dto;

import lombok.*;

@NoArgsConstructor
@Getter
@ToString
@AllArgsConstructor
@Builder
public class DiningTableRequestDto {
    private Integer diningTableNumber;
    private Integer diningTableCapacity;
    private String diningTableType;
    private Integer diningTableX;
    private Integer diningTableY;
    private Boolean diningTableIsAvailable;
}
