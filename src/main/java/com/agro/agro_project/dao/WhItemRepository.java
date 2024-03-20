package com.agro.agro_project.dao;

import com.agro.agro_project.domain.WhItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("whItemRepository")
public interface WhItemRepository extends JpaRepository<WhItem, Short> {
    Optional<WhItem> findById(Short id);

    List<WhItem> findAll();
}
