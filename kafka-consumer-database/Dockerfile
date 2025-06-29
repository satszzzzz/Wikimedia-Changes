FROM eclipse-temurin:21-jre
WORKDIR /usr/src/kafka-producer
COPY target/kafka-consumer-database-0.0.1-SNAPSHOT.jar kafka-producer.jar
EXPOSE 8081
CMD ["java", "-jar", "kafka-producer.jar"]