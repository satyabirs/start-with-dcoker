FROM openjdk:8
ADD target/docker-spring-boot-0.0.1-SNAPSHOT.jar docker-app.jar
EXPOSE 9000
ENTRYPOINT ["java","-jar","docker-app.jar"]