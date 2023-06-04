package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "messages")
public class MessageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String sender;
    @Column
    private String receiver;
    @Column
    private String text;

    public MessageEntity(String sender, String receiver, String text){
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
    }

}
