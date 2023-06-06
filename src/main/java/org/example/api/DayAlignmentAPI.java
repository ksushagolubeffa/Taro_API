package org.example.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;

@RequestMapping("/random")
public interface DayAlignmentAPI {

    @GetMapping("/yes_no")
    String getYesNo();

    @GetMapping("/colors")
    Map<String, String> getColor(HttpServletResponse response) throws IOException;

    @GetMapping("/numbers")
    ResponseEntity<Map<Integer, String>> getNumber();

    @GetMapping("/cookies")
    String getCookie() throws UnsupportedEncodingException;
}
