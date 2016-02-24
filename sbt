#!/bin/bash
SBT_OPTS="-Xms512M -Xmx1536M -Xss1M -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=256M"
java -Dhttp.proxyUser=myUser -Dhttp.proxyPassword=mypassword -Dhttp.proxyUser=myUser -Dhttp.proxyPassword=mypassword $SBT_OPTS -jar `dirname $0`/sbt-launch.jar "$@"
