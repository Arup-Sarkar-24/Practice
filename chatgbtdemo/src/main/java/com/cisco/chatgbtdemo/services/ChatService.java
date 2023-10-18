package com.cisco.chatgbtdemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatService {
	private final ChatGPT chatGPT;

    @Autowired
    public ChatService(ChatGPT chatGPT) {
        this.chatGPT = chatGPT;
    }

    public String generateResponse(String message) {
        return chatGPT.generateResponse(message);
    }

	public String generateResponse(String message) {
		// TODO Auto-generated method stub
		return null;
	}

}
