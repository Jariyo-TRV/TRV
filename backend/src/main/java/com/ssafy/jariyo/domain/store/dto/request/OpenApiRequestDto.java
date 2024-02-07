package com.ssafy.jariyo.domain.store.dto.request;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@Getter
@ToString
@AllArgsConstructor
@Builder
@Setter
public class OpenApiRequestDto {
    private List<String> b_no;
}
