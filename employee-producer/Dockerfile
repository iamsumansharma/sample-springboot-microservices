FROM openjdk
ADD target/employee-producer.jar employee-producer.jar
ENTRYPOINT ["java", "-jar", "/employee-producer.jar"]
EXPOSE 2000