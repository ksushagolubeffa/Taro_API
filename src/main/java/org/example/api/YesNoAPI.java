package org.example.api;

import org.example.models.dto.cookie.CookieResponse;
import org.example.models.dto.yesno.YesNoResponse;
import org.springframework.web.bind.annotation.GetMapping;

public interface YesNoAPI {
    @GetMapping("/random/yesno")
    YesNoResponse getYesNo() ;
}
