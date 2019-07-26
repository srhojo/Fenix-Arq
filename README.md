# Fenix-Arq - Microservice Arq

That's a sample of Microservice architecture based on Spring-cloud (5.x).

It's created only for sample purposes. Any comments to improve or suggestion is welcome.


	* groupId: io.github.srhojo.fenix
	* artifactId: microservices-arq
	* version: 1.0.0

## Use: <a name="howtouse">

### Microservice-Arq
That's a POM parent to check all archiceture, compile and testing. Don't use to try to run.


### Register <a name="howtouse-register">

We are using Eureka as a Register Microservices

```bash
## Compile
cd /eureka
mvn clean install

## RUN
cd eureka/target
java -jar eureka-1.0.0.jar

## Deploy on:
http://localhost:8761

```

### Gateway

We are using Zuul as Gateway for Microservices

```bash
## Compile
cd /gateway
mvn clean install

## RUN
cd gateway/target
java -jar gateway-1.0.0.jar

## Deploy on:
http://localhost:8765

```

### Config-server

We are using Spring Cloud Config Server for descentralized configurations

First, we need to configure the 'uri' from git repository where we are going to read the configuration.

```yml
#application.yml
  
spring:
  cloud:
    config:
      server:
        git:
          uri: file:///${user.dir}\..\config.repo\ 
          search-paths:
          - DEV
          force-pull: false


``` 

Then, to use it:

```bash
## Compile
cd /config-server
mvn clean install

## RUN
cd config-server/target
java -jar config-server-1.0.0.jar

## Deploy on:
http://localhost:88888

```

## Samples:

### Achictecture running:
[ArqRunning]: ./assets/Archictecture.png

```
localhost:8761 
```
![alt text][ArqRunning]


### Swagger through gateway:
[SwaggerZuul]: ./assets/SwaggerGateway.png

```
 localhost:8765/api/client-test/swagger-ui.html 
```
![alt text][SwaggerZuul]


