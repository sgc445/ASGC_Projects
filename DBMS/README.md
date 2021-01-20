# DBMS

Project to process data from different sensor from the agricultureal field using spark

#Run Mapping before the project 
sh /home/sgc/my-project-work/other-project/DBMS-Project/src/main/resources/mapping.sh localhost sensordata

#Run Project
./spark-submit --class AgricultureMain --driver-class-path /home/sgc/.ivy2/cache/org.elasticsearch/elasticsearch-spark-20_2.11/jars/elasticsearch-spark-20_2.11-7.3.2.jar /home/sgc/my-project-work/other-project/DBMS-Project/target/scala-2.11/dbms-project_2.11-0.1.jar abc
