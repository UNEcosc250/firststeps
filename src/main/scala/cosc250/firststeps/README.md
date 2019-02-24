# First steps in Scala

This is a small Scala tutorial exercise to start getting used to the syntax of Scala programming.

It is typically taken *before* introducing functional programming concepts, so students should feel free to just use imperative programming to complete this tutorial.

The project is organised as an sbt project: `src/main/scala` contains the main code and `src/test/scala` contains tests that will be run against it if you run `sbt test` (or `test` from an interactive sbt prompt).

## Useful to know before you start

A few language conventions are useful to remember before you begin the tutorial:

### Companion objects instead of static methods

Scala compiles (by default) to run on the JVM. Just as Java requires a little overhead to define a program, so does Scala. So, this in Java

```java
public class MyApp {

    public static void main(String[] args) {
        // program
    }
}
```

might be replaced by this in Scala:

```scala
object MyApp {

    def main(args:Array[String]) = {
        // program
    }

}
```

Notice that in Java, `main` is a static method on a class. In Scala, each class can have a "companion object" - a single object with the same name as the class. Methods defined on a companion object are (roughly) similar to static methods in Java.

### The test harness supplies its own `main`

If you open `src/main/scala/cosc250/firststeps/StepOne.scala` you'll notice there is an object containing the code, but there's no `main` method.

To run the tests, from the sbt interactive prompt, run the command `test`.

The test framework is the program that is run, and it runs the tests that are defined in `src/test/scala/cosc250/firststeps/FirststepsSpec.scala`. So, in this case, the testing framework is providing the `main` method.

Remember, though, that if there is a *compile* error in your code, even if it is in a different part of the code than you want to test right now, the code won't compile and the tests can't run.

## The exercise

Open the project in your favourite IDE, and start an sbt shell. The exercises are in `StepOne.scala` and the comments provide additional instructions. Your task is to edit the code to make the tests pass.