package org.example.service;

import org.example.models.dto.yesno.YesNoResponse;
import org.example.models.number.NumberResponse;

import java.util.List;

public interface YesNoService {
    List<YesNoResponse> getAll();

    YesNoResponse getRandom();
}
