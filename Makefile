compile_server:
	@cd eureka-service-discovery && ./gradlew build
run_server:
	@cd eureka-service-discovery && java -jar build/libs/eureka-service-discovery-0.0.1-SNAPSHOT.jar

song_client_1:
	@cd eureka-song-library && ./gradlew bootRun

song_client_2:
	@cd eureka-song-library && ./gradlew bootRun -Dspring.profiles.active=dev

run_player:
	@cd eureka-song-player && ./gradlew bootRun
up: compile_server run_server song_client_1 song_client_2 run_player


