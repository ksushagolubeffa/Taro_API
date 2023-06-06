package org.example.api;

import org.example.models.dto.color.ColorResponse;
import org.springframework.web.bind.annotation.GetMapping;

public interface ColorAPI {
    @GetMapping("/random/color")
    ColorResponse getColor() ;
}
