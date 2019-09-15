# String Calculator: A Java Demonstration Project

An example Java project, including Gradle, JUnit, and Azure DevOps Pipelines, to demonstrate Test-Driven Development and DevOps processes.

[![Build Status](https://dev.azure.com/sfratt/string-calculator/_apis/build/status/sfratt.string-calculator?branchName=master)](https://dev.azure.com/sfratt/string-calculator/_build/latest?definitionId=4&branchName=master)

The project contains a simple Java application that performs arithmetic on string inputs, and provides a test suite with [JUnit 4](https://junit.org/junit4/).  The `build.gradle` file provides configuration that can be presented to automate builds using a continuous integration tool like [Azure DevOps](https://azure.com/devops).

To setup and build the project, simply:

1. Run `$ mkdir string-calculator` to create a new directory for the project.
2. Run `$ cd string-calculator` to change to the new project directory.
3. Run `$ gradle init` and follow the on-screen instructions to initialize the project.
4. Run `$ gradle build` to build the project and execute the unit tests.
