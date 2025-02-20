FROM openjdk:21-jdk-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} edu_swkim.jar
ENTRYPOINT ["java","-jar","edu_swkim.jar"]