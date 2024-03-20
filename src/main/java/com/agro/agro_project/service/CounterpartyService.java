package com.agro.agro_project.service;

import com.agro.agro_project.dao.CounterpartyRepository;
import com.agro.agro_project.domain.Counterparty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("counterpartyService")
public class CounterpartyService {
    @Autowired
    CounterpartyRepository counterpartyRepository;

    public CounterpartyService(CounterpartyRepository counterpartyRepository) {
        this.counterpartyRepository = counterpartyRepository;
    }

    public Counterparty findById(Short id) {
        return counterpartyRepository.findById(id).get();
    }

    public List<Counterparty> findAll() {
        return counterpartyRepository.findAll();
    }
}
