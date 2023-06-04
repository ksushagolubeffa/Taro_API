package org.example.repository;

import org.example.models.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<MessageEntity, Long> {

    List<MessageEntity> findMessageEntitiesBySender(String sender);

    List<MessageEntity> findMessageEntitiesByReceiver(String receiver);

}
