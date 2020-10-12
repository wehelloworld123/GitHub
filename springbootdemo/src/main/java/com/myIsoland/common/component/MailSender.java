package com.fc.test.common.component;

import com.fc.test.model.custom.email.MailSenderInfo;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MailSender {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(MailSenderInfo email){
        CorrelationData correlationData = new CorrelationData();
        correlationData.setId("123456");
        rabbitTemplate.convertAndSend("mail-exchange",
                "mail.text",email,correlationData);
    }
}
