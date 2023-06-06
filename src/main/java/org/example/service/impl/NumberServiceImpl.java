package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.models.ColorEntity;
import org.example.models.NumberEntity;
import org.example.models.dto.color.ColorResponse;
import org.example.models.number.NumberResponse;
import org.example.repository.ColorRepository;
import org.example.repository.NumberRepository;
import org.example.service.NumberService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RequiredArgsConstructor
@Component
public class NumberServiceImpl implements NumberService {

    private final NumberRepository repository;

    @Override
    public List<NumberResponse> getAll() {
        List<NumberResponse> responses = new ArrayList<>();
        for (NumberEntity colorEntity : repository.findAll()) {
            responses.add(new NumberResponse(
                    colorEntity.getNumber(),
                    colorEntity.getDescription()));
        }
        return responses;
    }

    @Override
    public NumberResponse getRandom() {
        List<NumberResponse> list = getAll();
        Random random = new Random();
        int index = random.nextInt(list.size()-1);
        return list.get(index);
    }
}
