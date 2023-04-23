package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.models.UserEntity;
import org.example.models.dto.user.UserRequest;
import org.example.models.dto.user.UserResponse;
import org.example.repository.UserRepository;
import org.example.service.UserService;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.function.Function;

@Component
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    private final Function<UserEntity, UserResponse> toResponse = ent -> {
        return new UserResponse(ent.getUuid(), ent.getUsername(), ent.getBirth(), ent.getMale());
    };

    @Override
    public UserResponse doRegister(UserRequest request) {
        UserEntity user = repository
                .save(new UserEntity(
                        request.getUsername(),
                        request.getPassword(),
                        request.getBirth(),
                        request.getMale(),
                        request.getEmail()));
        return toResponse.apply(user);
    }

    @Override
    public UserResponse doLogin(String login, String password) {
        if (repository.findUserEntityByUsernameAndPassword(login, password) == null){
            System.out.println(repository.findById(UUID.fromString("2132c95a-2e60-4989-8139-b9bc4341a5b6")).get().toString());
            throw new RuntimeException();
        }else {
            return toResponse.apply(repository.findUserEntityByUsernameAndPassword(login, password));
        }
    }
}
