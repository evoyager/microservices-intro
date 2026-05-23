# Smaller OS footprint using JRE
FROM eclipse-temurin:17-jre
WORKDIR /app

ENV VERSION=2

# Copy only the Jar from the current dir
ADD build/libs/*.jar /app/app.jar

CMD ["java", "-jar", "app.jar"]
