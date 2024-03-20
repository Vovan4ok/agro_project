package com.agro.agro_project.dao;

import com.agro.agro_project.domain.Machine;
import com.agro.agro_project.domain.MachineRegionMappingItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("machineRegionMappingItemRepository")
public interface MachineRegionMappingItemRepository extends JpaRepository<MachineRegionMappingItem, Short> {
    Optional<MachineRegionMappingItem> readMachineRegionMappingItemByMachine(Machine machine);
}
