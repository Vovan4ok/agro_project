package com.agro.agro_project.dao;

import com.agro.agro_project.domain.MachineTaskAgroOperationsMappingItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MachineTaskAgroOperationMappingItemRepository extends JpaRepository<MachineTaskAgroOperationsMappingItem, Integer> {
    List<MachineTaskAgroOperationsMappingItem> findAllByAgroOperationId(Integer agroOperationId);
}
