# Getting Started

## For test, we have to run 2 instances. Simple way is run with dev and default env 

Base 
To run server with active profile set to dev:
```bash
$ ./gradlew bootRun --args='--spring.profiles.active=dev'
```

 * Run first instance by  plugin
```bash
    ./gradlew bootRun   
```

 * Run second instance by  plugin
 ```bash
     ./gradlew bootRun -Dspring.profiles.active=dev   
 ```