 Spring Boot Maven Archetype
=========================================

Summary
-------
The project is a Maven archetype for Spring Boot web application 
which has all base dependencies used in the other projects.

- spring-boot-starter-web
- spring-boot-starter-data-jpa
- spring-boot-starter-validation
- h2database
- spring-boot-starter-test


Installation
------------

To install the archetype in your local repository execute following commands:

```sh
$ git clone https://github.com/[user-name]/[repository]
$ cd [repository]
$ mvn clean install
```

Create a project
----------------
```sh
$ mvn archetype:generate \
    -DarchetypeGroupId=com.example-archetypes \
    -DarchetypeArtifactId=maven-archetype \
    -DarchetypeVersion=1.0.0 \
    -DgroupId=com.example \
    -DartifactId=baseapp \
    -Dversion=1.0.0-SNAPSHOT \
    -DinteractiveMode=false
```

Quick start
-----------
`mvn spring-boot:run`

### cURL for testing
- curl --location --request POST 'http://localhost:8080/customer' --header 'Content-Type: application/json' --data-raw '{"customerId":"custer_test_1", "createdAt" : "2022-06-24"}'