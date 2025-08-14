# Foro Hub - Back End

¡Bienvenido a **Foro Hub**! Este proyecto es un backend desarrollado en **Spring Boot** que simula un foro para estudiantes, 
donde se pueden crear, leer, actualizar y eliminar tópicos relacionados con cursos.

## 🔹 Tecnologías utilizadas

- **Java 17**
- **Spring Web**
- **Spring Boot 3**
- **Spring Boot DevTools**
- **Spring Data JPA**
- **MySQL Driver** (base de datos)
- **Flyway Migration**
- **Validation**
- **Spring Security**
- **Maven** (gestión de dependencias)
- **Postman** para probar los endpoints
- **Lombok**
- 
## 🔹 Funcionalidades

Este backend permite:

- Crear un nuevo **tópico**
- Obtener todos los **tópicos**
- Obtener un **tópico específico**
- Actualizar un **tópico**
- Eliminar un **tópico**
- Manejo de relaciones entre:
  - Autor
  - Curso
  - Tópico
  - Respuesta

## 🔹 Estructura del proyecto
ForoHub/
│
├─ src/main/java/com/ForoHud/ForoHud/
│ ├─ controller/ # Endpoints REST
│ ├─ model/ # Entidades (Topico, Autor, Curso, Respuesta)
│ ├─ repository/ # Interfaces JPA Repository
│ └─ ForoHudApplication.java
│
├─ src/main/resources/
│ └─ application.properties # Configuración de base de datos
│
├─ pom.xml # Dependencias y configuración Maven
└─ README.md # Documentación del proyecto

## 🔹 Configuración de la base de datos
1. Crear la base de datos en MySQL:
```sql
CREATE DATABASE forohud;
2. Configurar application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/forohud
spring.datasource.username=TU_USUARIO
spring.datasource.password=TU_CONTRASEÑA
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
Cambia TU_USUARIO y TU_CONTRASEÑA por los datos de tu MySQL.

🔹 Licencia
Este proyecto está bajo la licencia MIT. ¡Siéntete libre de usarlo y adaptarlo para tus proyectos educativos!

🔹 Autor
Pineda
