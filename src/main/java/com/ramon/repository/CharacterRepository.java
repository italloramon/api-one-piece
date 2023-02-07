package com.ramon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ramon.model.CharacterModel;

public interface CharacterRepository extends JpaRepository<CharacterModel, Long> {
    
}
