package org.example.models.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    private String username;
    private String password;
    private String passwordRepeat;
    private String email;
    private String birth;
    private Boolean male; // true - man / false - woman

}
