# Use the official OpenJDK 11 image as the base image
FROM openjdk:11

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/mongo1-0.0.1-SNAPSHOT.jar .

# Expose the port your application runs on (replace 8080 with your application's actual port)
EXPOSE 9000

# Command to run your application
CMD ["java", "-jar", "mongo1-0.0.1-SNAPSHOT.jar"]
