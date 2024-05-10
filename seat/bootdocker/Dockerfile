FROM eclipse-temurin:17-jdk-alpine
COPY seat-0.0.1-SNAPSHOT.jar /usr/src/bootdocker/seat-0.0.1-SNAPSHOT.jar
WORKDIR /usr/src/bootdocker
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "/usr/src/bootdocker/seat-0.0.1-SNAPSHOT.jar"]