set ProjectPath=C:\WorkSpace\OnlineOrdering
echo %ProjectPath%
set classpath=%CLASSPATH%\lib;%TESTNG_HOME%\bin
echo %classpath%
java org.testng.TestNG %ProjectPath%\testng.xml
pause