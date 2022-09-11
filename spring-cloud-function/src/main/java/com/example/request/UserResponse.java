package com.example.request;

import com.example.models.User;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;

public class UserResponse implements Message {

    private User user;
    public UserResponse(User user) {
        this.user = user;
    }
    @Override
    public Object getPayload() {
        return user;
    }

    @Override
    public MessageHeaders getHeaders() {
        return null;
    }


}
