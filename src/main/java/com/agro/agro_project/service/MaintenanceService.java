package com.agro.agro_project.service;

import com.agro.agro_project.dao.MaintenanceRecordRepository;
import com.agro.agro_project.dao.MaintenanceRecordRowRepository;
import com.agro.agro_project.domain.MaintenanceRecord;
import com.agro.agro_project.domain.MaintenanceRecordRow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("maintenanceService")
public class MaintenanceService {
    @Autowired
    MaintenanceRecordRepository maintenanceRecordRepository;

    @Autowired
    MaintenanceRecordRowRepository maintenanceRecordRowRepository;

    public MaintenanceService(MaintenanceRecordRepository maintenanceRecordRepository, MaintenanceRecordRowRepository maintenanceRecordRowRepository) {
        this.maintenanceRecordRepository = maintenanceRecordRepository;
        this.maintenanceRecordRowRepository = maintenanceRecordRowRepository;
    }

    public MaintenanceRecord findMaintenanceRecordById(Short id) {
        return maintenanceRecordRepository.findById(id).get();
    }

    public List<MaintenanceRecord> findMaintenanceRecordsByMaintainableIdAndMaintainableType(int maintainableId, String maintainableType) {
        return maintenanceRecordRepository.findAllByMaintainableIdAndMaintainableType(maintainableId, maintainableType);
    }

    public List<MaintenanceRecordRow> findAllMaintenanceRecordRows() {
        return maintenanceRecordRowRepository.findAll();
    }

    public MaintenanceRecordRow findMaintenanceRecordRowByMaintenanceRecord(MaintenanceRecord maintenanceRecord) {
        return maintenanceRecordRowRepository.findByMaintenanceRecord(maintenanceRecord).get();
    }
}
