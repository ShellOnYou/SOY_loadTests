#!/bin/bash
vu=200
runID=$(echo $RANDOM)
host=$(hostname -f)

replicasG=1
replicasO=1
replicasE=1
./exec.sh $vu $runID $host $replicasG $replicasE $replicasO

replicasE=2
./exec.sh $vu $runID $host $replicasG $replicasE $replicasO

replicasE=4
./exec.sh $vu $runID $host $replicasG $replicasE $replicasO

replicasE=8
./exec.sh $vu $runID $host $replicasG $replicasE $replicasO

replicasE=12
./exec.sh $vu $runID $host $replicasG $replicasE $replicasO

replicasE=16
./exec.sh $vu $runID $host $replicasG $replicasE $replicasO

replicasE=24
./exec.sh $vu $runID $host $replicasG $replicasE $replicasO

