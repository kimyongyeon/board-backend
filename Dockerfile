FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD  target/demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=local","-jar","/app.jar"]