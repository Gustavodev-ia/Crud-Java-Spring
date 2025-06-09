# CRUD de Usuários - Spring Boot

Este é um projeto simples de CRUD (Create, Read, Update, Delete) de usuários desenvolvido com **Java 17** utilizando o ecossistema **Spring Boot**.

## 🚀 Tecnologias utilizadas

- ✅ Java 17  
- ✅ Spring Boot 3.5  
- ✅ Spring Web  
- ✅ Spring Data JPA  
- ✅ Lombok  
- ✅ H2 Database (em memória)  
- ✅ Builder Pattern (Lombok `@Builder`)  

## 📌 Funcionalidades

- Cadastrar um novo usuário
- Listar usuários
- Buscar usuário por e-mail
- Atualizar usuário por ID
- Deletar usuário por e-mail

## 💾 Configuração do Banco (H2)

O projeto usa banco de dados H2 em memória. As configurações estão no arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:h2:mem:cadastrodb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
