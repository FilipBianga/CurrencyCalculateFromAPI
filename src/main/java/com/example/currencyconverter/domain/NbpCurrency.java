package com.example.currencyconverter.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class NbpCurrency {
    private String table;
    private String currency;
    private String code;
    private List<NbpRates> rates;
}
