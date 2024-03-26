package com.agro.agro_project.service;

import com.agro.agro_project.dao.SeasonRepository;
import com.agro.agro_project.domain.Season;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("seasonService")
public class SeasonService {
    @Autowired
    SeasonRepository seasonRepository;

    public SeasonService(SeasonRepository seasonRepository) {
        this.seasonRepository = seasonRepository;
    }

    public List<Season> findAll() {
        return seasonRepository.findAll();
    }
}
