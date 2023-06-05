package org.example.models.dto.message;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MessageResponse {
    private String sender;
    private String receiver;
    private String text;
    private LocalDateTime date;

    public LocalDateTime getDate() {
        return date;
    }
}
