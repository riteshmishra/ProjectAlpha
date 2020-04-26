# Project Alpha

This project will be an introduction to creating a Docker based Java Dropwizard service. The service will be deployed in a Docker container and it will start the JAR process. During the start process of the Dropwizard service, the service should output a JSON ok response onto a service log.

## Installation

To work on this project you need to have these software installations completed

Maven [Maven](http://maven.apache.org/)
```
mvn --version
```

Docker [Docker](https://www.docker.com/products/docker-desktop)

Java 1.8

```
java --version
```

## Usage

```bash
mvn clean install #build the project JAR

docker build --tag 'alpha-service' #builds the docker image from the Dockerfile
```

## Contributing

Make sure to follow the below steps- do not clone this repo!

You must fork this repository and make pull requests to this repo once you've completed this project. Your code will be reviewed then.

The final pull request must be squashed, meaning there is only one commit message.

The commit message must follow the format:

```[alpha-xyz] your commit message here```

Make sure to constantly push your code from your local to your fork

## License
[MIT](https://choosealicense.com/licenses/mit/)