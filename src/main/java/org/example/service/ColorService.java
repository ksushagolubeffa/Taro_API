package org.example.service;

import org.example.models.dto.color.ColorResponse;

import java.util.List;

public interface ColorService {

    List<ColorResponse> getAll();

    ColorResponse getRandom();
}
