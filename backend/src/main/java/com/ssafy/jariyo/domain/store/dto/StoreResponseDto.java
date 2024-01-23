package com.ssafy.jariyo.domain.store.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
@AllArgsConstructor
public class StoreResponseDto {
    private String storeName;
    private String detail;
    private Long owner;
}

