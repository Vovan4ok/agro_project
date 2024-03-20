package com.agro.agro_project.dao;

import com.agro.agro_project.domain.Machine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("machineRepository")
public interface MachineRepository extends JpaRepository<Machine, Integer> {
    Optional<Machine> findById(Integer integer);

    List<Machine> findAll();
}
