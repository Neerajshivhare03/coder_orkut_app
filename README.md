# Coder Orkut App

A small Java/Maven repository containing an initial Java application class and early Docker/Kubernetes-related files.

## Current contents

- Maven project descriptor: `pom.xml`
- Java source: `src/main/java/in/coder/Welcome.java`
- Kubernetes-related file: `src/main/java/in/coder/Kubernetsfile`
- Kubernetes YAML placeholder: `src/main/java/in/coder/k8s-development.yml`
- Dockerfile placeholder: `DockerFile`

## Technology currently declared

- Java source code
- Maven
- Spring Framework Core 6.1.14 dependency

The current Maven descriptor does not declare Spring Boot or a web application stack.

## Prerequisites

- A JDK compatible with the project source
- Maven

## Build

```bash
mvn clean package
```

## Current status and notes

This repository appears to be an early starter/demo rather than a complete Orkut-style social networking application. The Dockerfile and Kubernetes YAML currently appear as empty placeholders in the repository. The Kubernetes-related filename is also misspelled as `Kubernetsfile`.

## Suggested next steps

1. Define the application's actual features and architecture.
2. Add a proper Maven compiler configuration and tests.
3. Implement application functionality before describing it as a social networking product.
4. Add a valid Dockerfile after the application build is runnable.
5. Add Kubernetes Deployment and Service manifests with the correct image and ports.
6. Add setup instructions and screenshots when the application is functional.

Do not treat the Docker or Kubernetes placeholders as working deployment configurations yet.
