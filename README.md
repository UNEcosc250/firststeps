# First steps in Scala

This is a small Scala tutorial exercise to start getting used to the syntax of Scala programming.

It is typically taken *before* introducing functional programming concepts, so students should feel free to just use imperative programming to complete this tutorial.

The project is organised in a common format for programming projects: 

* `src/main/scala` contains the main code, and 
* `src/test/scala` contains unit tests that will be run against it 

To run the code, **if you have Scala 3.5 or newer** (e.g. on UNE's Turing server)

```
scala .
```

From Scala 3.5, scala-cli is the standard Scala runner, invoked as `scala`. 

If you have an older version of scala installed (e.g. you installed the 3.3 LTS version of Scala), also install `scala-cli` and run

```
scala-cli .
```

In the rest of the tutorial instructions, we'll just say `scala`, but remember if you've installed a version before 3.5, install scala-cli and say `scala-cli` instead of `scala` in your commands. 

## Useful to know before you start

A few language conventions are useful to remember before you begin the tutorial:

### Top-level main methods

Scala compiles (by default) to run on the JVM. But it has its own coding conventions.

In Java, you might need to say this to define a program:

```java
public class MyApp {

    public static void main(String[] args) {
        // program
    }
}
```

That might be replaced by this in Scala:

```scala
@main def myApp() = 
    // program
```

Notice that in Java, `main` is a static method on a class. 

In Scala, a "top-level" main method can be declared by giving it an `@main` annotation.

We can have more than one main method. This repository, for instance, has two:

```scala
@main def exercise1():Unit = {

  print("""
         |Hello from your friendly exercise start-up message! If you see this message printed at the 
         |terminal, you successfully ran this method.
         |
         |Now move on to exercise 2.
         |
         |""".stripMargin)

}
```

and 

```scala
@main def exercise2():Unit = {
    // this one's a bit longer so I haven't shown the code in the README
}
```

If there are multiple main methods, then `scala run .` (or `scala-cli run .`) won't know which to run, but you can get it to ask you:

```sh
scala run . --interactive
```

And then it'll give you a list of the main methods and ask which you want it to run.

### The test harness supplies its own `main`

If you open `src/main/scala/cosc250/firststeps/StepOne.scala` you'll notice there is some code, and two @main methods.

The first exercises ask you to run the code. To run the code

```sh
scala run . --interactive
```

The next exercises ask you to run the tests. To run the tests, 

```sh
scala test .
```

In this case, the test framework is the program that is run, and it runs the tests that are defined in `src/test/scala/cosc250/firststeps/FirststepsSpec.scala`. So, in this case, the testing framework is providing the `main` method.

Remember, though, that if there is a *compile* error in your code, even if it is in a different part of the code than you want to test right now, the code won't compile and the tests can't run.

## The exercise

Open the project in your favourite IDE, and start an sbt shell. The exercises are in `StepOne.scala` and the comments provide additional instructions. Your task is to edit the code to make the tests pass.