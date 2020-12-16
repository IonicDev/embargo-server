# Ionic Machina Embargo Server - Waypoint 2

Waypoint 2 is a "Embargo Server". It uploads files with an embargo date and time.  Files are served after
the embargo date and time.  The code is based off Waypoint 1.

## Prerequisites
- Java Development Kit (JDK) 8+
- [Maven 3.x](https://maven.apache.org/)

## Building the Webapp
- mvn clean package

This is will pull in all the required packages for the webapp.

## Running Application on Local Machine (Linux)
- to start Tomcat `mvn cargo:run`
- to stop Tomcat `Ctrl+C`

## Running Application on Local Machine (Windows)
- to start Tomcat `mvn cargo:start`
- to stop Tomcat `mvn cargo:stop`

## Admin access
- [access Tomcat Web Application Manager](https://localhost:8443/manager/html)
  - user: `admin`, password `purple`

## Links
- [log4j sample (inspiration for this hack)](https://ionic.com/protecting-log-data-using-log4j-and-machina-tools-sdk/)
