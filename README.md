# java-basic
How to compile, build and run java application.

# Getting Started 

#### File structure :

    + `jar` file contains : 

        > `META-INF/`       : this directory contains MANIFEST.MF
        > `*.class / *.jar` : All compiled classes and 3rt paty libraries

### Etape 1 : Compile

1. the javac is the compiler that converts the source code `file.java` to a `file.class` with command:
 
  + Example the compile `RandomString.java` to `RandomString.class` with this 3rt party libraries in the CLASSPATH.

             $ javac -cp commons-lang3-3.9.jar;commons-text-1.7.jar RandomString.java
 
### Etape 2 : Build             

1.  Create an executable JAR file :

  + Create a main class in the package : `com.imane` .

  + Place the plugins into a lib folder :`commons-lang3-3.9.jar` et `commons-text-1.7.jar`.

  + Create MANIFEST.txt file and put in a basic description :

      `Manifest-Version`: 1.0

      `Main-Class`: com.imane.RandomString

      `Class-Path`: lib/commons-lang3-3.9.jar lib/commons-text-1.7.jar 

      `At the end the return to the line is mandatory`


2. Create a JAR `random-string.jar` : 

        $ jar cvfm random-string.jar MANIFEST.TXT com lib 

+Options:

      + c : create new archive.

      + v : generate verbose output on standard output.

      + f : specify archive file name.

      + m : include manifest information from specified manifest file.

### Etape 3 : Deploy  

1. Execute with command : 

        $ java -jar random-string.jar 

# Authors
 + [**Sallak Imane**](https://github.com/SallakImane) 