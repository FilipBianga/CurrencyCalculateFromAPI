package com.example.currencyconverter.application.impl;

import com.example.currencyconverter.application.CalcService;
import com.example.currencyconverter.application.NbpService;
import com.example.currencyconverter.db.NbpRepository;
import com.example.currencyconverter.domain.NbpRates;
import com.example.currencyconverter.domain.NbpResult;
import com.example.currencyconverter.domain.RequestParametr;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@AllArgsConstructor
public class CalcServiceImpl implements CalcService {
    private NbpRepository repository;
    private NbpService service;

    @Override
    public NbpResult calculateCurrency(RequestParametr requestParametr) {
        return repository.save(calculateFromUSDToPLN(requestParametr.getName(), requestParametr.getPrice(), requestParametr.getDate()));
    }


    @Override
    public NbpResult calculateFromUSDToPLN(String name, Double priceToCalculate, String date) {

        NbpRates mid = getDate(date);

        Double conv = BigDecimal.valueOf(priceToCalculate).multiply(BigDecimal.valueOf(mid.getMid())).doubleValue();

        return NbpResult.builder().nazwa(name).data_ksiegowania(date).koszt_USD(priceToCalculate).koszt_PLN(conv).build();
    }

    private NbpRates getDate(String date) {
        return service.allValuesInRates().stream().filter(m -> m.getEffectiveDate().equals(date)).findFirst().orElseThrow();
    }
}
