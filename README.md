# Spring Adventures

Reference project for mid-size Spring Boot applications

## Technology stack

- Java
- Spring Boot, Spring Modulith
- Postgres, JPA
- Maven

## Dependencies

- Maven
- Docker

## Development

### AdventureWorks database

The project builds upon the "AdventureWorks" database from [NorfolkDataSci/adventure-works-postgres](https://github.com/NorfolkDataSci/adventure-works-postgres).

```sh
docker compose up -d 
```

```sh
cd /path/to/adventure-works-postgres/

export PGPASSWORD=test

psql -h 0.0.0.0 -p 5432 -U test -c 'CREATE DATABASE "Adventureworks";'
psql -h 0.0.0.0 -p 5432 -U test -d Adventureworks < install.sql
```

### Start application

```sh
mvn spring-boot:run -Dspring-boot.run.profiles=dev
```

http://localhost:8080/swagger-ui/index.html

## Testing

### Component testing

```sh
mvn verify
```

### System testing

```sh
docker compose up -d
```

```sh
docker run \
  --env SPRING_DATASOURCE_URL="jdbc:postgresql://database:5432/Adventureworks" \
  --rm \
  -p "8000:8080" \
  --network spring-adventures_default \
  experimentalsoftware/spring-adventures:backend-latest
```

```sh
curl -s http://localhost:8000/api/product-inventories
```

## Maintenance

### Update Docker image

```sh
mvn spring-boot:build-image

docker tag docker.io/library/spring-adventures:0.0.1-SNAPSHOT experimentalsoftware/spring-adventures:backend-latest
docker push experimentalsoftware/spring-adventures:backend-latest
```

## Alternatives

- https://github.com/st-tu-dresden/salespoint
- https://leasingninja.io/
- https://github.com/thombergs/buckpal
- https://github.com/HexArchBook/bluezone_pro
