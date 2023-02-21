package com.ramon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import com.ramon.exception.CharacterNotFound;
import com.ramon.model.CharacterModel;
import com.ramon.repository.CharacterRepository;
import com.ramon.service.CharacterService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;

import java.util.List;

@RestController
public class CharacterController {
    private final CharacterRepository characterRepository;
    private final CharacterService characterService;

    public CharacterController(CharacterRepository characterRepository, CharacterService characterService) {
        this.characterRepository = characterRepository;
        this.characterService = characterService;
    }

    @Operation(summary = "Get the list of the characters")
    @GetMapping("/api/characters")
    public ResponseEntity getCharacters(@ParameterObject Pageable pageable) {
        return ResponseEntity.ok(characterService.getCharacters(pageable));
    }

    @Operation(summary = "Get the character by its id")
    @GetMapping("/api/characters/{id}")
    public CharacterModel getOne(@Parameter(description = "Id of a character to be searched") @PathVariable Long id) {
        return this.characterRepository.findById(id)
        .orElseThrow(() -> new CharacterNotFound(id));
    }

}
