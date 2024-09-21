package com.Profile.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
    @Value("${spring.messages}")
    private String message;
    @Value("${spring.messages}")
    private String message2;

    @GetMapping("/profile")
    public String getProfile() {
        return message+" ("+message2+")";
    }
    @GetMapping("/profiles")
    public String getProfiles() {
        return message+" ("+message2+")";
    }
}


