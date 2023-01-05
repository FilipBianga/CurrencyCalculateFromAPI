package com.example.currencyconverter.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;


@Data
@Builder
public class RequestParametr {
    @NonNull
    private Double price;
}
