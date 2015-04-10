# Cobertura POC

## About Cobertura

Cobertura is a free Java tool that calculates the percentage of code accessed by tests. It can be used to identify which parts of your Java program are lacking test coverage. It is based on jcoverage.

For more information:

[Cobertura official web page](http://cobertura.github.io/cobertura/)

## Use Maven

There are several ways to execute Cobertura, I have used the maven plugin. You can find the info here:

[Cobertura maven plugin by Mojo](http://mojo.codehaus.org/cobertura-maven-plugin/#)

You can execute Coberta as/is typing:

`mvn cobertura:cobertura`

I prefer this way:

`mvn clean install cobertura:cobertura`


## Collect your results

If everything has gone well, you will see this log line:

`[INFO] Cobertura Report generation was successful.`

Then you can find your Cobertura Report at:

`${PROJECT_PATH}/target/site/cobertura/index.html`