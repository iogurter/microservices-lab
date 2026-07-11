# Сервисы проекта

---

# User Service

Порт

8081

Функции

- регистрация пользователя
- сохранение в PostgreSQL
- публикация UserCreatedEvent
- регистрация в Eureka

---

# Notification Service

Порт

8082

Функции

- получение UserCreatedEvent
- отправка уведомлений

Статус

В разработке

---

# API Gateway

Порт

8088

Функции

- единая точка входа
- маршрутизация REST

---

# Eureka Server

Порт

8761

Функции

- Service Discovery

---

# Common Events

Общие DTO между сервисами.