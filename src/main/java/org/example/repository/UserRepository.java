package org.example.repository;

import org.example.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {

    /**
     * @param username -> public user info
     * @param password -> inner pass in database
     * @return -> UserEntity -> after will be mapped to UserResponse in dto package
     */
    UserEntity findUserEntityByUsernameAndPassword(String username, String password);

    UserEntity findUserEntityByEmail(String email);

    @Query("SELECT u FROM UserEntity u where u.email <> :email")
    List<UserEntity> findUsers(@Param("email") String email);
}
