package org.example.api;

import org.example.models.dto.message.MessageRequest;
import org.example.models.dto.message.MessageResponse;
import org.example.models.dto.user.UserRequest;
import org.example.models.dto.user.UserResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/message")
public interface MessageAPI {

    @PostMapping("/save")
    MessageResponse save(@RequestBody MessageRequest request);

//    @GetMapping("/getByReceiver/{receiver}")
//    List<MessageResponse> findByReceiver(@PathVariable("receiver") String receiver);

    @GetMapping("/get/{sender}/{receiver}")
    List<MessageResponse> findBySenderAndReceiver(@PathVariable("sender") String sender, @PathVariable("receiver") String receiver);
}
