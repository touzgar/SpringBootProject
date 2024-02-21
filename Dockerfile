# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory to /produit-1
WORKDIR /produit-1

# Copy the JAR file into the container at /produit-1
COPY target/produit-1.jar /produit-1

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Define environment variable	
ENV SPRING_PROFILES_ACTIVE=prod

# Run the JAR file
CMD ["java", "-jar", "produit-1.jar"]
