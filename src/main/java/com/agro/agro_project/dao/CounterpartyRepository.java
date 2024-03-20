package com.agro.agro_project.dao;

import com.agro.agro_project.domain.Counterparty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("counterpartyRepository")
public interface CounterpartyRepository extends JpaRepository<Counterparty, Short> {
    Optional<Counterparty> findById(Short id);

    List<Counterparty> findAll();
}
