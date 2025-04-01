CRUD-Practica - API de Gestión de Estudiantes
# CRUD-Practica - API de Gestión de Estudiantes
Este proyecto es una API RESTful construida con Spring Boot que permite realizar operaciones
CRUD (Crear, Leer, Actualizar, Eliminar) sobre los datos de estudiantes.
## Características
- **Crear Estudiante**: Permite registrar un nuevo estudiante en el sistema.
- **Leer Estudiante(s)**: Permite obtener información de un estudiante por su ID o todos los
estudiantes registrados.
- **Actualizar Estudiante**: Permite actualizar la información de un estudiante existente.
- **Eliminar Estudiante**: Permite eliminar un estudiante por su ID.
## Tecnologías
- **Spring Boot** 3.4.4
- **Java** 23
- **PostgreSQL** como base de datos
- **Lombok** para reducir el código boilerplate
- **JPA/Hibernate** para la gestión de entidades
## Requisitos
- **Java 23** o superior
- **PostgreSQL** en el puerto `5432` (configurado en `application.properties`)
- **Maven** para la gestión de dependencias y la construcción del proyecto
## Configuración
1. Clonar el repositorio:
 ```bash
 git clone https://github.com/tuusuario/CRUD-Practica.git
 cd CRUD-Practica
 ```
2. Configurar la base de datos PostgreSQL:
 - Crea una base de datos llamada `gestion_estudiantes`.
 - Asegúrate de que el usuario de la base de datos tenga los permisos adecuados.
3. Configura los datos de la base de datos en el archivo `src/main/resources/application.properties`:
 ```properties
 spring.datasource.url=jdbc:postgresql://localhost:5432/gestion_estudiantes
 spring.datasource.username=postgres
 spring.datasource.password=ElChel4s
 spring.jpa.hibernate.ddl-auto=update
 ```
4. Ejecuta la aplicación:
 ```bash
 mvn spring-boot:run
 ```
## Endpoints
### 1. Crear Estudiante
- **Método**: `POST`
- **Endpoint**: `/api/estudiantes`
- **Cuerpo de la solicitud** (JSON):
 ```json
 {
 "nombre": "Juan",
 "apellido": "Perez",
 "email": "juan.perez@email.com",
 "fechaNacimiento": "2000-01-01",
 "numeroInscripcion": "12345"
 }
 ```
- **Respuesta**:
 ```json
 {
 "id": 1,
 "nombre": "Juan",
 "apellido": "Perez",
 "email": "juan.perez@email.com",
 "fechaNacimiento": "2000-01-01",
 "numeroInscripcion": "12345"
 }
 ```
### 2. Obtener Todos los Estudiantes
- **Método**: `GET`
- **Endpoint**: `/api/estudiantes`
- **Respuesta**:
 ```json
 [
 {
 "id": 1,
 "nombre": "Juan",
 "apellido": "Perez",
 "email": "juan.perez@email.com",
 "fechaNacimiento": "2000-01-01",
 "numeroInscripcion": "12345"
 },
 ...
 ]
 ```
### 3. Obtener Estudiante por ID
- **Método**: `GET`
- **Endpoint**: `/api/estudiantes/{id}`
- **Respuesta**:
 ```json
 {
 "id": 1,
 "nombre": "Juan",
 "apellido": "Perez",
 "email": "juan.perez@email.com",
 "fechaNacimiento": "2000-01-01",
 "numeroInscripcion": "12345"
 }
 ```
### 4. Actualizar Estudiante
- **Método**: `PUT`
- **Endpoint**: `/api/estudiantes/{id}`
- **Cuerpo de la solicitud** (JSON):
 ```json
 {
 "nombre": "Juan Carlos",
 "apellido": "Perez",
 "email": "juan.carlos@email.com",
 "fechaNacimiento": "2000-01-01",
 "numeroInscripcion": "12345"
 }
 ```
- **Respuesta**:
 ```json
 {
 "id": 1,
 "nombre": "Juan Carlos",
 "apellido": "Perez",
 "email": "juan.carlos@email.com",
 "fechaNacimiento": "2000-01-01",
 "numeroInscripcion": "12345"
 }
 ```
### 5. Eliminar Estudiante
- **Método**: `DELETE`
- **Endpoint**: `/api/estudiantes/{id}`
- **Respuesta**: `204 No Content`
## Pruebas
Puedes usar herramientas como **Postman** o **cURL** para probar los endpoints de la API. Aquí
tienes ejemplos de comandos cURL:
### Crear Estudiante
```bash
curl -X POST http://localhost:8080/api/estudiantes -H "Content-Type: application/json" -d
'{"nombre":"Juan","apellido":"Perez","email":"juan.perez@email.com","fechaNacimiento":"2000-01-0
1","numeroInscripcion":"12345"}'
```
### Obtener Todos los Estudiantes
```bash
curl http://localhost:8080/api/estudiantes
```
### Obtener Estudiante por ID
```bash
curl http://localhost:8080/api/estudiantes/1
```
### Actualizar Estudiante
```bash
curl -X PUT http://localhost:8080/api/estudiantes/1 -H "Content-Type: application/json" -d
'{"nombre":"Juan
Carlos","apellido":"Perez","email":"juan.carlos@email.com","fechaNacimiento":"2000-01-01","numer
oInscripcion":"12345"}'
```
### Eliminar Estudiante
```bash
curl -X DELETE http://localhost:8080/api/estudiantes/1
```
