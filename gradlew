#!/usr/bin/env sh
set -e
DEFAULT_GRADLE_USER_HOME="$HOME/.gradle"
GRADLE_USER_HOME="${GRADLE_USER_HOME:-$DEFAULT_GRADLE_USER_HOME}"
export GRADLE_USER_HOME
APP_NAME="Gradlew"
APP_BASE_NAME=`basename "$0"`
APP_HOME=`cd "\`dirname "$0"\`" && pwd`
PROG_DIR=$APP_HOME
. "$APP_HOME/gradle/wrapper/gradle-wrapper.properties"
JAVACMD="java"
if [ -n "$JAVA_HOME" ] ; then
    JAVACMD="$JAVA_HOME/bin/java"
fi
exec "$JAVACMD" -Xmx64m -Xms64m -Dorg.gradle.appname="$APP_BASE_NAME" -classpath "$APP_HOME/gradle/wrapper/gradle-wrapper.jar" org.gradle.wrapper.GradleWrapperMain "$@"
