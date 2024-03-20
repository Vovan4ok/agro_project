package com.agro.agro_project.dao;

import com.agro.agro_project.domain.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("warehouseRepository")
public interface WarehouseRepository extends JpaRepository<Warehouse, Short> {
    Optional<Warehouse> findById(Short id);

    List<Warehouse> findAll();
}
