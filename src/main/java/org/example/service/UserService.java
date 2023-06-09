package org.example.service;

import org.example.models.dto.user.UserRequest;
import org.example.models.dto.user.UserResponse;

public interface UserService {

    UserResponse doRegister(UserRequest request);

    UserResponse doLogin(String login, String password);

    UserResponse doUpdate(UserRequest request);

    UserResponse getByEmail(String email);

    UserResponse getOneUser(String email);
}
