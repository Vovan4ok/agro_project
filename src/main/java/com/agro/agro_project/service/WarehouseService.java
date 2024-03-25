package com.agro.agro_project.service;

import com.agro.agro_project.dao.WarehouseRelatedObjectAssignmentRepository;
import com.agro.agro_project.dao.WarehouseRepository;
import com.agro.agro_project.domain.Warehouse;
import com.agro.agro_project.domain.WarehouseRelatedObjectAssignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("warehouseService")
public class WarehouseService {
    @Autowired
    WarehouseRepository warehouseRepository;

    @Autowired
    WarehouseRelatedObjectAssignmentRepository warehouseRelatedObjectAssignmentRepository;

    public WarehouseService(WarehouseRepository warehouseRepository, WarehouseRelatedObjectAssignmentRepository warehouseRelatedObjectAssignmentRepository) {
        this.warehouseRepository = warehouseRepository;
        this.warehouseRelatedObjectAssignmentRepository = warehouseRelatedObjectAssignmentRepository;
    }

    public Warehouse findById(Short id) {
        return warehouseRepository.findById(id).get();
    }

    public List<Warehouse> findAll() {
        return warehouseRepository.findAll();
    }

    public WarehouseRelatedObjectAssignment findAssignmentByWarehouse(Warehouse warehouse) {
        return warehouseRelatedObjectAssignmentRepository.findByWarehouse(warehouse).get();
    }
}
