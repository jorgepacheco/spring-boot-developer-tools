FROM frolvlad/alpine-oraclejdk8:slim
MAINTAINER jpacheco@autentia.com
ADD spring-boot-developer-tools-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
EXPOSE 8000
ENTRYPOINT ["java","-Xdebug -Xrunjdwp:server=y,transport=dt_socket,suspend=n","-jar","/app.jar"]