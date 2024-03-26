package com.agro.agro_project.dao;

import com.agro.agro_project.domain.Season;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("seasonRepository")
public interface SeasonRepository extends JpaRepository<Season, Short> {
    List<Season> findAll();
}
