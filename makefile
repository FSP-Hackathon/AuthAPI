all: run

run: terminate
	docker compose -f ./docker-compose.yaml up

terminate:
	docker compose -f ./docker-compose.yaml down
	docker image rm -f authapi-backend
	
