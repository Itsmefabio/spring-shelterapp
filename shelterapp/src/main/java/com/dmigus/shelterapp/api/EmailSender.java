package com.dmigus.shelterapp.api;

public interface EmailSender {
    void sendEmail(String to, String subject, String content, String Sender);
}
