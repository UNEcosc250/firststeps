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
  * For this exercise, we're going to wrap all of your code in an object called StepOne. We can still define classes
  * and other objects inside it, but for instance we can't declare a val outside of an object or class. So the easiest
  * way to get your tutorial into a contiguous block is to wrap the whole thing up inside an object
  *
  */
object StepOne {

  // run the tests, and then scroll up above all the errors. You should see the messages printed out. This is how we're
  // going to get you to do some tasks that just involve printing things, before we get you to make the tests pass.

  print(
    """
      | Hello from your friendly exercise start-up message! If you find this text in the output, you've found where
      | all the printlns are happening. Which means you can do the parts that come before making the tests pass!
      |
    """.stripMargin)


  /** Exercise 1: basic syntax **/

  // This is a value. It can't change. Notice the type is put after the variable, not before.
  // The Scala compiler will sort out whether this needs to be a Java `int` or `Integer` and convert between them. To
  // you, it's just an `Int`.
  val i:Int = 1
  println(s"In exercise 1, i starts out as $i")
  // Also notice Scala's "string interpolation" format.

  // try changing i to 3 and see what happens
  // i = 3

  // This is a variable. Its value can change
  var x:Int = 0

  // try changing x to 3 and see what happens
  // i = 3
  // println(s"x is now $x")

  // This is a method. Notice the equals! Notice there's no return statement necessary!
  // Scala is expression-based -- everything (including if statements) evaluates to a value.
  // The curly braces (the block of code) evaluates to a value (2 * i). And we've declared that's what twice(i) equals...
  def twice(i:Int):Int = {
    2 * i
  }
  // Now call it and print out the result... what's twice 128?
  // <<Your code goes here>>


  /** Exercise two: lists **/


  // A Seq is a sequence of values
  val seq = Seq(1, 2, 3, 4, 5, 6, 7)

  // A List is a linked list
  val list = 1 :: 2 :: 3 :: 4 :: 5 :: 6 :: 7 :: Nil

  val sameList = List(1, 2, 3, 4, 5, 6, 7)

  // Check whether they have the same contents. Hint: easiest way is to convert one into another...


  // Here's a method that puts spam at the beginning of a string.
  def spammer(strings:List[String]) = "Spam" :: strings

  // And another that puts Bla at the beginning
  def blather(strings:List[String]) = "Bla" :: strings

  // Make a list of strings. Hint, it's List(....)
  // Add spam to one and bla to the other
  // Check their tails are equal


  /** Exercise 3: Tuples and maps **/


  /*
   * "Tuples" are an immutable datatype that has two values. eg, (1, 2)
   * There's another syntax for making tuples in scala: you can say 1 -> 2
   * Let's check that (1, 2) really equals 1 -> 2
   */

  /*
   * Lets try another immutable data-type. An immutable Map. (Think Java HashMap, but you can't change the values)
   */
  val map = Map(1 -> "a", 2 -> "b", 3 -> "c", 4 -> "d", 5 -> "e")

  // Now return that updated with v -> s (let syntax completion help you out here)


  /** Exercise 4: A while loop from the lecture **/

  // As a next little ice-breaker, try putting the Fizz-Buzz code from the lecture in here, and print out fizzbuzz
  // numbers from 1 to 100



  /**-----
    * Ok, hopefully just with that little playing around, you've got the hang of typing in some Scala code, running the
    * tests, and seeing what happened (eg, looking for printlns)
    *
    * Now for some exercises that involve making the tests pass.
    * You'll need to replace the ??? with actual code. And your goal is to make the tests pass.
    * (You can crib at the tests if you like)
    *
    *------------*/




  /**
    * Double every element in an array.
    *
    * Start off by doing this iteratively. And then we'll discover how much shorter it is functionally.
    */
  def doubleArray(arr:Array[Int]):Array[Int] = arr.map(_ * 2) // ???

  /**
    * Multiply every element in an array by its position in the array
    * eg, for [3, 4, 2, 6, 2] [3 * 0, 4 * 1, 2 * 2, 6 * 3, 2 * 4]
    */
  def timesPosition(arr:Array[Int]):Array[Int] = ???


  /**
    * Ok, we did that for arrays. Now, what if we want to do it for lists?
    * Hint: if you're working imperatively and mutably, you can start with an Array and then go .toList on it at the end
    */
  def doubleList(arr:List[Int]):List[Int] = ???


  /**
    * Suppose we are compiling a crossword. Given two words, find all the pairs of positions where those
    * words have letters in commong. eg, for "frogs" and "eggs", we would return
    * List((3,1), (3,2), (4,3)
    */
  def matchingLetters(wordA:String, wordB:String):List[(Int, Int)] = ???

  /**
    * And let's finish with a little challenge: Write a function that can translate a number into Roman numerals
    */
  def roman(i:Int):String = ???


  /*
   * Ok, that should have introduced you to enough basic syntax to get started.
   * If you're after more exercises to try, have a look at exercism.io
   */

}
