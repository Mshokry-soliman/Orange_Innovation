# Selenium-Project
Testing some features in the Google play website using Java, Maven, TestNG and Pom

##System Requirements ##
Requires java 16 (https://www.oracle.com/java/technologies/javase/jdk16-archive-downloads.html)
internet connection
Chrome browser version 96 
Chrome driver

## How to run ##
*We need to make sure that the java and maven are set in the environment variables

*Download java (https://www.oracle.com/java/technologies/javase/jdk16-archive-downloads.html)
*To set Java click on start > search for 'environment' > edit the system environment variables > environment variables
*Under “System variables” click the “New…” button and enter JAVA_HOME as “Variable name” and the path to your Java JDK directory under “Variable value”
*In “Environment Variables” window under “System variables” select Path then click 'New' and type in  %JAVA_HOME%\bin
*To make sure that the java is working properly click on start+R > enter cmd > type java -version. You will get the java version for the installed java

*Download Maven (https://maven.apache.org/download.cgi)
*To set Maven click on start > search for 'environment' > edit the system environment variables > environment variables
*Under “System variables” click the “New…” button and enter Maven_Home as “Variable name” and the path to your maven directory under “Variable value”
*In “Environment Variables” window under “System variables” select Path then click 'New' and type in  %MAVEN_HOME%\bin
*To make sure that the java is working properly click on start+R > enter cmd > type mvn -v. You will get the java version for the installed maven

*We can run the test cases from the IDE or Command

*For IDE we need to right-click on the test case then click run or pressing on (CTRL+SHIFT+f10)

*For running the test cases from the command line we need to add MVN compile plugin in the Pom.xml file
*Open the Terminal and type cd then choose the directory of the project where you can see the Pom file
*Type mvn -test

