package org.example.api.controller;

import lombok.RequiredArgsConstructor;
import org.example.api.ColorAPI;
import org.example.models.dto.color.ColorResponse;
import org.example.service.ColorService;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ColorController implements ColorAPI {
    private final ColorService service;

    @Override
    public ColorResponse getColor() {
        return service.getRandom();
    }
}
