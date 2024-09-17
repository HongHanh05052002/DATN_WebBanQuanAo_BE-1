FROM azul/zulu-openjdk:17-jre
COPY ./target/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]