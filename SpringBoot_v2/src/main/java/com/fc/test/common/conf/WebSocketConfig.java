package com.fc.test.common.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @author: wusq
 * @date: 2018/12/1
 */
@Configuration
public class WebSocketConfig   implements WebSocketMessageBrokerConfigurer {

   /* @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        //
        config.enableSimpleBroker("/MessageMapping");// /users 默认通知
        config.setApplicationDestinationPrefixes("/SendTo");
        //设置前缀  默认是user 可以修改  点对点时使用 , 不使用
        config.setUserDestinationPrefix("/user-wlh/");
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        //
        registry.addEndpoint("/websocket").withSockJS();
        }*/
}