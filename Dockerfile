# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-jre

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file to the container
COPY target/spring-boot-jenkins-pipeline.jar /app/spring-boot-jenkins-pipeline.jar

# Expose the port on which the application will run
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "/app/spring-boot-jenkins-pipeline.jar"]
