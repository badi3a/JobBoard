FROM openjdk:17
#port ulistené par le projet
EXPOSE 8051
ADD target/condidature-0.0.1-SNAPSHOT.jar condidature.jar
ENTRYPOINT ["java", "-jar", "condidature.jar"]
