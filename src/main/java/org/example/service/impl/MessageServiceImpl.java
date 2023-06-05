package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.models.MessageEntity;
import org.example.models.TaroEntity;
import org.example.models.dto.TaroResponse;
import org.example.models.dto.message.MessageRequest;
import org.example.models.dto.message.MessageResponse;
import org.example.repository.MessageRepository;
import org.example.repository.TaroCardRepository;
import org.example.service.MessageService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

@RequiredArgsConstructor
@Component
public class MessageServiceImpl implements MessageService {

    private final MessageRepository repository;

    @Override
    public List<MessageResponse> getBySender(String sender) {
        List<MessageResponse> response = new ArrayList<>();
        for (MessageEntity messageEntity : repository.findMessageEntitiesBySender(sender)) {
            response.add(new MessageResponse(
                    messageEntity.getSender(),
                    messageEntity.getReceiver(),
                    messageEntity.getText(),
                    messageEntity.getDate()));
        }
        return response;
    }

    @Override
    public List<MessageResponse> getByReceiver(String receiver) {
        List<MessageResponse> response = new ArrayList<>();
        for (MessageEntity messageEntity : repository.findMessageEntitiesByReceiver(receiver)) {
            response.add(new MessageResponse(
                    messageEntity.getSender(),
                    messageEntity.getReceiver(),
                    messageEntity.getText(),
                    messageEntity.getDate()));
        }
        return response;
    }

    @Override
    public MessageResponse saveMessage(MessageRequest request) {
        MessageEntity entity = new MessageEntity(request.getSender(), request.getReceiver(), request.getText(), LocalDateTime.now());
        repository.save(entity);
        return new MessageResponse(entity.getSender(), entity.getReceiver(), entity.getText(), entity.getDate());
    }

    @Override
    public List<MessageResponse> getBySenderAndReceiver(String sender, String receiver) {
        List<MessageResponse> response = new ArrayList<>();
        for (MessageEntity messageEntity : repository.findMessageEntitiesBySenderAndReceiver(sender, receiver)) {
            response.add(new MessageResponse(
                    messageEntity.getSender(),
                    messageEntity.getReceiver(),
                    messageEntity.getText(),
                    messageEntity.getDate()));
        }
        return response;
    }
}
