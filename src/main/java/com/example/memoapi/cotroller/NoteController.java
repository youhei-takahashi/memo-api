package com.example.memoapi.cotroller;

import com.example.memoapi.dto.Note;
import com.example.memoapi.service.NoteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/notes")
public class NoteController {
    private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping
    public ResponseEntity<List<Note>> findAllNotes() {
        List<Note> notes = noteService.findAll();

        return new ResponseEntity<>(notes, HttpStatus.OK);
    }
}
