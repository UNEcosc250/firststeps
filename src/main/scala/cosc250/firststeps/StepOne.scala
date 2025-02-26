// Like Java, Scala has "packages". These are also similar to C# namespaces.
// They help us to organise our code. We can call things from other packages, eg in the test we just say
// our test class extends `munit.FunSuite` (the FunSuite class from the munit package).
// or we can say `import munit.FunSuite` if we wanted to be able to refer to it just as `FunSuite` rather than by its
// "fully qualified name" (the name inlcuding the package).
package cosc250.firststeps

/*
 * In Java, most things needed to be wrapped in a class.
 * 
 * In Scala (as of version 3), quite a lot of things (e.g. functions) can just be declared at the "top level" - i.e.,
 * not inside a class or object. This is a little more Python-like.
 * 
 * So, let's start with some functions that we'll write at the top level.
 * 
 * By the way, as you've just seen:
 * 
 *   // Is a single line comment
 *   /* and */ surround block comments
 *
 * And Scala knows about nesting block comments - the end comment marker above didn't end this outer comment!
 */


/**
  * Just below this comment is a main method. This means you can run this object (eg, "scala run .", or "scala-cli run ." depending on what's installed).
  * You'll notice I've been able to give it a name other than "main" - the annotation `@main` has marked it as a 
  * main method. 
  * 
  * Because it's a slightly longer method, I've wrapped in in Java-like curly braces { ... }. Scala understands these,
  * so do most IDEs, and they can help visually identify where something finishes.
  * 
  * However, we could delete the curly braces, in which case the compiler would rely on the indentation to know when
  * the function definition finishes. It would also give us compiler errors if our indentation was wrong (which is
  * helpful because it forces us to indent things correctly, rather than confuse readers of our program with 
  * wrong indentation).
  * 
  * 
  *
  * EXERCISE 1: start a terminal (command line) for this project (remember, start it from the directory containing README.md)
  * and run this main method to see the message printed out. 
  * 
  * (Because there is more than one main method available, the Scala runner will ask you to give it the "interactive" flag to choose
  * e.g. "scala run . --interactive" or "scala-cli run . --interactive")
  */
@main def exercise1():Unit = {

  print("""
         |Hello from your friendly exercise start-up message! If you see this message printed at the 
         |terminal, you successfully ran this method.
         |
         |Now move on to exercise 2.
         |
         |""".stripMargin)

}

/**
  * EXERCISE 2: Basic syntax
  * 
  * This is another main method. Again, you can run it with `scala run . --interactive` or `scala-cli run . --interactive`.
  * 
  * Or you can say `scala run . --main-class cosc250.firststeps.exercise2` to tell it directly.
  * 
  */
@main def exercise2():Unit = {

  // This is a value. It can't change. Notice the type is put after the variable, not before.
  // The Scala compiler will sort out whether this needs to be a Java `int` or `Integer` and convert between them. To
  // you, it's just an `Int`.
  val i:Int = 1
  println(s"In exercise 2, i starts out as $i")
  // Also notice Scala's "string interpolation" format.
  // The "s" before the string turns it into a function that will fill in the arguments in the string
  // The arguments start with a $. If it's just a variable name, it can just be $i. 
  // If it's a longer expression, you'll need to put curly braces around it, e.g. ${i + 1}

  // TASK 2a: Try changing i to 3 by uncommenting the next line, and re-run the code. You should find you get a compile error.
  // i = 3

  // This is a variable. Its value can change
  var x:Int = 0

  // TASK 2b: Try changing x to 3 and see what happens
  // i = 3
  // println(s"x is now $x")


  // Below is a function. 
  // * Notice the equals! 
  // * Notice there's no return statement necessary! 
  //   Scala is expression-based -- everything (including if statements) evaluates to a value.
  // * Notice this time, I didn't put any curly braces and just used indentation to mark where the function begins and
  //   ends!
  // * Notice we've just declared a function locally inside a function! 
  //   (This code and comment is still inside the exercise2 function.)
  // 
  // The block of code evaluates to a value (2 * i). 
  // And we've declared that's what twice(i) equals...
  def twice(i:Int):Int = 
    2 * i

  // Here's another function.
  // * Notice this time I just wrote it all on one line. 
  // * Notice I omitted the return type and let the compiler infer it. (Though often we will declare the return type)
  def thrice(i:Int) = 3 * i
  
  // TASK 2c: Use println and twice functions to print out what twice 128 is
  // <<Your code goes here>>

  // Now you've completed Exercise 2, Exercise 3 will involve running the tests
}




/*
 * EXERCISE 3
 * 
 * Ok, hopefully just with that little playing around, you've got the hang of typing in some Scala code, running it, 
 * and seeing what happened (eg, looking for printlns)
 *
 * Now for some exercises that involve running a test suite.
 * 
 * The tests are defined in src/test/scala/cosc250/firststeps/FirstStepsSuite.scala 
 * (which I've written for you).
 * 
 * When you run the tests, you'll see most of them fail with a message saying "an implementation is missing".
 * That's because the tests are calling the functions below, which you're going to implement.
 * When you've implemented the functions, the tests should pass.
 * 
 * You'll need to replace the `???` with actual code. And your goal is to make the tests pass.
 * 
 * You can crib at the tests if you like - they're in the src/test/scala directory. But make the tests pass by
 * writing proper code. (Rather than deciding, "well, it's only testing doubleArray for Array(7) so I'll just always
 * return Array(14)".
 *
 * To run the tests, "scala test ." (or, for versions before Scala 3.5, "scala-cli test .")
 * The test framework will run every test that is defined in src/test/scala
 *
 * Run them now, and scroll up to the first test that failed. Then make it pass, and move on to the next one.
 */



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
def tuplesAreEqual():Boolean = {

  val listOfTupsA:List[(Int, Char)] = 1 -> 'a' :: 2 -> 'b' :: 3 -> 'c' :: Nil
  val listOfTupsB:List[(Int, Char)] = List((1, 'a'), (2, 'b'), (3, 'c'))
  
  // listOfTupsA == listOfTupsB
  ???
}


// NOTE: These last two are harder. Many students won't finish them.

/**
  * Suppose we are compiling a crossword. Given two words, find all the pairs of positions where those
  * words have letters in commong. eg, for "frogs" and "eggs", we would return
  * List((3,1), (3,2), (4,3)
  *
  * You will find the charAt(x:Int) method on string useful. eg, wordA.charAt(3)
  * 
  * A common error in nested loops is forgetting to reset the inner loop counter in the outer loop
  * (causing it only to go through the inner loop once, rather than once per iteration of the outer loop)
  *
  * And note that if you have 
  * var list:List[(Int,Int)] = Nil
  * you can append to the head of it with, for example
  * list = (1, 3) :: list
  * (You're not modifying the list, you're making the variable "list" point to a new list whose head is (1, 3)
  * and whose tail is the old list)
  */
def matchingLetters(wordA:String, wordB:String):List[(Int, Int)] = {

  ???

}

/**
  * And let's finish with a slightly longer challenge: Write a function that can translate a number into Roman numerals.
  * 
  * To help you over the "how would I do that in any language", let's give you a strategy...
  * 
  * Declare a Sequence of tuple from numbers to string fragments. 
  * We're not just going to include the letters like "X", we're also
  * going to include the subtractions like "IX" for 9.
  * 
  * So we want
  * M -> 1000, CM -> 900, D -> 500, CD -> 400, C -> 100, XC -> 90, L -> 50, XL -> 40, X -> 10, IX -> 9, V -> 5, IV -> 4, I -> 1
  * 
  * Now, what we're going to do is keep a "remainder" and a "string". The remainder starts out as the input number.
  * 
  * We're going to loop through our tuples from biggest to smallest - 
  * let's call the current entry in the tuples (r, i). While the remainder
  * is bigger than i, we append r to the string and subtract i from the remainder.
  * 
  * Once we're done, remainder should be 0 and the roman numeral should be in the string.
  */
def roman(i:Int):String = ???


/*
 * Ok, that should have introduced you to enough basic syntax to get started.
 * If you're after more exercises to try, have a look at exercism.io
 */

