############################################################
# Stage 1 - Build
############################################################

FROM eclipse-temurin:21-jdk AS builder

ARG MODULE

WORKDIR /workspace

COPY . .

RUN chmod +x mvnw

RUN ./mvnw \
    -pl services/${MODULE} \
    -am \
    clean package \
    -DskipTests

############################################################
# Stage 2 - Runtime
############################################################

FROM eclipse-temurin:21-jre

WORKDIR /app

ARG MODULE

COPY --from=builder \
    /workspace/services/${MODULE}/target/*.jar \
    app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]
