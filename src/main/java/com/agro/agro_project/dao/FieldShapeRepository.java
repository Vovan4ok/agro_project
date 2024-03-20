package com.agro.agro_project.dao;

import com.agro.agro_project.domain.Field;
import com.agro.agro_project.domain.FieldShape;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("fieldShapeRepository")
public interface FieldShapeRepository extends JpaRepository<FieldShape, Integer> {
    List<FieldShape> findAllByField(Field field);
}
