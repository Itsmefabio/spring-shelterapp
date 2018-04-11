package com.dmigus.shelterapp.beans;


import org.springframework.stereotype.Component;

@Component
public class Mail {


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }




    String message;

    public String getRecipent() {
        return recipent;
    }

    public void setRecipent(String recipent) {
        this.recipent = recipent;
    }

    String sender;
    String subject;

    @Override
    public String toString() {
        return "Mail{" +
                "message='" + message + '\'' +
                ", sender='" + sender + '\'' +
                ", subject='" + subject + '\'' +
                ", recipent='" + recipent + '\'' +
                '}';
    }

    String recipent;
}