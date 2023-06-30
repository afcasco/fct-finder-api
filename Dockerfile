FROM eclipse-temurin:17-jdk-alpine
ARG JAR_FILE=tager/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar app.jar"]