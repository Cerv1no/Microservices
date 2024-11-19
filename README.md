# Proyecto de Microservicios: APIs de Empresas, Trabajos y Reseñas

Este proyecto consiste en la implementación de un sistema basado en microservicios que gestiona información sobre empresas, ofertas de trabajo y reseñas. Cada componente del sistema está diseñado para ser independiente, escalable y modular. Para facilitar la comunicación, se han implementado diversas herramientas modernas como Eureka, OpenFeign y RabbitMQ, además de un sistema de configuración centralizada y un servicio para rastreo distribuido.

---

## 📋 Descripción de las Funcionalidades

### 1. **API de Empresas**
   - Proporciona información detallada sobre las empresas registradas.  
   - **Endpoints principales**:
     - `GET /companies`: Lista todas las empresas.
     - `POST /companies`: Registra una nueva empresa.

### 2. **API de Trabajos**
   - Gestiona las ofertas de trabajo asociadas a las empresas.  
   - **Endpoints principales**:
     - `GET /jobs`: Lista las ofertas de empleo.
     - `POST /jobs`: Crea una nueva oferta.

### 3. **API de Reseñas**
   - Permite administrar las reseñas que los usuarios hacen sobre las empresas.  
   - **Endpoints principales**:
     - `GET /reviews/{companyId}`: Lista todas las reseñas de una empresa.
     - `POST /reviews?companyId=`: Registra una nueva reseña.

### 4. **API Gateway**
   - Actúa como un único punto de entrada al sistema, simplificando el acceso a los microservicios y gestionando el enrutamiento de las solicitudes.

### 5. **Servidor de Configuración**
   - Proporciona configuración centralizada para todos los microservicios.  
   - Basado en **Spring Cloud Config**, permite gestionar propiedades comunes y específicas para cada microservicio desde un repositorio centralizado.

---

## 🛠️ Arquitectura del Sistema

El proyecto utiliza una arquitectura de microservicios con las siguientes herramientas clave:

### 1. **Spring Boot**  
   - Framework principal utilizado para desarrollar cada microservicio.

### 2. **Eureka Server**  
   - Registro de servicios para descubrir y conectar dinámicamente los microservicios.

### 3. **OpenFeign**  
   - Cliente HTTP declarativo que facilita la comunicación entre microservicios registrados en Eureka.

### 4. **RabbitMQ**  
   - Broker de mensajería utilizado para comunicación asíncrona entre microservicios, garantizando que las operaciones no bloqueen el flujo principal.

### 5. **Zipkin**  
   - Servicio de rastreo distribuido que permite monitorizar la comunicación entre los microservicios y diagnosticar problemas de rendimiento.  
   - Ejemplo: Muestra el tiempo que tarda una solicitud en pasar por todos los servicios involucrados.

### 6. **Spring Cloud Config Server**  
   - Centraliza la configuración de los microservicios, permitiendo actualizaciones sin necesidad de reiniciar.  
   - Las configuraciones se almacenan en un repositorio Git, lo que facilita el versionado y la colaboración.

### 7. **Docker y Kubernetes**  
   - **Docker**: Cada microservicio está encapsulado en un contenedor para garantizar portabilidad y consistencia.  
   - **Kubernetes**: Administra el despliegue, escalado y monitoreo de los contenedores.  
     - Recursos utilizados:
       - **Deployments** para gestionar las réplicas.
       - **Services** para exponer los microservicios.

---

## ⚙️ Tecnologías Utilizadas

- **Lenguaje**: Java 17.  
- **Framework**: Spring Boot.  
- **Registro de Servicios**: Eureka Server.  
- **Clientes Declarativos**: OpenFeign.  
- **Mensajería**: RabbitMQ.  
- **Pasarela de Acceso**: Spring Cloud Gateway.  
- **Servidor de Configuración**: Spring Cloud Config.  
- **Rastreo Distribuido**: Zipkin.  
- **Base de Datos**: PostgreSQL.  
- **Contenerización**: Docker.  
- **Orquestación**: Kubernetes.  
- **Herramientas Adicionales**: Postman para pruebas de APIs, IntelliJ IDEA para desarrollo.

---

