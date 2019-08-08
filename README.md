# java-basic
How to compile, build and run java application.

# Getting Started 

1. the javac is the compiler that converts the source code `file.java` to a `file.class` with command:
 
  + Example the compile `RandomString.java` to `RandomString.class` with this jar .

             $ javac -cp commons-lang3-3.9.jar;commons-text-1.7.jar RandomString.java

2.  Create an executable JAR file :

  + Create a main class in the package : `com.imane` .

  + Create the lib folder and the inside place the plugins :`commons-lang3-3.9.jar` et `commons-text-1.7.jar`.

  + Create MANIFEST.txt file and put in a basic description :

      `Manifest-Version`: 1.0

      `Main-Class`: com.imane.RandomString

      `Class-Path`: lib/commons-lang3-3.9.jar lib/commons-text-1.7.jar 

      `At the end the return to the line is mandatory`


3. Create an executable JAR `random-string.jar` file from the resources located inside the java-basic directory and add a manifest file to a jar file : 

        $ jar cvfm random-string.jar MANIFEST.TXT com lib 

+Options:

      + c : create new archive.

      + v : generate verbose output on standard output.

      + f : specify archive file name.

      + m : include manifest information from specified manifest file.

4. Execute with command : 

        $ java -jar random-string.jar 

# Authors
 + **Sallak Imane** 