FROM openjdk:11
EXPOSE 9090
ADD target/employee-personal-service-0.0.1-SNAPSHOT.jar employee-personal-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar" "/employee-personal-service-0.0.1-SNAPSHOT.jar"]