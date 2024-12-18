package ro.hasna.tutorials.config_client.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "greeting")
public class GreetingConfig {

    private String value;
    private String variable;
}