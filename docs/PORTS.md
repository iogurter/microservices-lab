# Используемые порты

## Infrastructure

| Компонент | Порт | URL | Статус |
|-----------|------|-----|--------|
| PostgreSQL | 5433 | localhost:5433 | ✅ |
| Redis | 6379 | localhost:6379 | ✅ |
| RedisInsight | 5540 | http://192.168.1.77:5540 | ✅ |
| Kafka | 9092 | - | ✅ |
| Kafka UI | 8080 | http://192.168.1.77:8080 | ✅ |
| RabbitMQ | 5672 | - | ✅ |
| RabbitMQ UI | 15672 | http://192.168.1.77:15672 | ✅ |
| Portainer | 9443 | https://192.168.1.77:9443 | ✅ |

---

## Spring Services

| Сервис | Порт | URL | Статус |
|--------|------|-----|--------|
| User Service | 8081 | http://192.168.1.77:8081 | ✅ |
| Notification Service | 8082 | - | ⏳ |
| API Gateway | 8088 | http://192.168.1.77:8088 | ✅ |
| Eureka Server | 8761 | http://192.168.1.77:8761 | ✅ |
| Config Server | 8888 | - | ⏳ |

---

## Monitoring

| Компонент | Порт | Статус |
|------------|------|--------|
| Grafana | 3000 | ⏳ |
| Prometheus | 9090 | ⏳ |
| Jaeger | 16686 | ⏳ |
| OpenTelemetry Collector | 4317 | ⏳ |