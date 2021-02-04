#!/bin/sh
#
#

echo "#########################################################"
echo "#							      #"
echo "#	        INT493 API AutoDeploy script                   #"
echo "#	        UBUNTU 20.04 LTS SERVER_AMD_64 ONLY	           #"
echo "#	                                                       #"
echo "#########################################################"

echo "Enter to root path"
cd
cd hello-spring
echo "Pulling code"
git pull
echo "Build the project"
./gradlew build
sleep 5
echo "Restart services api"
sudo systemctl restart api
sleep 10
echo "Restart nginx"
sudo systemctl restart nginx
sleep 10
echo "OK... Successfuly Good bye :)"