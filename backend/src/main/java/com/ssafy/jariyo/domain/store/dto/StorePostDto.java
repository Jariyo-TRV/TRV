package com.ssafy.jariyo.domain.store.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Getter
public class StorePostDto {
    private String name;
    private String phone;
    private String detail;
    private String businessNum;
    private Boolean isWaiting;
    private Integer tableCount;
    private Integer rating;
    private Integer followCount;
    private String operationHours;
}
