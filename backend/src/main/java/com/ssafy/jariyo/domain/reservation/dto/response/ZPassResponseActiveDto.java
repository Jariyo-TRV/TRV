package com.ssafy.jariyo.domain.reservation.dto.response;

import com.ssafy.jariyo.global.entity.Status;
import lombok.*;

@NoArgsConstructor
@Getter
@ToString
@AllArgsConstructor
@Builder
public class ZPassResponseActiveDto {
    private Long storeId;
    private String storeName;
    private Long userId;
    private String nickname;
    private Long zpassId;
    private String zpassName;
    private Integer zpassQuantity;
    private Status zpassStatus;
}
