package com.example.currencyconverter.application;

import com.example.currencyconverter.domain.NbpRates;

import java.util.List;


public interface NbpService {

    void loadData();

    List<NbpRates> allValuesInRates();
}
