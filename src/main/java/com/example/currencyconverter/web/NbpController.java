package com.example.currencyconverter.web;

import com.example.currencyconverter.application.NbpService;
import com.example.currencyconverter.domain.NbpRates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/currencies")
@RestController
public class NbpController {

    @Autowired
    private NbpService service;

    @GetMapping("/all")
    private List<NbpRates> getValue() {
        return service.getVal();
    }
}
