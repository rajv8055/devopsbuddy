package com.devopsbuddy.backend.service;

import com.devopsbuddy.web.domain.frontend.FeedbackPojo;
import org.springframework.mail.SimpleMailMessage;

public interface EmailService {

    /*sends and email with the content in the feedback Pojo*/

    public void sendFeedbackEmail (FeedbackPojo feedbackPojo);

    /*Sends an email with the content of the simple Mail Message object*/

    public void sendGenericEmailMessage(SimpleMailMessage  message);
}
