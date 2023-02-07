package com.ramon.exception;

public class CharacterNotFound extends RuntimeException {
    public CharacterNotFound(Long id){
        super("This ID " + id + " dont match with any on database");
    }
}
