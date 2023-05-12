package org.example.api.controller;

import lombok.RequiredArgsConstructor;
import org.example.api.TaroAPI;
import org.example.models.dto.TaroResponse;
import org.example.service.impl.TaroServiceImpl;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class TaroController implements TaroAPI {

    private final TaroServiceImpl service;

    @Override
    public List<TaroResponse> getCardsById(List<Long> listId) {
        return service.getCardsById(listId);
    }

    @Override
    public TaroResponse getOneCard(Long id) {
        return service.getOneCardById(id);
    }

    @Override
    public List<TaroResponse> getAll() {
        return service.getAllCards();
    }

    @Override
    public List<TaroResponse> getWithRandomCount(Integer count) {
        return service.getRandomCountOfCards(count);
    }
}
