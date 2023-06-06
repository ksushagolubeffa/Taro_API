package org.example.api;

import org.example.models.dto.cookie.CookieResponse;
import org.example.models.number.NumberResponse;
import org.springframework.web.bind.annotation.GetMapping;

public interface CookieAPI {
    @GetMapping("/random/cookie")
    CookieResponse getCookie() ;
}
