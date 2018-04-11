package com.dmigus.shelterapp.Implementations;

import com.dmigus.shelterapp.api.EmailSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;

@Service
public class EmailSenderImpl implements EmailSender{

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public void sendEmail(String to, String title, String content, String sender) {
        MimeMessage mail = javaMailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(mail, true);
            helper.setTo(to);
            helper.setReplyTo(sender);
            helper.setFrom(sender);
            helper.setSubject(title);
            helper.setText(content, false);

        }

         catch (javax.mail.MessagingException e) {
            e.printStackTrace();
        }

        javaMailSender.send(mail);
    }
}