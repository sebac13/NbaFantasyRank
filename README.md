# NbaFantasyRank
Educational project 

Project purpose and desc you can find in PROJECT_DESC file

This app is constructed as Maven project. 

It has been written in Eclipse and for now I advise to use this IDE to launch it.
As this is web application, to run it you will need to use server - I use TOMCAT 9.0
To install it in Eclipse you need to go to:

File -> New -> Other.. -> in Wizards type: Server -> Select 'Server' and click next
choose Tomcat 9.0 
Find 'Server Runtime enviroment' and click add at your right. There you need to select Tomact instalation directory (which you need to download)
After that click Finish

After instaling server please check if you have this JARs in dir - 'PROJECT_DIR'/WebContent/WEB-INF/lib

hibernate-core-5.3.0.CR1-javadoc.jar
hibernate-core-5.3.0.CR1-sources.jar
hibernate-core-5.3.0.CR1.jar
javax.persistence-api-2.2-javadoc.jar
javax.persistence-api-2.2-sources.jar
javax.persistence-api-2.2.jar
javax.servlet-api-3.1.0.jar
mysql-connector-java-8.0.9-rc-sources.jar
mysql-connector-java-8.0.9-rc.jar

After everything will be set up, go to com.webservlets/NBATeamsTable.java, right click and select:

Run as -> Run on Server

App should be visible in Eclipse, you can also see it in your browser
