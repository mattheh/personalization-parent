FROM 729964090428.dkr.ecr.us-east-1.amazonaws.com/jboss-fuse-6/fis-java-openshift:latest
RUN mkdir /deployments || true
ADD ./personalization-web/target/personalization-web-0.0.1-SNAPSHOT.jar /deployments
ENV JAVA_APP_DIR=/deployments
EXPOSE 8080 8081 8778 9779
