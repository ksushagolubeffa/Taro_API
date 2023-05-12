package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.models.TaroEntity;
import org.example.models.dto.TaroResponse;
import org.example.repository.TaroCardRepository;
import org.example.service.TaroService;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
public class TaroServiceImpl implements TaroService {

    private Function<TaroEntity, TaroResponse> fromEntityToResponse = ent -> {
        if (ent.getLasso().equals("low")){
            return TaroResponse.builder()
                    .description(ent.getDescription())
                    .dignity(ent.getDignity())
                    .lasso(ent.getLasso())
                    .name(ent.getName())
                    .suit(null)
                    .build();
        }else {
            return TaroResponse.builder()
                    .description(ent.getDescription())
                    .dignity(ent.getDignity())
                    .lasso(ent.getLasso())
                    .name(null)
                    .suit(ent.getSuit())
                    .build();
        }
    };

    private final TaroCardRepository repository;

    @Override
    public TaroResponse getOneCardById(Long id) {
        TaroEntity byId = repository.findById(id).get();
        return new TaroResponse(id, byId.getDignity(),
                byId.getDescription(),
                byId.getLasso(),
                byId.getSuit(),
                byId.getName());
    }

    @Override
    public List<TaroResponse> getAllCards() {
        List<TaroResponse> responses = new ArrayList<>();
        for (TaroEntity taroEntity : repository.findAll()) {
            responses.add(new TaroResponse(taroEntity.getId(),
                    taroEntity.getDignity(),
                    taroEntity.getDescription(),
                    taroEntity.getLasso(),
                    taroEntity.getSuit(),
                    taroEntity.getName()));
        }
        return responses;
    }

    @Override
    public List<TaroResponse> getCardsById(List<Long> listId){
        List<TaroResponse> result = new ArrayList<>();
        for (Long id: listId) {
            result.add(getOneCardById(id));
        }
        return result;
    }

    @Override
    public List<TaroResponse> getRandomCountOfCards(Integer countOfCards) {
        int number = new Random().nextInt(78 - countOfCards - 1);
        return getAllCards().stream().skip(number).limit(countOfCards).collect(Collectors.toList());
    }
}
