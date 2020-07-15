package com.apihomeworld.homeworld.FatLossCalculator.dao;

import com.apihomeworld.homeworld.FatLossCalculator.model.FatLossCalculator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FatLossCalculatorRepository extends JpaRepository<FatLossCalculator, Integer> {
}
