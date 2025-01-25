# Simple Spring Boot Application with RabbitMQ and Docker Compose

This repository demonstrates how to create a Spring Boot application that connects to RabbitMQ using Docker Compose. It provides the steps to set up RabbitMQ in a Docker container and interact with it from a Spring Boot application to send and receive messages.

## Table of Contents

- [Project Overview](#project-overview)
- [Prerequisites](#prerequisites)
- [Project Structure](#project-structure)
- [Setting Up the Project](#setting-up-the-project)
    - [Clone the Repository](#clone-the-repository)
    - [Spring Boot Application Setup](#spring-boot-application-setup)
    - [Docker Compose Setup](#docker-compose-setup)
    - [Application Properties](#application-properties)
    - [Sender Service](#sender-service)
    - [Receiver Service](#receiver-service)
    - [Main Application](#main-application)
- [Running the Application](#running-the-application)
    - [Starting RabbitMQ with Docker Compose](#starting-rabbitmq-with-docker-compose)
    - [Running the Spring Boot Application](#running-the-spring-boot-application)
    - [Testing the Application](#testing-the-application)
- [Stopping the Application](#stopping-the-application)
- [Troubleshooting](#troubleshooting)
- [Conclusion](#conclusion)
- [License](#license)

## Project Overview

This project demonstrates how to:

- Set up RabbitMQ using Docker Compose.
- Connect a Spring Boot application to RabbitMQ.
- Send and receive messages using RabbitMQ.
- Use Docker Compose to simplify the setup process for RabbitMQ.

## Prerequisites

Before you begin, ensure that you have the following installed on your machine:

- [Docker](https://www.docker.com/get-started) - For containerizing RabbitMQ and the Spring Boot app.
- [Docker Compose](https://docs.docker.com/compose/install/) - To manage multi-container Docker applications.
- [Java 11 or above](https://adoptopenjdk.net/) - Required to run the Spring Boot application.
- [Maven](https://maven.apache.org/) - To build and run the Spring Boot application (you can also use the Spring Boot Maven plugin).

## Project Structure

The project structure is as follows:

