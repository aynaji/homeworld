package com.apihomeworld.homeworld.FatLossCalculator.controller;

import com.apihomeworld.homeworld.FatLossCalculator.model.FatLossCalculator;
import com.apihomeworld.homeworld.FatLossCalculator.services.FatLossService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class FatLossController {

    @Autowired
    FatLossService fatLossService;

    @RequestMapping("/FatLossCalculator")
    public FatLossCalculator FatLoss() {
        return null;
    }
}
