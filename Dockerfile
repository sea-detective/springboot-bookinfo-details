FROM openjdk:8-jdk-slim
COPY /springboot-bookinfo-details-api/target/springboot-bookinfo-details-api-1.0.0-SNAPSHOT.jar springboot-bookinfo-details.jar
ENTRYPOINT ["java","-jar","/springboot-bookinfo-details.jar"]