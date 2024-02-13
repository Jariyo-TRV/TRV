package com.ssafy.jariyo.domain.reservation.dto.response;

import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DiningTableResponseDto {
    private Integer diningTableNumber;
    private Integer diningTableCapacity;
    private Boolean diningTableIsAvailable;
    private String diningTableType;
    private Integer diningTableX;
    private Integer diningTableY;
    private Integer height;
    private Integer width;
}
