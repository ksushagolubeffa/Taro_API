package org.example.api.controller;

import lombok.RequiredArgsConstructor;
import org.example.api.YesNoAPI;
import org.example.models.dto.yesno.YesNoResponse;
import org.example.service.ColorService;
import org.example.service.YesNoService;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class YesNoController implements YesNoAPI {

    private final YesNoService service;

    @Override
    public YesNoResponse getYesNo() {
        return service.getRandom();
    }
}
