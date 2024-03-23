package com.agro.agro_project.dao;

import com.agro.agro_project.domain.MaintenanceRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("maintenanceRecordRepository")
public interface MaintenanceRecordRepository extends JpaRepository<MaintenanceRecord, Short> {
    Optional<MaintenanceRecord> findById(Short id);

    List<MaintenanceRecord> findAllByMaintainableIdAndMaintainableType(Integer maintainableId, String maintainableType);
}
