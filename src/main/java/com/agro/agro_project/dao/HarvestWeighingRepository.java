package com.agro.agro_project.dao;

import com.agro.agro_project.domain.HarvestWeighing;
import com.agro.agro_project.domain.Machine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("harvestWeighingRepository")
public interface HarvestWeighingRepository extends JpaRepository<HarvestWeighing, Integer> {
    Optional<HarvestWeighing> findById(Integer id);

    List<HarvestWeighing> findAllByMachine(Machine machine);

    List<HarvestWeighing> findAllByMachineAndSeason(Machine machine, Short season);
}
