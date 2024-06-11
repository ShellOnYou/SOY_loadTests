#!/bin/bash
ssh 192.168.3.136 'docker-compose -f ~/app/ms/docker-compose.yml restart'
sleep 60
