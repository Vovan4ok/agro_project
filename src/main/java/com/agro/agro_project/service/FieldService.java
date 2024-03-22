package com.agro.agro_project.service;

import com.agro.agro_project.dao.FieldRepository;
import com.agro.agro_project.dao.FieldScoutReportRepository;
import com.agro.agro_project.dao.FieldShapeLandParcelMappingItemRepository;
import com.agro.agro_project.dao.FieldShapeRepository;
import com.agro.agro_project.domain.Field;
import com.agro.agro_project.domain.FieldScoutReport;
import com.agro.agro_project.domain.FieldShape;
import com.agro.agro_project.domain.FieldShapeLandParcelMappingItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service("fieldService")
public class FieldService {
    @Autowired
    FieldRepository fieldRepository;

    @Autowired
    FieldShapeRepository fieldShapeRepository;

    @Autowired
    FieldShapeLandParcelMappingItemRepository fieldShapeLandParcelMappingItemRepository;

    @Autowired
    FieldScoutReportRepository fieldScoutReportRepository;

    public FieldService(FieldRepository fieldRepository, FieldShapeRepository fieldShapeRepository, FieldShapeLandParcelMappingItemRepository fieldShapeLandParcelMappingItemRepository, FieldScoutReportRepository fieldScoutReportRepository) {
        this.fieldRepository = fieldRepository;
        this.fieldShapeRepository = fieldShapeRepository;
        this.fieldShapeLandParcelMappingItemRepository = fieldShapeLandParcelMappingItemRepository;
        this.fieldScoutReportRepository = fieldScoutReportRepository;
    }

    public Field findFieldById(Integer id) {
        return fieldRepository.findById(id).get();
    }

    public List<Field> findAllFields() {
        return fieldRepository.findAll();
    }

    public List<FieldShapeLandParcelMappingItem> findAllMappingItemsByFieldShape(FieldShape fieldShape) {
        return fieldShapeLandParcelMappingItemRepository.findAllByFieldShape(fieldShape);
    }

    public List<FieldShape> findAllFieldShapesByField(Field field) {
        return fieldShapeRepository.findAllByField(field);
    }

    public FieldShape findFieldShapeByFieldAndEndTime(Field field, Timestamp endTime) {
        return fieldShapeRepository.findByFieldAndEndTimeOrderByEndTimeDesc(field, endTime);
    }

    public FieldScoutReport findFieldScoutReportById(Integer id) {
        return fieldScoutReportRepository.findById(id).get();
    }

    public List<FieldScoutReport> findFieldScoutReportsByField(Field field) {
        return fieldScoutReportRepository.findAllByField(field);
    }
}
