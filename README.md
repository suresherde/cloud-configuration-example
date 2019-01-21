# cloud-configuration-example
cloud configuration example
Quick notes to remember:
1/ suresh-cloud-config- my cloud service, interacts with the cloud store 
2/ first-service only has the code to fetch data from the configuration files
3/curl --request GET \
  --url http://localhost:8101/profile (from the first service)
4/cloud: 8191, firt-service:8101, second-service: YTD
5/ to launch the first service : java -jar .\first-service-0.0.1-SNAPSHOT.jar --spring.profiles.active=dev
