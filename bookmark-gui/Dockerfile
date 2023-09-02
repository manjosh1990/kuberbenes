FROM eclipse-temurin:17-jre-focal

ADD target/*.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 10443
ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]