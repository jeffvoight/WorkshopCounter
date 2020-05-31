DISCLAIMER:
This project is written with intentional defects and significant inefficiencies in order to demonstrate
software profiling.

If you see bugs, congratulations. It does, in fact, have bugs. It's supposed to.

By the way, every bug and inefficiency in this code is taken from real life. These are all lines of code
that I have seen in production *many* times.

Links:

https://visualvm.github.io/download.html

https://visualvm.github.io/gettingstarted.html

Plugins: Startup
To run Main from the command line,
```
java com.coveros.voight.workshops.counter.Main src/main/resources/
```

To run with a profiler, you'll need to add the following to the java command line or your maven java exec options in your maven pom:
```
-agentpath:C:/visualvm_202/visualvm/lib/deployed/jdk16/windows-amd64/profilerinterface.dll=C:\visualvm_202\visualvm\lib,5140
```

This is a Maven project. You can run the whole thing by running

```
mvn clean verify
```

If you want to run the stand-alone Main, you can run

```
mvn clean install -DskipTests
```

