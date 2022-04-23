FROM openjdk:11
COPY ./target/multiplication-0.0.1-SNAPSHOT.jar /usr/local/src/multiplication/ 
WORKDIR /usr/local/src/multiplication
EXPOSE 8180
CMD ["java", "-jar", "multiplication-0.0.1-SNAPSHOT.jar"]


