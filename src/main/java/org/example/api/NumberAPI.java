package org.example.api;

import org.example.models.dto.color.ColorResponse;
import org.example.models.number.NumberResponse;
import org.springframework.web.bind.annotation.GetMapping;

public interface NumberAPI {
    @GetMapping("/random/number")
    NumberResponse getNumber() ;
}
