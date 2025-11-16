# Spring Adventures

> playground and reference application

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

## Alternatives

- https://github.com/st-tu-dresden/salespoint
- https://leasingninja.io/
- https://github.com/thombergs/buckpal
- https://github.com/HexArchBook/bluezone_pro/tree/main/src/application/bluezone-app
