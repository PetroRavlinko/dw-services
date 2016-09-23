FROM tomcat:8.0.20-jre8

COPY build/libs/dw-services-*.war /usr/local/tomcat/webapps/services.war