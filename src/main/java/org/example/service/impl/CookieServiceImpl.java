package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.models.ColorEntity;
import org.example.models.CookieEntity;
import org.example.models.dto.color.ColorResponse;
import org.example.models.dto.cookie.CookieResponse;
import org.example.repository.ColorRepository;
import org.example.repository.CookieRepository;
import org.example.service.CookieService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RequiredArgsConstructor
@Component
public class CookieServiceImpl implements CookieService {

    private final CookieRepository repository;

    @Override
    public List<CookieResponse> getAll() {
        List<CookieResponse> responses = new ArrayList<>();
        for (CookieEntity colorEntity : repository.findAll()) {
            responses.add(new CookieResponse(
                    colorEntity.getDescription()));
        }
        return responses;
    }

    @Override
    public CookieResponse getRandom() {
        List<CookieResponse> list = getAll();
        Random random = new Random();
        int index = random.nextInt(list.size()-1);
        return list.get(index);
    }
}
