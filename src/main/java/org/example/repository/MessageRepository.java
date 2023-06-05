package org.example.repository;

import org.example.models.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MessageRepository extends JpaRepository<MessageEntity, Long> {

    List<MessageEntity> findMessageEntitiesBySender(String sender);

    List<MessageEntity> findMessageEntitiesByReceiver(String receiver);

    @Query("SELECT m FROM MessageEntity m WHERE (m.sender = :sender AND m.receiver = :receiver) OR (m.sender = :receiver AND m.receiver = :sender)")
    List<MessageEntity> findMessageEntitiesBySenderAndReceiver(@Param("sender") String sender, @Param("receiver") String receiver);

}
