Service Discovery с Netflix Eureka


Service Discovery
проект 
eureka-service-discovery

```bash
cd eureka-service-discovery
./gradlew bootRun

```


Несколько Discovery клиентов которые предоставляют инфу 
eureka-song-library

запускаем первый с дефолтным профилем 
```bash
	cd eureka-song-library
	./gradlew bootRun
```
запускаем с дев 

```bash
	./gradlew bootRun -Dspring.profiles.active=dev  
```

## поиск сервисов
```bash 
	cd eureka-song-player
	./gradlew bootRun   
```

Декларативный REST-клиент
