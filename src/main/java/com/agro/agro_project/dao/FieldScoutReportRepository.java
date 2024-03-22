package com.agro.agro_project.dao;

import com.agro.agro_project.domain.Field;
import com.agro.agro_project.domain.FieldScoutReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("fieldScoutReportRepository")
public interface FieldScoutReportRepository extends JpaRepository<FieldScoutReport, Integer> {
    Optional<FieldScoutReport> findById(Integer integer);

    List<FieldScoutReport> findAllByField(Field field);
}
