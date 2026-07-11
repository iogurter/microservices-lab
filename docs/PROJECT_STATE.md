# Project State

Последнее обновление: 11.07.2026

---

# Общий статус

🟢 Проект активно разрабатывается.

---

# Выполнено

## Инфраструктура

- [x] Docker Compose
- [x] PostgreSQL
- [x] Kafka
- [x] Kafka UI
- [x] Redis
- [x] RedisInsight
- [x] RabbitMQ
- [x] Portainer

---

## Backend

- [x] Common Events
- [x] User Service
- [x] API Gateway
- [x] Eureka Server

---

## Реализовано

- [x] REST API создания пользователя
- [x] Сохранение пользователя в PostgreSQL
- [x] Отправка UserCreatedEvent в Kafka
- [x] Регистрация User Service в Eureka

---

# В процессе

- Notification Service → Eureka

---

# Следующий этап

- Gateway → lb://USER-SERVICE