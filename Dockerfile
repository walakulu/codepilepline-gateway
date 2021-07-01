FROM 169938524389.dkr.ecr.us-east-2.amazonaws.com/jdk-8-alpine:latest
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]