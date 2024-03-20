package com.agro.agro_project.service;

import com.agro.agro_project.dao.WarehouseRepository;
import com.agro.agro_project.domain.Warehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("warehouseService")
public class WarehouseService {
    @Autowired
    WarehouseRepository warehouseRepository;

    public WarehouseService(WarehouseRepository warehouseRepository) {
        this.warehouseRepository = warehouseRepository;
    }

    public Warehouse findById(Short id) {
        return warehouseRepository.findById(id).get();
    }

    public List<Warehouse> findAll() {
        return warehouseRepository.findAll();
    }
}
