package com.example.currencyconverter.application;

import com.example.currencyconverter.domain.NbpCurrency;
import com.example.currencyconverter.domain.NbpRates;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@AllArgsConstructor
public class NbpService {

    private static final String APINBP = "https://api.nbp.pl/api/exchangerates/tables/a/2022-01-03?format=json";

    private List<NbpRates> rates;

    @Autowired
    RestTemplate restTemplate;

    @PostConstruct
    private void init() {
        loadData();
    }

    public void loadData() {
        rates.clear();

        NbpCurrency cur = restTemplate.getForObject(APINBP, NbpCurrency.class);

        List<NbpRates> load = cur.getRates();

        this.rates = load;
    }

    public List<NbpRates> getVal() {
        return rates;
    }
}
