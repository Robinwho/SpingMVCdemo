# SpingMVCdemo
A petty typical demo for SpringMVC.


##Binaries

Binaries and dependency information for Maven, can be found at http://search.maven.org.

Example for Maven:

<dependency>
    <groupId>CrunchifySpringMVC</groupId>
    <artifactId>CrunchifySpringMVC</artifactId>
    <version>x.y.z</version>
</dependency>

##Build
If you use maven clean & install, then launch the tomcat (8.0 plus recommended) server.

Type the URL: http://localhost:8080/CrunchifySpringMVC/

You'll see three links, including Spring MVC Controller, Ajax and JQuery and JSON Demo.

####Details

--1. http://localhost:8080/CrunchifySpringMVC/welcome.html shows the message, which is coming from CrunchifyHelloWorld.java. Like this：
>********** Hello World, Spring MVC Tutorial

>This message is coming from CrunchifyHelloWorld.java **********

--2. http://localhost:8080/CrunchifySpringMVC/ajax.html shows the random number. Like this：
>Crunchify Spring MVC with Ajax and JQuery Demo.. 

>Next Random # is 92.53353. Generated on Wed Jan 04 16:06:16 CST 2017
-3. http://localhost:8080/CrunchifySpringMVC/json.html shows the json demo.
