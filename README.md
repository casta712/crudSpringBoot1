# crudSpringBoot1
# CRUD Spring Boot Application

## Descripción

Este es un proyecto CRUD básico desarrollado en Spring Boot que gestiona entidades `Maker` y `Product`. La arquitectura del proyecto utiliza DTO (Data Transfer Object) y DAO (Data Access Object) para una mejor separación de responsabilidades y escalabilidad.

## Requisitos

- Java 11 o superior
- Maven 3.6.0 o superior
- MySQL (o cualquier otra base de datos configurada en `application.properties`)

## Configuración del Proyecto

1. **Clonar el repositorio**

    ```bash
    git clone https://github.com/tuusuario/crud-spring-boot.git
    cd crud-spring-boot
    ```

2. **Configurar la base de datos**

    Modifica el archivo `src/main/resources/application.properties` con las configuraciones de tu base de datos:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:
    spring.datasource.username=usuario
    spring.datasource.password=contraseña
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    ```

3. **Construir y ejecutar la aplicación**

    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

## Estructura del Proyecto

El proyecto sigue una estructura típica de Spring Boot:

