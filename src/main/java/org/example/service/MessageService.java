package org.example.service;

import org.example.models.MessageEntity;
import org.example.models.dto.message.MessageRequest;
import org.example.models.dto.message.MessageResponse;

import java.util.List;

public interface MessageService {

    List<MessageResponse> getBySender(String sender);

    List<MessageResponse> getByReceiver(String receiver);

    MessageResponse saveMessage(MessageRequest request);

    List<MessageResponse> getBySenderAndReceiver(String sender, String receiver);
}
