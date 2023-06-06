package org.example.service;

import org.example.models.dto.color.ColorResponse;
import org.example.models.number.NumberResponse;

import java.util.List;

public interface NumberService {

    List<NumberResponse> getAll();

    NumberResponse getRandom();
}
