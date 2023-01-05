package com.example.currencyconverter.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NbpRates {
    private String no;
    private String effectiveDate;
    private Double mid;
}
