package com.expedia.demo.pact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration
@RestController
public class ProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderApplication.class, args);
	}

    @RequestMapping("/message")
    Message sendMessage() {
        return new Message("Hello World");
    }

    private class Message {
        public String text;

        public Message(String text) {
            this.text = text;
        }
    }
}
