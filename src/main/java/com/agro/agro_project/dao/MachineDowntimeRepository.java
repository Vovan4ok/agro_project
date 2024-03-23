package com.agro.agro_project.dao;

import com.agro.agro_project.domain.MachineDowntime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("machineDowntimeRepository")
public interface MachineDowntimeRepository extends JpaRepository<MachineDowntime, Integer> {
    List<MachineDowntime> findAllByMachineId(Short machineId);
}
