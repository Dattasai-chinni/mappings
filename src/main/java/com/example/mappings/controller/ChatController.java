package com.example.mappings.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

import com.example.mappings.dto.ChatMessage;

@RestController
public class ChatController {

    @MessageMapping("/sendMessage")
    @SendTo("/topic/public")
    public ChatMessage sendMessage(ChatMessage chatMessage) {
        return chatMessage;
    }

    @MessageMapping("/newUser")
    @SendTo("/topic/public")
    public ChatMessage newUser(ChatMessage chatMessage) {
        chatMessage.setType(ChatMessage.MessageType.JOIN);
        return chatMessage;
    }
}