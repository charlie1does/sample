# sample
Sample repository describing a various technology based projects setup

# building
mvn surefire-test clean package -Dspring.profiles.active=test -Dmaven.test.skip

# cobertura analysis
mvn cobertura:cobertura

# project contains some sample scenarios of values being passed from one side to the another. Use http://${server}:${port} before the following addresses:
/serviceInteger?argument=50
/serviceString?argument=20
/serviceError