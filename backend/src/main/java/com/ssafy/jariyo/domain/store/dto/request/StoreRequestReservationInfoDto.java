package com.ssafy.jariyo.domain.store.dto.request;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class StoreRequestReservationInfoDto {
    private String storeReservationStartDate;
    private String storeReservationEndDate;
    private String storeReservationAvailableHours;
}
