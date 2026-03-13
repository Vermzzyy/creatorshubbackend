package com.creatorshub.creatorshub.DTO;

import com.creatorshub.creatorshub.entity.*;

public class AuthResponse {

    public User user;
    public String token;

    public AuthResponse(User user, String token){
        this.user = user;
        this.token = token;
    }

}
