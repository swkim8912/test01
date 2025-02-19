FROM openjdk:21-jdk-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} eduapp.jar
ENTRYPOINT ["java","-jar","eduapp.jar"]