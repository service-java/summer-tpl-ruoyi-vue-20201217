#!/usr/bin/env sh
# abort on errors
set -e

java -jar -Xms256m -Xmx1024m -XX:MetaspaceSize=128m -XX:MaxMetaspaceSize=512m ./service-crawler-datav.jar --spring.profiles.active=prod

cd -