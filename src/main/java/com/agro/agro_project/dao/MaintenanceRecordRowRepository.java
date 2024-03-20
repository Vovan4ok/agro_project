package com.agro.agro_project.dao;

import com.agro.agro_project.domain.MaintenanceRecord;
import com.agro.agro_project.domain.MaintenanceRecordRow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("maintenanceRecordRowRepository")
public interface MaintenanceRecordRowRepository extends JpaRepository<MaintenanceRecordRow, Short> {
    List<MaintenanceRecordRow> findAll();

    Optional<MaintenanceRecordRow> readMaintenanceRecordRowByMaintenanceRecord(MaintenanceRecord maintenanceRecord);
}
