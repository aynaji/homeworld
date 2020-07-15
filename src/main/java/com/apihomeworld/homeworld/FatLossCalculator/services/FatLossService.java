package com.apihomeworld.homeworld.FatLossCalculator.services;

import com.apihomeworld.homeworld.FatLossCalculator.dao.FatLossCalculatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FatLossService {
    @Autowired
    FatLossCalculatorRepository fatLossCalculatorRepository;


}
