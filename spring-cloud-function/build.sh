#!/bin/bash
mvn -U clean install
read -p "AWS Account ID: " accountId
read -p "AWS Region: " region
read -p "ECR Repository: " repository

randInt=($RANDOM % 500 + 1 )
sudo docker build . -t "$accountId".dkr.ecr."$region".amazonaws.com/"$repository":"$randInt"
aws ecr get-login-password --region "$region" | sudo docker login --username AWS --password-stdin "$accountId".dkr.ecr."$region".amazonaws.com
sudo docker push "$accountId".dkr.ecr."$region".amazonaws.com/"$repository":"$randInt"
