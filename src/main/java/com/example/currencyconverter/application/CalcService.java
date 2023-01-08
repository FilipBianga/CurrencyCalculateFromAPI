package com.example.currencyconverter.application;

import com.example.currencyconverter.domain.NbpResult;
import com.example.currencyconverter.domain.RequestParametr;

import java.util.List;

public interface CalcService {

    NbpResult calculateCurrency(RequestParametr requestParametr);

    NbpResult calculateFromUSDToPLN(String name, Double priceToCalculate, String date);

    List<NbpResult> findAll();
}
