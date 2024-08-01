package com.nongviet201.cinema.web.sdk.response;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
public class WebBillResponse {
    private Integer id;
    private Long amount;
    private String updatedAt;
}