package com.example.currencyconverter.application;

import com.example.currencyconverter.domain.NbpResult;
import com.example.currencyconverter.domain.RequestParametr;

public interface CalcService {

    NbpResult calculateCurrency(RequestParametr requestParametr);

    NbpResult calculateFromUSDToPLN(String name, Double priceToCalculate, String date);
}
