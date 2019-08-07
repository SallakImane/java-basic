# java-basic
How to compile, build and run java application.

# Getting Started 

1. the javac reads class and interface definitions, written in the Java programming language, and compiles them into bytecode class files with command:

		javac -cp commons-lang3-3.9.jar;commons-text-1.7.jar RandomString.java

2.  Create an executable JAR file :

  + Create a main class in the package : `com.imane` .

  + Create the lib folder and the inside place the plugins :`commons-lang3-3.9.jar` et `commons-text-1.7.jar`.

  + Create MANIFEST.txt file and put in a basic description

  		Manifest-Version: 1.0

        Main-Class: com.imane.RandomString

        Class-Path: lib/commons-lang3-3.9.jar lib/commons-text-1.7.jar 


3. Create an executable JAR file from the resources located inside the java-basic directory : 

		jar cvfm random-string.jar MANIFEST.TXT com lib 

4. Execute with command : 

		java -jar random-string.jar 

# Authors
 + **Sallak Imane** 
