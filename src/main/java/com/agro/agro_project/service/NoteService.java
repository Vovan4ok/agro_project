package com.agro.agro_project.service;

import com.agro.agro_project.dao.NoteRepository;
import com.agro.agro_project.domain.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("noteService")
public class NoteService {
    @Autowired
    NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public List<Note> getNotes(Integer notableId, String notableType) {
        return noteRepository.findAllByNotableIdAndNotableType(notableId, notableType);
    }
}
