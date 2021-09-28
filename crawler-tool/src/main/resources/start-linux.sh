#!/bin/sh

SAMPLE_CURRENT_PATH=`pwd`
SAMPLE_JAR_PATH="${SAMPLE_CURRENT_PATH}"/crawler-tool-1.0-SNAPSHOT.jar
SAMPLE_YML_PATH="${SAMPLE_CURRENT_PATH}"/*.yml
nohup java -Xmx1024m -Xms64m -XX:ThreadStackSize=512 -jar "${SAMPLE_JAR_PATH}" --spring.config.location="${SAMPLE_YML_PATH}" &