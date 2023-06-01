FROM maven:3.8.7-openjdk-18 as BUILD
ENV HOME=/usr/app
RUN mkdir -p $HOME
WORKDIR $HOME
ADD . $HOME
RUN --mount=type=cache,target=/root/.m2 mvn -f $HOME/pom.xml clean package -DskipTests

FROM weather/ubuntu
COPY --from=build /usr/app/target/*.jar /app/api.jar
ENTRYPOINT ["bash", "-c", "java -jar /app/api.jar"]
