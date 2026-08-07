# hello-world

A minimal Java sandbox used to learn Claude Code.

## Usage

```bash
javac HelloWorld.java
java HelloWorld <name>
```

```bash
javac Calculator.java
```

## Testing

```bash
javac -cp .:lib/junit-platform-console-standalone-1.10.2.jar HelloWorldTest.java
javac -cp .:lib/junit-platform-console-standalone-1.10.2.jar CalculatorTest.java
java -jar lib/junit-platform-console-standalone-1.10.2.jar -cp . --select-class HelloWorldTest --select-class CalculatorTest
```

## Edge cases

- `Calculator.divide(a, 0)` throws `ArithmeticException("Cannot divide by zero")` instead of returning `Infinity`/`NaN`. See `CalculatorTest.divideByZeroThrows`.
