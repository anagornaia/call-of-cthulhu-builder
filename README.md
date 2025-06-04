# Call of Cthulhu Builder

This repository contains a small Spring Boot service used for creating and managing Call of Cthulhu characters. The application relies on a PostgreSQL database and is intended to be run locally using Docker.

## Requirements

- Java 17
- Docker (required both for the runtime database and Testcontainers based integration tests)

## Build and Run

Execute the service using the Maven wrapper from within `character-builder-service`:

```bash
./mvnw spring-boot:run
```

## Integration Tests

Run all tests, including those that use Testcontainers, with:

```bash
./mvnw test
```

Docker must be available for the PostgreSQL container started by Testcontainers.

## compose.yaml

The `compose.yaml` file inside `character-builder-service` defines a simple PostgreSQL container. It exposes port `5432` and sets up default credentials (user `myuser`, password `secret`, database `mydatabase`). This file can be used to run Postgres locally if you prefer managing the database outside Testcontainers.

