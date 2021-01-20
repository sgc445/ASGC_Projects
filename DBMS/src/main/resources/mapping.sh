#!/bin/bash
curl -XPUT ${1}:9200/${2}
curl -XPUT ${1}:9200/${2}/_mapping -H 'Content-Type: application/json' -d '{
  "properties": {
    "ambientHumidity": {
      "type": "float"
    },
    "ambientTemperature": {
      "type": "float"
    },
    "atmosphericPressure": {
      "type": "float"
    },
    "batteryLevel": {
      "type": "float"
    },
    "c02Value": {
      "type": "float"
    },
    "dataCollectionDate": {
      "type": "long"
    },
    "dataCollectionDateString": {
      "type": "date"
    },
    "humidity": {
      "type": "float"
    },
    "lightIntensity": {
      "type": "float"
    },
    "pressure": {
      "type": "float"
    },
    "rainValue": {
      "type": "float"
    },
    "rowKey": {
      "type": "long"
    },
    "sensorEndTime": {
      "type": "date"
    },
    "sensorStartTime": {
      "type": "date"
    },
    "skuId": {
      "type": "long"
    },
    "soilMoisture": {
      "type": "float"
    },
    "soilTemperature": {
      "type": "float"
    },
    "temperature": {
      "type": "float"
    },
    "windDirection": {
      "type": "float"
    },
    "windSpeed": {
      "type": "float"
    }
  }
}'