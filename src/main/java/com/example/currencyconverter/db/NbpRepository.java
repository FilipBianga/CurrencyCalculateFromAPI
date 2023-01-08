package com.example.currencyconverter.db;

import com.example.currencyconverter.domain.NbpResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NbpRepository extends JpaRepository<NbpResult, Long> {

    @Query(value = "SELECT * FROM FAKTURA", nativeQuery = true)
    List<NbpResult> findAllEager();
}
