Email Generation Application

This email generation application generate email templates per customer type. 
To implement this project, Factory design pattern is used.

-->created an interface called Customer, which has createEmailTemplate method of type Email.
-->Created concrete classes such as Vip,New,Frequent,Returning and BusinessCustomer implementing the same customer interface.
-->Created a Factory to generate object of concrete class based on given information. (customerType)
-->Used the Factory to get object of concrete class by passing an information such as CustomerType.

Customer types can be easily expanded by simply creating more customer type classes that implement the Customer interface.
The code itself is very straightforward, allowing developers to easily expand on the existing classes and interfaces effortlessly.

The Factory Design Pattern or Factory Method Design Pattern is one of the most used design patterns in Java.
In this application, object creation is done without exposing the creation logic to the client 
and refer to newly created object using a common interface, thus avoiding duplicate code as well.

Main class, our demo class will use CustomerFactory to get a Customer object.
It will pass information (Business / New / Frequent/ Vip/ Returning) to CustomerFactory to get the type of object it needs.
Based on the type of object created createEmailTemplate is used to create email for specific customer type.

GitRepo: https://github.com/metcs/met-cs665-assignment-3-Lakshmi-Swethadri0201.git

# Project Template

This is a Java Maven Project Template


# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

We recommand the above command for running the Main Java executable. 




# Run all the unit test classes.


```bash
mvn clean compile test checkstyle:check  spotbugs:check
```

# Using Spotbugs to find bugs in your project 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn spotbugs:gui 
```

or 


```bash
mvn spotbugs:spotbugs
```


```bash
mvn spotbugs:check 
```

check goal runs analysis like spotbugs goal, and make the build failed if it found any bugs. 


For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html


SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```




