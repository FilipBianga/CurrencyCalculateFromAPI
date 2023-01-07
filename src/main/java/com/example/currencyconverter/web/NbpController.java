package com.example.currencyconverter.web;

import com.example.currencyconverter.application.CalcService;
import com.example.currencyconverter.application.NbpService;
import com.example.currencyconverter.domain.NbpRates;
import com.example.currencyconverter.domain.NbpResult;
import com.example.currencyconverter.domain.RequestParametr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/currencies")
@RestController
public class NbpController {

    @Autowired
    private NbpService nbpService;

    @Autowired
    private CalcService calcService;

    @GetMapping("/all")
    private List<NbpRates> getAllValuesInRates() {
        return nbpService.allValuesInRates();
    }

    @PostMapping(value = "/calc", consumes = "application/json")
    private NbpResult calculateValueInUsdToPl(@RequestBody RequestParametr parametr) {
        RequestParametr requestParametr = RequestParametr.builder()
                .name(parametr.getName())
                .date(parametr.getDate())
                .price(parametr.getPrice())
                .build();

        return calcService.calculateCurrency(requestParametr);
    }

}
