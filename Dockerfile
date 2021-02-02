FROM openjdk:15

EXPOSE 8080


ARG JAR_FILE=target.nosync/stocks-services-8.0.0.jar

ADD ${JAR_FILE} stocks-services-8.0.0.jar

ENTRYPOINT ["java","-jar","/stocks-services-8.0.0.jar"]