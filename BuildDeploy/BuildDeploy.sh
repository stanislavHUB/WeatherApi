#!/usr/bin/bash
#---------------Build process------------------
#Crate a build container
export DOCKER_BUILDKIT=1
docker build -t weather/ubuntu .
#docker network create clinic
#Create a DataBase container

docker stop db
docker rmi -f weather/api
cd ../WeatherProject
docker build -t weather/api .

docker run -d --name api weather/api