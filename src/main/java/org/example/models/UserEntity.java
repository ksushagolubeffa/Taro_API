package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "u_table")
public class UserEntity extends AbstractEntity{

    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String birth;
    @Column
    private Boolean male;
    @Column
    private String email;

}
