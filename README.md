# RMS
Study case project using various technology stack for building Resource Management System

## rms-servlet-web
It is implementing MVC pattern using only Servlet and JSP, combine with plain JDBC to handle databae operation.

It uses tomcat7-maven-plugin to spin up embedded tomcat 7, therefore no need to install tomcat 7 on your local machine. 

To run the application, execute maven command `mvn tomcat7:run` and browse http://localhost:8080/rms-servlet-web/index.jsp

This project is clone from https://github.com/mitraisjavameetup/rms.

This project should have Login feature and CRUD functinoality for user.

Step to develop:

1. Clone source code from https://github.com/mitraisjavameetup/rms
2. Install Eclipse
3. Setup Tomcat 7
4. Setup MySQL database as RDBMS
5. Run SQL script under this folder: \rms-servlet\src\main\sql to create User table
6. Open source code on eclipse and import it as maven project
7. Run tomcat server by execute command: mvn tomcat7:run to browse base website
8. Implement Login 
9. Implement CRUD for User object only just for a sample.

