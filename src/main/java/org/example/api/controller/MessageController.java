package org.example.api.controller;


import lombok.RequiredArgsConstructor;
import org.example.api.MessageAPI;
import org.example.models.dto.message.MessageRequest;
import org.example.models.dto.message.MessageResponse;
import org.example.service.MessageService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MessageController implements MessageAPI {

    private final MessageService service;

    @Override
    public MessageResponse save(MessageRequest request) {
        return service.saveMessage(request);
    }

    @Override
    public List<MessageResponse> findByReceiver(String receiver) {
        return service.getByReceiver(receiver);
    }

    @Override
    public List<MessageResponse> findBySender(String sender) {
        return service.getBySender(sender);
    }

}
