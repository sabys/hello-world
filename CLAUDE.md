# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project

A minimal Java "Hello, World" program with a JUnit 5 test, used as a sandbox for learning Claude Code. There is no build tool (no Maven/Gradle) — compilation and test execution are done directly with `javac`/`java` against a vendored JUnit console jar.

## Commands

Compile and run the program (name comes from `args[0]`):
```bash
javac HelloWorld.java
java HelloWorld <name>
```

Compile and run the test suite:
```bash
javac -cp .:lib/junit-platform-console-standalone-1.10.2.jar HelloWorldTest.java
java -jar lib/junit-platform-console-standalone-1.10.2.jar -cp . --select-class HelloWorldTest
```

Note: `HelloWorldTest.java` depends on `HelloWorld.class` being compiled first (it references `HelloWorld.greet`).
