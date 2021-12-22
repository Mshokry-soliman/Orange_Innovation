echo off
call mvn -f pom.xml clean install -U
set /p delExit=Press the ENTER key to exit...: