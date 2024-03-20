package com.agro.agro_project.dao;

import com.agro.agro_project.domain.MachineTaskFieldMappingItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("machineTaskFieldMappingItemRepository")
public interface MachineTaskFieldMappingItemRepository extends JpaRepository<MachineTaskFieldMappingItem, Integer> {
    List<MachineTaskFieldMappingItem> findAllByFieldId(int fieldId);

    Optional<MachineTaskFieldMappingItem> findByMachineTaskId(int machineTaskId);
}
