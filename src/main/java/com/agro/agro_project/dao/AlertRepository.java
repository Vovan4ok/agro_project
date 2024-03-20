package com.agro.agro_project.dao;

import com.agro.agro_project.domain.Alert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("alertRepository")
public interface AlertRepository extends JpaRepository<Alert, Integer> {
    Optional<Alert> findById(Integer id);

    List<Alert> findAllByAlertableIdAndAlertableType(int id, String alertableType);
}
