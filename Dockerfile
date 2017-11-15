FROM openjdk:8u121-jre-alpine
ADD /target/spring-project-0.0.1-SNAPSHOT.jar spring-project.jar
EXPOSE 8080
ENTRYPOINT ["sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar /spring-project.jar"]