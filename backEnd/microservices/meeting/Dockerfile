FROM openjdk:17
#port ulistené par le projet
EXPOSE 8052
ADD target/meeting.0.1-SNAPSHOT.jar meeting.jar
ENTRYPOINT ["java", "-jar", "meeting.jar"]
