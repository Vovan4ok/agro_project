package com.agro.agro_project.dao;

import com.agro.agro_project.domain.MachineTaskFieldMappingItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("machineTaskFieldMappingItemRepository")
public interface MachineTaskFieldMappingItemRepository extends JpaRepository<MachineTaskFieldMappingItem, Integer> {
    Optional<MachineTaskFieldMappingItem> readMachineTaskFieldMappingItemByFieldId(int fieldId);

    Optional<MachineTaskFieldMappingItem> readMachineTaskFieldMappingItemByMachineTaskId(int machineTaskId);
}
