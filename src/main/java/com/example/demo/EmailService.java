package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendResponseEmail(String response) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("click2shatanshu@gmail.com");
            message.setTo("click2shatanshu@gmail.com"); // or other recipient
            message.setSubject("Apology Dialog Response");
            message.setText("User responded: " + response);
            mailSender.send(message);
            System.out.println("Email sent successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

