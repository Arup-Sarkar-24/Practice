package com.cisco.chatgbtdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cisco.chatgbtdemo.services.ChatService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/chat")
public class ChatController {
    private final ChatService chatService;

    @Autowired
    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping
    public String chat(@RequestBody String message) {
        return chatService.generateResponse(message);
    }
}
