package com.agro.agro_project.service;

import com.agro.agro_project.dao.AlertRepository;
import com.agro.agro_project.domain.Alert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("alertService")
public class AlertService {
    @Autowired
    AlertRepository alertRepository;

    public AlertService(AlertRepository alertRepository) {
        this.alertRepository = alertRepository;
    }

    public Alert findById(Integer id) {
        return alertRepository.findById(id).get();
    }

    public List<Alert> findAllByAlertableIdAndAlertableType(Integer id, String alertableType) {
        return alertRepository.findAllByAlertableIdAndAlertableType(id, alertableType);
    }
}
