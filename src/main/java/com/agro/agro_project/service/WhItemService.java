package com.agro.agro_project.service;

import com.agro.agro_project.dao.WhItemRepository;
import com.agro.agro_project.domain.WhItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("whItemService")
public class WhItemService {
    @Autowired
    WhItemRepository whItemRepository;

    public WhItemService(WhItemRepository whItemRepository) {
        this.whItemRepository = whItemRepository;
    }

    public WhItem findById(Short id) {
        return whItemRepository.findById(id).get();
    }

    public List<WhItem> findAll() {
        return whItemRepository.findAll();
    }
}
