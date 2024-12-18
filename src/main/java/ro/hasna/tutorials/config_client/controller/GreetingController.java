package ro.hasna.tutorials.config_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import ro.hasna.tutorials.config_client.config.GreetingConfig;

@RequiredArgsConstructor
@RestController
//@RefreshScope
@RequestMapping("/v1/greetings")
public class GreetingController {

    @Value("${params.message}")
    private final String textMessage;
    private final GreetingConfig config;

    @GetMapping("/1")
    public String getFirstGreeting() {
        return "Greeting 1: " + textMessage;
    }

    @GetMapping("/2")
    public String getSecondGreeting() {
        return "Greeting 2: " + config.getValue();
    }

    @GetMapping("/3")
    public String getThirdGreeting() {
        return "Greeting 3: " + config.getVariable();
    }
}
