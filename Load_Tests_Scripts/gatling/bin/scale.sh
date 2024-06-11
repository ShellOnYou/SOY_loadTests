#!/bin/bash

echo " The params :  $2 $3" 

ssh 192.168.3.136 "docker-compose -f ~/app/ms/docker-compose.yml up --scale ms-exercise=$2 --scale ms-other=$3 -d"

sleep 60
