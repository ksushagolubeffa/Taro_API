package org.example.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Map;

@RequestMapping("/random")
public interface DayAlignmentAPI {

    @GetMapping("/yesno")
    String getYesNo();

    @GetMapping("/color")
    Map<String, String> getColor();

    @GetMapping("/number")
    Map<Integer, String> getNumber();

    @GetMapping("/cookie")
    String getCookie();
}
