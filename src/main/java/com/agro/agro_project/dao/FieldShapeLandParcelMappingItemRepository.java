package com.agro.agro_project.dao;

import com.agro.agro_project.domain.FieldShape;
import com.agro.agro_project.domain.FieldShapeLandParcelMappingItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("fieldShapeLandParcelMappingItem")
public interface FieldShapeLandParcelMappingItemRepository extends JpaRepository<FieldShapeLandParcelMappingItem, Short> {
    List<FieldShapeLandParcelMappingItem> readFieldShapeLandParcelMappingItemsByFieldShape(FieldShape fieldShape);
}
