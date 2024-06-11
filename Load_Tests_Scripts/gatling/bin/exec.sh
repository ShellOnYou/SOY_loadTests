#!/bin/bash
vu=$1
runID=$2
host=$3
# Gateway replicas number:
replicasG=$4 
# Exercise service replicas number:
replicasE=$5
# Leftover service replicas number:
replicasO=$6


START=1
END=3

SCRIPT=LoadTestMicroservice # use LoadTestMonolith for load testing the other version

j=0
./restart.sh # needs to be modified to test the monoilith version

echo "------------------------------"
echo "Start Time: $(($start)) seconds  $runID $replicasG $replicasE $replicasO $vu $host 0 0"

j=$((j+1))
./scale.sh $replicasG $replicasE $replicasO # needs to be modified to test the monoilith version
start=$(date +%s)

for i in $(eval echo "{$START..$END}")
do
  j=$((j+1))
  ./gatling.sh --run-mode local --simulation  $SCRIPT

  j=$((j+1))
  ./restart.sh
done
end=$(date +%s)
laststate=END
((laststate+=1))

echo "Elapsed Time: $(($end-$start)) seconds  $runID $replicasG $replicasE $replicasO $vu $host $laststate 0"
