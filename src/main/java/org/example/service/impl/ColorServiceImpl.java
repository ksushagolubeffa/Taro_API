package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.models.ColorEntity;
import org.example.models.TaroEntity;
import org.example.models.dto.TaroResponse;
import org.example.models.dto.color.ColorResponse;
import org.example.repository.ColorRepository;
import org.example.service.ColorService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RequiredArgsConstructor
@Component
public class ColorServiceImpl implements ColorService {

    private final ColorRepository repository;

    @Override
    public List<ColorResponse> getAll() {
        List<ColorResponse> responses = new ArrayList<>();
        for (ColorEntity colorEntity : repository.findAll()) {
            responses.add(new ColorResponse(
                    colorEntity.getColor(),
                    colorEntity.getDescription()));
        }
        return responses;
    }

    @Override
    public ColorResponse getRandom() {
        List<ColorResponse> list = getAll();
        Random random = new Random();
        int index = random.nextInt(list.size()-1);
        return list.get(index);
    }


}
