#!/bin/bash

docker compose -f docker-compose.prod.yml down --rmi all

echo "CREATE DATABASE phihub;" > init.sql

docker compose -f docker-compose.prod.yml up