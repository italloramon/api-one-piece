package com.ramon.service;

import com.ramon.model.*;
import com.ramon.repository.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CharacterService {

    private final CharacterRepository characterRepository;

    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public PaginatedCharacterResponse getCharacters(Pageable pageable) {
        Page<CharacterModel> characters = characterRepository.findAll(pageable);
        return PaginatedCharacterResponse.builder().numberOfItems(characters.getTotalElements()).numberOfPages(characters.getTotalPages()).characterList(characters.getContent()).build();
    }
}
