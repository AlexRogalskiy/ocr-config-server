# ocr-config-server
[![CircleCI](https://circleci.com/gh/ryanjbaxter/ocr-config-server.svg?style=svg)](https://circleci.com/gh/ryanjbaxter/ocr-config-server)

Repo for OCR Config Server from my [blog](http://ryanjbaxter.com).

## Running

```
$ git clone https://github.com/ryanjbaxter/ocr-config-server
$ cd ocr-config-server
$ ./mvnw spring-boot:run
```

Alternatively you can run this application using the [image](https://hub.docker.com/r/ryanjbaxter/ocr-config-server/) from Docker Hub.

```
$ docker run -i -p 8282:8282 ryanjbaxter/ocr-config-server
```

## Using
This application will start on port `8888`.  It uses configuration from 
https://github.com/ryanjbaxter/ocr-config-repo by default.  This can be changed
by changing `spring.cloud.config.server.git.uri` in `application.yml`.