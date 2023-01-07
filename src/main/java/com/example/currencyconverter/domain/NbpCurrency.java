package com.example.currencyconverter.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NbpCurrency {

    private String table;
    private String currency;
    private String code;
    private List<NbpRates> rates;
}
