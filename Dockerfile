FROM openjdk:17
COPY build/libs/source-0.0.1-SNAPSHOT.jar app.jar
RUN echo "testing"
ENTRYPOINT ["java","-jar","/app.jar"]