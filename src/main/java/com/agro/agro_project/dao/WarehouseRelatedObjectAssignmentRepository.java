package com.agro.agro_project.dao;

import com.agro.agro_project.domain.Warehouse;
import com.agro.agro_project.domain.WarehouseRelatedObjectAssignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("warehouseRelatedObjectAssignmentRepository")
public interface WarehouseRelatedObjectAssignmentRepository extends JpaRepository<WarehouseRelatedObjectAssignment, Short> {
    Optional<WarehouseRelatedObjectAssignment> findByWarehouse(Warehouse warehouse);
}
