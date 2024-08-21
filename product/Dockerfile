# Use an official Maven image as the base image
FROM maven:3.9.9-amazoncorretto-21 AS build
# Set the working directory in the container
WORKDIR /app
# Copy the pom.xml and the project files to the container
COPY pom.xml .
COPY src ./src
# Build the application using Maven
RUN mvn clean package -DskipTests
# Use an official OpenJDK image as the base image
FROM amazoncorretto:21
# Set the working directory in the container
WORKDIR /app
# Copy the built JAR file from the previous stage to the container
COPY --from=build ./app/target/product-0.0.1.jar .
# Set the command to run the application
CMD ["java", "-jar", "product-0.0.1.jar"]

 product-service:
    image: product_service
    build: ./product
    environment:
        SPRING_DATA_MONGODB_HOST: mongo
    ports:
      - "8080:8080"
    depends_on: [mongo]