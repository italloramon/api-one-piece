package com.ramon.model;

import lombok.Builder;
import lombok.Data;
import java.util.List;

@Builder
@Data
public class PaginatedCharacterResponse {
    private List<CharacterModel> characterList;
    private Long numberOfItems;
    private int numberOfPages;
}
