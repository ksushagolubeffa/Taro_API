package org.example.api.controller;

import lombok.RequiredArgsConstructor;
import org.example.api.CookieAPI;
import org.example.models.dto.cookie.CookieResponse;
import org.example.service.ColorService;
import org.example.service.CookieService;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CookieController implements CookieAPI {

    private final CookieService service;

    @Override
    public CookieResponse getCookie() {
        return service.getRandom();
    }
}
