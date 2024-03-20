package com.agro.agro_project.dao;

import com.agro.agro_project.domain.LandParcel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("landParcelRepository")
public interface LandParcelRepository extends JpaRepository<LandParcel, Integer> {
    Optional<LandParcel> findById(Integer id);

    List<LandParcel> findAll();
}
