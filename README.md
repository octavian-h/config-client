# config-client

## Description

This is a simple client that consumes configs from config-server and is notified when a config is changed.
The configs are read:

- using @Value and @RefreshScope
- using @ConfigurationProperties (with value and variable)
- using a specific namespace from Spring Cloud Config Server

## Requirements

To build and run this application you need to install the followings:

- JDK 21 or later
- Maven

On MacOS you can use these commands (assuming that [Homebrew](https://brew.sh/) is already installed:

```bash
brew install openjdk@21
brew install --ignore-dependencies maven
```

## Usage

First you need to start [config-server](https://github.com/octavian-h/config-server)
After that, run the following commands:

```bash
mvn clean package
java -jar ./target/client.jar
```

The available endpoints can be seen on [Swagger UI](http://127.0.0.1:8080/swagger-ui.html).