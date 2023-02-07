package com.ramon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ramon.exception.CharacterNotFound;
import com.ramon.model.CharacterModel;
import com.ramon.repository.CharacterRepository;
import java.util.List;

@RestController
public class CharacterController {
    private final CharacterRepository characterRepository;

    public CharacterController(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @GetMapping("/api/characters")
    public List<CharacterModel> listAll() {
        return this.characterRepository.findAll();
    }

    @GetMapping("/api/characters/{id}")
    public CharacterModel getOne(@PathVariable Long id) {
        return this.characterRepository.findById(id)
        .orElseThrow(() -> new CharacterNotFound(id));
    }
    
}
