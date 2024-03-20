package com.agro.agro_project.service;

import com.agro.agro_project.dao.FieldRepository;
import com.agro.agro_project.dao.FieldShapeLandParcelMappingItemRepository;
import com.agro.agro_project.dao.FieldShapeRepository;
import com.agro.agro_project.domain.Field;
import com.agro.agro_project.domain.FieldShape;
import com.agro.agro_project.domain.FieldShapeLandParcelMappingItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("fieldService")
public class FieldService {
    @Autowired
    FieldRepository fieldRepository;

    @Autowired
    FieldShapeRepository fieldShapeRepository;

    @Autowired
    FieldShapeLandParcelMappingItemRepository fieldShapeLandParcelMappingItemRepository;

    public FieldService(FieldRepository fieldRepository, FieldShapeRepository fieldShapeRepository, FieldShapeLandParcelMappingItemRepository fieldShapeLandParcelMappingItemRepository) {
        this.fieldRepository = fieldRepository;
        this.fieldShapeRepository = fieldShapeRepository;
        this.fieldShapeLandParcelMappingItemRepository = fieldShapeLandParcelMappingItemRepository;
    }

    public Field findFieldById(Integer id) {
        return fieldRepository.findById(id).get();
    }

    public List<Field> findAllFields() {
        return fieldRepository.findAll();
    }

    public List<FieldShapeLandParcelMappingItem> findAllByFieldShape(FieldShape fieldShape) {
        return fieldShapeLandParcelMappingItemRepository.findAllByFieldShape(fieldShape);
    }

    public List<FieldShape> findAllByField(Field field) {
        return fieldShapeRepository.findAllByField(field);
    }
}
