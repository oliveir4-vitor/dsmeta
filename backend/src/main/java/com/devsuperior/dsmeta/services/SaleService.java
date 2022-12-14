package com.devsuperior.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repository.SaleRepository;


@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;


    public List<Sale> findSales() {
        return saleRepository.findAll();
    }
}
