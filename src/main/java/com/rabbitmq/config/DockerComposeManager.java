package com.rabbitmq.config;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import java.io.IOException;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DockerComposeManager {

    @PostConstruct
    public void startDockerCompose() {
        try {
            Process process = new ProcessBuilder("docker-compose", "up", "-d").inheritIO().start();
            process.waitFor();
          log.info("Docker Compose started successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @PreDestroy
    public void stopDockerCompose() {
        try {
            Process process = new ProcessBuilder("docker-compose", "down").inheritIO().start();
            process.waitFor();
            log.info("Docker Compose stopped successfully.");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
