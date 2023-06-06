package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.models.ColorEntity;
import org.example.models.YesNoEntity;
import org.example.models.dto.color.ColorResponse;
import org.example.models.dto.yesno.YesNoResponse;
import org.example.repository.ColorRepository;
import org.example.repository.YesNoRepository;
import org.example.service.YesNoService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RequiredArgsConstructor
@Component
public class YesNoServiceImpl implements YesNoService {

    private final YesNoRepository repository;

    @Override
    public List<YesNoResponse> getAll() {
        List<YesNoResponse> responses = new ArrayList<>();
        for (YesNoEntity colorEntity : repository.findAll()) {
            responses.add(new YesNoResponse(
                    colorEntity.getDescription()));
        }
        return responses;
    }

    @Override
    public YesNoResponse getRandom() {
        List<YesNoResponse> list = getAll();
        Random random = new Random();
        int index = random.nextInt(list.size()-1);
        return list.get(index);
    }
}
