package com.agro.agro_project.dao;

import com.agro.agro_project.domain.Implement;
import com.agro.agro_project.domain.ImplementRegionMappingItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("implementRegionMappingItemRepository")
public interface ImplementRegionMappingItemRepository extends JpaRepository<ImplementRegionMappingItem, Short> {
    List<ImplementRegionMappingItem> findAllByImplement(Implement implement);

    List<ImplementRegionMappingItem> findAllByNoDateEnd(Boolean noDateEnd);

    Optional<ImplementRegionMappingItem> findByImplementAndNoDateEnd(Implement implement, Boolean noDateEnd);
}
