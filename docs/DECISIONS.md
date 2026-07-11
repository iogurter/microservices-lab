# Architecture Decisions

## ADR-001

UserCreatedEvent вынесен в common-events.

---

## ADR-002

Kafka используется для асинхронного взаимодействия.

---

## ADR-003

Service Discovery реализован через Eureka.

---

## ADR-004

API Gateway использует порт 8088.

Причина

8080 уже занят Kafka UI.

---

## ADR-005

Все события Kafka сериализуются в JSON.