FROM openjdk:17-jdk-slim
COPY demo/build/libs/demo-0.0.1-*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
