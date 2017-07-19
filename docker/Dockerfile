FROM openjdk:8-alpine

COPY wtfc.sh .
COPY hydra.jar .

ENTRYPOINT ["./wtfc.sh", "-T", "40", "nc -z rabbit 5672", "&&", "java", "-jar", "hydra.jar"]
