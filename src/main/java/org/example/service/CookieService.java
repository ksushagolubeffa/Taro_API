package org.example.service;

import org.example.models.dto.cookie.CookieResponse;
import org.example.models.number.NumberResponse;

import java.util.List;

public interface CookieService {

    List<CookieResponse> getAll();

    CookieResponse getRandom();
}
