package com.agro.agro_project.dao;

import com.agro.agro_project.domain.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("noteRepository")
public interface NoteRepository extends JpaRepository<Note, Integer> {
    List<Note> findAllByNotableIdAndNotableType(Integer notableId, String notableType);
}
