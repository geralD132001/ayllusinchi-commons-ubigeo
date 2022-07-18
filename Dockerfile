FROM bellsoft/liberica-openjdk-alpine:latest
RUN apk add -U tzdata
ENV TZ America/Lima
RUN ln -snf /usr/share/zoneinfo/${TZ} /etc/localtime
RUN echo "${TZ}" > /etc/timezone
VOLUME /tmp
EXPOSE 8888
ADD ./target/ayllusinchi-servicio-config-server-0.0.1-SNAPSHOT.jar config-server.jar
ENTRYPOINT ["java", "-jar", "/config-server.jar"]