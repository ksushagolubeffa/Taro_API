package org.example.service;


import org.example.models.dto.TaroResponse;

import java.util.List;
import java.util.UUID;

public interface TaroService {

    List<TaroResponse> getCardsById(List<Long> listId);
    TaroResponse getOneCardById(Long id);
    List<TaroResponse> getAllCards();
    List<TaroResponse> getRandomCountOfCards(Integer countOfCards);

}
