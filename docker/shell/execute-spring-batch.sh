#!/bin/sh
cd /working
$JAVA_HOME/bin/java -jar ./spring-batch-sample-0.0.1-SNAPSHOT.jar sleep=$SLEEP from=$FROM to=$TO
exit $?
