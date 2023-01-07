package com.example.currencyconverter.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class RequestParametr {
    @NonNull
    private String name;

    @NonNull
    private Double price;

    @NonNull
    private String date;
}
