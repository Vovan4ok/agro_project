package com.agro.agro_project.dao;

import com.agro.agro_project.domain.Machine;
import com.agro.agro_project.domain.MachineTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;

@Repository("machineTaskRepository")
public interface MachineTaskRepository extends JpaRepository<MachineTask, Integer> {
    Optional<MachineTask> findById(Integer integer);

    List<MachineTask> readMachineTasksByMachine(Machine machine);

    List<MachineTask> readMachineTasksByImplementId(short id);
}
