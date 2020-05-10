package com.techprimers.messaging.standaloneactivemqexample.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @JmsListener(destination = "standalone.queue2")
    public void consume(String message) {
        System.out.println("Received Message: " + message);
    }
}
