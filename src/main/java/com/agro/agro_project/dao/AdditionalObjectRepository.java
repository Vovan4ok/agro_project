package com.agro.agro_project.dao;

import com.agro.agro_project.domain.AdditionalObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("additionalObjectRepository")
public interface AdditionalObjectRepository extends JpaRepository<AdditionalObject, Short> {
    List<AdditionalObject> findAll();
}
