#!/bin/sh

SAMPLE_CURRENT_PATH=`pwd`
SAMPLE_JAR_PATH="${SAMPLE_CURRENT_PATH}"/springboot-sdk-sample-1.0-SNAPSHOT.jar
SAMPLE_SDK_LOCATION_PATH="${SAMPLE_CURRENT_PATH}"/sdk.properties
SAMPLE_YML_PATH="${SAMPLE_CURRENT_PATH}"/*.yml
nohup java -Xmx1024m -Xms64m -XX:ThreadStackSize=512 -Dsdk.location="${SAMPLE_SDK_LOCATION_PATH}" -jar "${SAMPLE_JAR_PATH}" --spring.config.location="${SAMPLE_YML_PATH}" &