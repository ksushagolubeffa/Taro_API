package org.example.api;

import org.example.models.dto.user.UserRequest;
import org.example.models.dto.user.UserResponse;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
public interface UserAPI {

    @PostMapping("/register")
    UserResponse register(@RequestBody UserRequest request);

    @GetMapping("/login/{login}/{password}")
    UserResponse login(@PathVariable("login") String login, @PathVariable("password") String password);

    @PostMapping("/update")
    UserResponse update(@RequestBody UserRequest request);

    @GetMapping("/getUser/{email}")
    UserResponse findByEmail(@PathVariable("email") String email);

    @GetMapping("/get/{zodiac}/{email}")
    UserResponse findOneUser(@PathVariable("zodiac") String zodiac, @PathVariable("email") String email);
}
