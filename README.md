# First steps in Scala

This is a small Scala tutorial exercise to start getting used to the syntax of Scala programming.

It is typically taken *before* introducing functional programming concepts, so students should feel free to just use imperative programming to complete this tutorial.

The project is organised in a common format for programming projects: 

* `src/main/scala` contains the main code, and 
* `src/test/scala` contains unit tests that will be run against it if you run `scala-cli test .` 

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

If there are multiple main methods, then `scala-cli run .` won't know which to run, but you can get it to ask you:

```sh
scala-cli run . --interactive
```

And then it'll give you a list of the main methods and ask which you want it to run.

### The test harness supplies its own `main`

If you open `src/main/scala/cosc250/firststeps/StepOne.scala` you'll notice there is some code, and two @main methods.

The first exercises ask you to run the code. To run the code

```sh
scala-cli run . --interactive
```

The next exercises ask you to run the tests. To run the tests, 

```sh
scala-cli test .
```

In this case, the test framework is the program that is run, and it runs the tests that are defined in `src/test/scala/cosc250/firststeps/FirststepsSpec.scala`. So, in this case, the testing framework is providing the `main` method.

Remember, though, that if there is a *compile* error in your code, even if it is in a different part of the code than you want to test right now, the code won't compile and the tests can't run.

## The exercise

Open the project in your favourite IDE, and start an sbt shell. The exercises are in `StepOne.scala` and the comments provide additional instructions. Your task is to edit the code to make the tests pass.