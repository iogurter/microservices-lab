# Состояние сервисов

| Сервис | Порт | REST | Kafka | PostgreSQL | Eureka | Docker | Статус |
|---------|------|------|--------|------------|---------|---------|--------|
| User Service | 8081 | ✅ | Producer | ✅ | ✅ | ⏳ | 🟢 |
| Notification Service | 8082 | ❌ | Consumer | ❌ | ⏳ | ⏳ | 🟡 |
| API Gateway | 8088 | Proxy | ❌ | ❌ | ⏳ | ⏳ | 🟢 |
| Eureka Server | 8761 | UI | ❌ | ❌ | — | ⏳ | 🟢 |
| Config Server | 8888 | ❌ | ❌ | ❌ | — | ❌ | ⚪ |