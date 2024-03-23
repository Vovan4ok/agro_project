package com.agro.agro_project.dao;

import com.agro.agro_project.domain.Machine;
import com.agro.agro_project.domain.MachineRegionMappingItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("machineRegionMappingItemRepository")
public interface MachineRegionMappingItemRepository extends JpaRepository<MachineRegionMappingItem, Short> {
    List<MachineRegionMappingItem> findAllByMachine(Machine machine);

    Optional<MachineRegionMappingItem> findByMachineAndNoDateEnd(Machine machine, Boolean noDateEnd);

    List<MachineRegionMappingItem> findAllByNoDateEnd(Boolean noDateEnd);
}
