FROM openjdk:17
EXPOSE 8090
ADD target/github-actions-ci-cd-docker-hub.jar github-actions-ci-cd-docker-hub
ENTRYPOINT ["java","-jar","/github-actions-ci-cd-docker-hub"]