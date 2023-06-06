package org.example.api.controller;

import lombok.RequiredArgsConstructor;
import org.example.api.NumberAPI;
import org.example.models.number.NumberResponse;
import org.example.service.ColorService;
import org.example.service.NumberService;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class NumberController implements NumberAPI {

    private final NumberService service;

    @Override
    public NumberResponse getNumber() {
        return service.getRandom();
    }
}
