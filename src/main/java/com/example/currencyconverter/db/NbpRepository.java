package com.example.currencyconverter.db;

import com.example.currencyconverter.domain.NbpResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NbpRepository extends JpaRepository<NbpResult, Long> {
}
