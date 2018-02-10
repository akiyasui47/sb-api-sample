sb-api-sample
===

Sample code of API using Spring Boot.

Overview
---

Sample code of API for learning about Spring Boot.

This Documents for run in the local environment on macOS.

Setup
---

### Install Java SDK

1. [Download dmg file](http://www.oracle.com/technetwork/java/javase/downloads/index.html) (version 1.8.x) .
2. Open dmg file & Install.

### Install Maven

1. [Download binary zip archive](https://maven.apache.org/download.cgi) (version 3.x).
2. Unzip on any direcroty.

```
# Example
$ mkdir ~/dev

$ cd ~/dev

$ mv ~/Downloads/apache-maven-*-bin.zip .

$ unzip apache-maven-*-bin.zip
```

### Install IDE (IntelliJ IDEA CE)

1. [Download Community Edition](https://www.jetbrains.com/idea/download/).
2. Open dmg file & Install.

### Setup IntelliJ IDEA CE

1. Open IntelliJ IDEA CE.
2. Checkout this repository.
3. Open "Project Structure (command + ;)" -> Platform Settings -> SDKs -> Add New SDK.
4. Open "Project Structure (command + ;)" -> Project Settings -> Project -> Project SDK: 1.8
5. Open "Project Structure (command + ;)" -> Project Settings -> Project -> Project language level: 8
6. Open "Project Structure (command + ;)" -> Project Settings -> Project -> Project compiler output: null
7. Open "Preferences (command + ,)" -> Maven (Build, Execution, Deployment -> Build Tools) -> Maven home directory: ~/dev/apache-maven-3.x.x
8. Open "View(Menu bar)" -> Tool Windows -> Maven Projects
9. Build ("Maven Projects Window" -> sb-api-sample -> Lifecycle -> clean & package)
10. Run (Run EntryPoint.main())
11. Request (http://localhost:8080/SampleService/V1/get)

