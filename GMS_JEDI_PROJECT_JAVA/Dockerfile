FROM jfrog.fkinternal.com/fk-base-images/openjdk/jdk:11.0.15-debian11.3-slim-20220527


COPY target/GMS_JEDI_PROJECT_JAVA-1.0-SNAPSHOT.jar .
COPY src/main/resources/config.properties .
COPY src/main/resources/config_local.yaml .
#
#RUN apt-get install npm
EXPOSE 8080
ENTRYPOINT exec java -jar GMS_JEDI_PROJECT_JAVA-1.0-SNAPSHOT.jar  server /etc/config/config_dev_2.yml
