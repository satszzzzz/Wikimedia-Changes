FROM eclipse-temurin:21-jre
WORKDIR /usr/src/kafka-consumer
COPY kafka-consumer-database-0.0.1-SNAPSHOT.jar kafka-consumer.jar
EXPOSE 8080
CMD ["java", "-jar", "kafka-consumer.jar"]