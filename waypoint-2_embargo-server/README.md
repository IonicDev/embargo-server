# Ionic Embargo Server - Waypoint 1

## Prerequisites
- Java Development Kit (JDK) 8+
- [Maven 3.x](https://maven.apache.org/)

## Running Application on Local Machine
The `start` and `stop` commands seems to work fine on my Windows laptop, but `run` seems to 
work better on my Debian 10 VM.
- to clean environment `mvn clean`
- [access Tomcat Web Application Manager](https://localhost:8443/manager/html)
  - user: `admin`, password `purple`

## Running Application on Local Machine (Windows)
- to start Tomcat `mvn cargo:start`
- to stop Tomcat `mvn cargo:stop`

## Running Application on Local Machine (Linux)
- to start Tomcat `mvn cargo:run`
- to stop Tomcat `Ctrl+C`

## Links
- [log4j sample (inspiration for this hack)](https://ionic.com/protecting-log-data-using-log4j-and-machina-tools-sdk/)
