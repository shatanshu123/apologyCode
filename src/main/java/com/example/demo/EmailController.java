package com.example.demo;


import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
//@CrossOrigin(origins = "http://localhost:4200")
public class EmailController {

    @Autowired
    private EmailService emailService;
    private static final Logger log = LoggerFactory.getLogger(EmailService.class);

    @PostMapping("/apology-response")
    public ResponseEntity<String> receiveResponse(@RequestBody Map<String, String> payload) {
        String response = payload.get("response");
        log.info("Received response: {}", response);
        emailService.sendResponseEmail(response);
        return ResponseEntity.ok("Email sent with response: " + response);
    }
}
