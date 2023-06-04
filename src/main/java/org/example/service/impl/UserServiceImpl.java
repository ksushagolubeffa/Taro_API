package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.models.UserEntity;
import org.example.models.dto.user.UserRequest;
import org.example.models.dto.user.UserResponse;
import org.example.repository.UserRepository;
import org.example.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.function.Function;

@Component
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    private final Function<UserEntity, UserResponse> toResponse = ent -> {
        return new UserResponse(ent.getUuid(), ent.getUsername(), ent.getEmail(), ent.getPassword(), ent.getBirth(), ent.getMale());
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

    @Override
    public UserResponse doUpdate(UserRequest request) {
        UserEntity user = repository.findUserEntityByEmail(request.getEmail());
        user.setUsername(request.getUsername());
        user.setBirth(request.getBirth());
        user.setMale(request.getMale());
        repository.save(user);
        return toResponse.apply(user);
    }

    @Override
    public UserResponse getByEmail(String email){
        if (repository.findUserEntityByEmail(email) == null){
            throw new RuntimeException();
        }else {
            return toResponse.apply(repository.findUserEntityByEmail(email));
        }
    }

    @Override
    public UserResponse getOneUser() {
        List<UserEntity> list = repository.findAll();
        Random random = new Random();
        return toResponse.apply(list.get(random.nextInt(list.size() -1)));
    }
}
