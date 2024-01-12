echo killing old docker processes
docker-compose rm -fs

echo removing all volumes
yes | docker volume prune -a
yes | docker image prune -a

echo building docker containers
docker-compose up --build -d