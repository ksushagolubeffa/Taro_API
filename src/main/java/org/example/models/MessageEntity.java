package org.example.models;

import ch.qos.logback.classic.pattern.DateConverter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

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
    @Column
    private LocalDateTime date;

    public MessageEntity(String sender, String receiver, String text, LocalDateTime date){
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = date;
    }

    public LocalDateTime getDate() {
        return date;
    }

//    @PrePersist
//    private void onCreate() {
//        date = LocalDateTime.now();
//    }

}
