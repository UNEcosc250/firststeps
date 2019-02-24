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

  /**
    * This is a main method. This means you can run this object (eg, "sbt run", or "run" at the sbt prompt)
    *
    * EXERCISE 1: start an sbt shell for this project (remember, start it from the directory containing build.sbt)
    * and "run" this class to see the message printed out.
    */
  def main(args:Array[String]):Unit = {

    print("""
           |Hello from your friendly exercise start-up message! If you see this message printed at the 
           |terminal, you successfully ran this object.
           |
           |Now uncomment the line that invokes exercise 2.
           |
           |""".stripMargin)
  
    // Now uncomment the next line to run exercise 2 (and see below for the instructions)
    // exercise2()

  }

  /** EXERCISE 2: basic syntax **/
  def exercise2():Unit = {

    // This is a value. It can't change. Notice the type is put after the variable, not before.
    // The Scala compiler will sort out whether this needs to be a Java `int` or `Integer` and convert between them. To
    // you, it's just an `Int`.
    val i:Int = 1
    println(s"In exercise 2, i starts out as $i")
    // Also notice Scala's "string interpolation" format.
    // The "s" before the string turns it into a function that will fill in the arguments in the string

    // EXERCISE 2a: Try changing i to 3 by uncommenting the next line, and re-run the code. You should find you get a compile error.
    // i = 3

    // This is a variable. Its value can change
    var x:Int = 0

    // EXERCISE 2b: Try changing x to 3 and see what happens
    // i = 3
    // println(s"x is now $x")


    // Below is a function. 
    // * Notice the equals! 
    // * Notice there's no return statement necessary! 
    //   Scala is expression-based -- everything (including if statements) evaluates to a value.
    // * Notice we've just declared a function locally inside a function! 
    //   (This code and comment is still inside the exercise2 function.)
    // 
    // The curly braces (the block of code) evaluates to a value (2 * i). 
    // And we've declared that's what twice(i) equals...
    def twice(i:Int):Int = {
      2 * i
    }

    // EXERCISE 2c: Use println and twice functions to print out what twice 128 is
    // <<Your code goes here>>

    // Now you've completed exercise 2, exercise 3 will involve running the tests
  }



  /**-----
    * EXERCISE 3
    * 
    * Ok, hopefully just with that little playing around, you've got the hang of typing in some Scala code, running the
    * tests, and seeing what happened (eg, looking for printlns)
    *
    * Now for some exercises that involve making the tests pass.
    * You'll need to replace the ??? with actual code. And your goal is to make the tests pass.
    * (You can crib at the tests if you like - they're in the src/test/scala directory
    *
    * To run the tests, start an interactive sbt prompt and run the command "test"
    * The test framework will run every test that is defined in src/test/scala
    *
    * Run them now, and scroll up to the first test that failed. Then make it pass, and move on to the next one.
    *------------*/




  /**
      Double every element in an array.
    
      Arrays in Scala are the same as arrays in Java, but the syntax is a little different
      val arr = new Array[Int](5) 
      would declare a new (empty) array of 5 integers.

      val len = arr.length
      would get the array's length

      arr(2) = 17
      would set the third (remember, zero-indexed) entry to 17

      println(arr(1))
      would print the second (remember, zero-indexed) entry

      Use a while loop to double every entry in an array
    */
  def doubleArray(arr:Array[Int]):Array[Int] = {
    ??? //  ??? is shorthand for "throw a not-implemented-yet exception". 

    
    // remember, you don't need to use "return" in Scala. 
    // A function evaluates to the last expression in the function
  }

  /**
      Multiply every element in an array by its position in the array

      eg, for [3, 4, 2, 6, 2] produce [3 * 0, 4 * 1, 2 * 2, 6 * 3, 2 * 4]

      Use a similar while loop as before
    */
  def timesPosition(arr:Array[Int]):Array[Int] = {
    ???
  }

  /**
      This next test introduces the List class, and something about == in Scala.

      In Scala, a List is an *immutable* singly linked list. 
      Immutable means once you've created it you can't change any of its elements.

      There are two ways to define a list
      This uses "::", pronounced "cons"
      val list = 1 :: 2 :: 3 :: 4 :: 5 :: 6 :: 7 :: Nil

      This uses List.apply method
      val sameList = List.apply(1, 2, 3, 4, 5, 6, 7)
      or, because there is a Scala convention that we can omit the word "apply", this is the same
      val sameList = List(1, 2, 3, 4, 5, 6, 7)
  */
  def listsAreEqual():Boolean = {
    val list = 1 :: 2 :: 3 :: 4 :: 5 :: 6 :: 7 :: Nil
    val sameList = List(1, 2, 3, 4, 5, 6, 7)
    
    // The lists we've declared are the same. In Scala, == will try to use an object's "equals" method
    // The test just wants to verify these two lists are equal, even though they've been declared differently
    // So to make the test pass, you should just be able to uncomment the next line

    ???
    // list == sameList
  }

  def theseAreAlsoEqual():Boolean = {

    // For good measure, let's test that these also end up the same;

    // :: (cons) makes a list from a head element and a tail list. Here, 1 is the head, and List(2, 3, 4, 5, 6 7) is the tail
    val listA = 1 :: List(2, 3, 4, 5, 6, 7)

    // ++ is append for lists
    val listB = List(1, 2, 3) ++ List(4, 5, 6, 7)

    // Here, we make a list that has an extra element on the head. But then we take the tail of the list 
    // (everything but the first element)
    val listC = List(0, 1, 2, 3, 4, 5, 6, 7).tail

    ???
    // listA == listB && listB == listC
  }


  /**    
      Double the elements in a list

      If we were to try to double the elements in an immutable list using "while", we'd run into a problem:
      the elements are immutable.

      In tutorial 3, we'll see how we can do it simply using "functional" programming, but for this exercise
      double the elements in a List by converting it to an array, doubling it (using the function we defined earlier)
      and then converting it back to a new List.
    */
  def doubleList(arr:List[Int]):List[Int] = {
    // val a = arr.toArray
    // ...
    // b.toList
    ???
  }


  /**
    A "tuple" is a pair of items. It's declared using parentheses and a comma.

    For example
    (1, 'a')
    is the tuple of the Int 1 and the character 'a'

    Sometimes it is useful to define mappings as a list of tuples. For instance
    List((1, 'a'), (2, 'b'), (3, 'c'))
    so to make this more readable there is an alternative syntax for defining a tuple
    1 -> 'a'
    which would let us say
    List( 1 -> 'a', 2 -> 'b', 3 -> 'c' )

    Again this test just verifies the syntax produces the same thing
  */
  def tuplesAreEqual() = {

    val listOfTupsA:List[(Int, Char)] = 1 -> 'a' :: 2 -> 'b' :: 3 -> 'c' :: Nil
    val listOfTupsB:List[(Int, Char)] = List((1, 'a'), (2, 'b'), (3, 'c'))
    
    listOfTupsA == listOfTupsB
  }


  // NOTE: These last two are harder. Many students won't finish them.

  /**
    * Suppose we are compiling a crossword. Given two words, find all the pairs of positions where those
    * words have letters in commong. eg, for "frogs" and "eggs", we would return
    * List((3,1), (3,2), (4,3)
    */
  def matchingLetters(wordA:String, wordB:String):List[(Int, Int)] = {

    ???

  }

  /**
    * And let's finish with a little challenge: Write a function that can translate a number into Roman numerals
    */
  def roman(i:Int):String = ???


  /*
   * Ok, that should have introduced you to enough basic syntax to get started.
   * If you're after more exercises to try, have a look at exercism.io
   */

}
