# HarborFlow – Maritime Container Management Microservices

HarborFlow is a microservices-based maritime container management system developed using Spring Boot and Spring Cloud. The system separates major port operations into independent services for better modularity, service discovery, routing, security, and scalability.

## Project Overview

HarborFlow models a practical port workflow involving:

- Container registration and movement
- Carrier management
- Gate check-in operations
- Yard slot placement
- Container loading and unloading
- Secure REST API access
- Service discovery and API routing

## Architecture

The application consists of six Spring Boot applications:

| Service | Port | Responsibility |
|---|---:|---|
| Eureka Server | 8761 | Service discovery |
| API Gateway | 8080 | Central API entry point and routing |
| Carrier Service | 8081 | Carrier operations |
| Container Service | 8082 | Container operations |
| Yard Service | 8083 | Yard and slot operations |
| Gate Service | 8084 | Gate/check-in operations |

### Request Flow

Client / Postman  
↓  
API Gateway  
↓  
Eureka Service Discovery  
↓  
Required Microservice  
↓  
Service Database

## Security

HarborFlow uses JWT-based authentication with Spring Security.

A client first obtains a JWT token and then uses the token to access protected REST endpoints through the API Gateway.

Example token request:

`POST /auth/token`

```json
{
  "username": "harbor",
  "password": "flow123"
}
```

The returned JWT is supplied as a Bearer token for protected API requests.

## Technologies

- Java 17
- Spring Boot
- Spring Cloud
- Spring Security
- JWT
- Netflix Eureka
- Spring Cloud Gateway
- REST APIs
- Spring Data JPA / Hibernate
- H2 Database
- Maven
- Postman
- Git / GitHub

## Main Services

### Carrier Service

Provides carrier-related functionality for the maritime workflow.

### Container Service

Handles container registration and container movement operations.

Example:

```http
POST /api/containers
```

```json
{
  "containerNo": "HF001",
  "carrierCode": "HFL",
  "status": "REGISTERED"
}
```

### Yard Service

Manages yard slots and container placement, loading, and unloading.

Example placement request:

```http
POST /api/yard/place
```

```json
{
  "slotCode": "A01",
  "occupied": false,
  "containerNo": "HF001"
}
```

### Gate Service

Handles gate check-in operations for containers and vehicles.

Example:

```http
POST /api/gate/check-in
```

```json
{
  "containerNo": "HF001",
  "vehicleNo": "TRUCK-101"
}
```

## Example Business Workflow

A demonstration workflow can be performed as:

1. Register a container.
2. Check the container into the gate.
3. Place the container in a yard slot.
4. Perform yard loading/unloading operations.
5. Route all protected requests through the API Gateway using JWT authentication.

## Running the Project

### Prerequisites

Install:

- JDK 17
- Maven
- Eclipse/IntelliJ IDEA or another Java IDE
- Postman

### Startup Order

Start the applications in this order:

1. Eureka Server
2. Carrier Service
3. Container Service
4. Yard Service
5. Gate Service
6. API Gateway

Eureka:

`http://localhost:8761`

API Gateway:

`http://localhost:8080`

## Testing with Postman

Use the API Gateway (`localhost:8080`) for normal API testing.

First generate a JWT token:

```http
POST http://localhost:8080/auth/token
```

Then select:

**Authorization → Bearer Token**

and provide the generated JWT.

Example container registration:

```http
POST http://localhost:8080/api/containers
```

Example gate check-in:

```http
POST http://localhost:8080/api/gate/check-in
```

Example yard placement:

```http
POST http://localhost:8080/api/yard/place
```

## Learning Outcomes

This project provided practical experience with:

- Microservice architecture
- SOA and microservice concepts
- REST API development
- JWT authentication
- Spring Security
- Service discovery using Eureka
- API Gateway routing
- Load balancing concepts
- Independent service design
- Database-per-service concepts
- API testing using Postman

## Project Structure

```text
HarborFlow/
├── eureka-server/
├── api-gateway/
├── carrier-service/
├── container-service/
├── yard-service/
└── gate-service/
```

## Academic Use

HarborFlow demonstrates the practical application of service-oriented and microservice architecture concepts to a maritime port operations use case.

---

**HarborFlow – Maritime Container Management Microservices**
