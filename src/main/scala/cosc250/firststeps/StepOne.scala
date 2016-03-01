package cosc250.firststeps

import scala.annotation.tailrec

/**
  * Scala makes a distinction between "classes" and "objects". If something is a class, there can be lots of
  * instantiations of it. If something is declared as an `object` there's only one.
  *
  * It also has the idea of a "companion object" for each class -- an object that has the same name as a class.
  * Roughly, where in Java you might declare some static methods or fields on a class, in Scala you'd put those methods
  * and fields on the companion object.
  *
  */
object StepOne {

  // This is a value. It can't change. Notice the type is put after the variable, not before.
  // The Scala compiler will sort out whether this needs to be a Java `int` or `Integer` and convert between them. To
  // you, it's just an `Int`.
  val i:Int = 1

  // This is a variable. Its value can change
  var x:Int = 0

  // This is a method. Notice the equals! Notice there's no return statement necessary!
  // Scala is expression-based -- everything (including if statements) evaluates to a value.
  // The curly braces (the block of code) evaluates to a value (2 * i). And we've declared that's what twice(i) equals...
  def twice(i:Int):Int = {
    2 * i
  }


  // This is a class. You might create a new object of class Foo with `new Foo(3)`
  class Foo(i:Int)

  // This is Foo's companion object
  object Foo {
    // This is a bit like a static method in Java. You'd call it with Foo.bar()
    def bar():Unit = {
      // You don't need to say "System.out."
      println("bar")
    }
  }


  /*
   * Now for the exercises. You'll need to replace the ??? with actual code
   */


  /**
   * Write a pure function to calculate factorials.
   * Once you've written it, uncomment the @tailrec annotation to make sure your function is tail-recursive
   */
  def factorial(i:Int):Long = {

    // You'll notice we can declare functions pretty much anywhere. Including as local values inside other functions.
    //@tailrec
    def factorialStep(soFar:Long, thisNum:Int) = ???

    // Now use your factorialStep to work out factorial(i)
    ???

  }


  /**
    * Let's try out an immutable data type.
    */
  def unspammedEqual:Boolean = {

    // Here's a method that puts spam at the beginning of a string.
    def spammer(strings:List[String]) = "Spam" :: strings

    // And another that puts Bla at the beginning
    def blather(strings:List[String]) = "Bla" :: strings

    // Make a list of strings. Hint, it's List(....)
    // Add spam to one and bla to the other
    // Check their tails are equal (you can't actually check they are the same item in memory)

    ???

  }

  // A Seq is a sequence of values
  val seq = Seq(1, 2, 3, 4, 5, 6, 7)

  // A List is a linked list
  val list = 1 :: 2 :: 3 :: 4 :: 5 :: 6 :: 7 :: Nil

  val sameList = List(1, 2, 3, 4, 5, 6, 7)

  // Check whether they have the same contents. Hint: easiest way is to convert one into another...
  def seqEqualsList:Boolean = ???

  def listEqualsSameList:Boolean = ???


  /**
    * "Tuples" are an immutable datatype that has two values. eg, (1, 2)
    * There's another syntax for making tuples in scala: you can say 1 -> 2
    * Let's check that (1, 2) really equals 1 -> 2
    */
  def tuplesSyntax:Boolean = ???

  /**
    * Lets try another immutable data-type. An immutable Map. (Think Java HashMap, but you can't change the values)
    */
  def addToMap(v:Int, s:String):Map[Int,String] = {

    val map = Map(1 -> "a", 2 -> "b", 3 -> "c", 4 -> "d", 5 -> "e")

    // Now return that updated with v -> s
    ???

    // (Hmm, that was easy)
  }

  /**
    * Let's write a little vector class (as in, a vector in Cartesian coordinates. Not the funky immutable data structure)
    * You're about to discover that by default, constructor parameters are immutable. But that they stay with the
    * object as fields.
    */
  class Vec(x:Int, y:Int) {

    def timesScalar(i:Int):Vec = ???

    def plus(v:Vec):Vec = ???

    def minus(v:Vec):Vec = ???

  }

  /**
    * Write a function that can translate a number into Roman numerals
    */
  def roman(i:Int):String = ???


  /*
   * Ok, that should have introduced you to enough basic syntax to get started.
   * If you're after more exercises to try, have a look at exercism.io
   */

}
