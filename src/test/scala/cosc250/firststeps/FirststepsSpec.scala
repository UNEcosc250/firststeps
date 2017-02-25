package cosc250.firststeps

import org.scalatest._


/**
  * This is a specification file for ScalaTest. It's a set of unit tests written in a way that's designed to be
  * read easily.
  */
class FirststepsSpec extends FlatSpec with Matchers {

  import StepOne._

  "doubleArray" should "double the contents of an array" in {
    doubleArray(Array(1, 2, 3)) should be (Array(2, 4, 6))
    doubleArray(Array(9, 7, 5, 12)) should be (Array(18, 14, 10, 24))
  }

  "timesPosition" should "mutliply the elements of an array by their position" in {
    timesPosition(Array(1, 2, 3)) should be (Array(1 * 0, 2 * 1, 3 * 2))
    timesPosition(Array(9, 7, 5, 12)) should be (Array(9 * 0, 7 * 1, 5 * 2, 12 * 3))
  }

  "doubleList" should "double the contents of a List" in {
    doubleList(List(1, 2, 3)) should be (List(2, 4, 6))
    doubleList(List(9, 7, 5, 12)) should be (List(18, 14, 10, 24))
  }

  "matchingLettes" should "return tuples of all the matching locations in two strings" in {
    matchingLetters("frogs", "eggs") should be (List(3 -> 1, 3 -> 2, 4 -> 3))
  }

  "Roman" should "calculate roman numerals" in {
    roman(1) should be ("I")
    roman(2) should be ("II")
    roman(4) should be ("IV")
    roman(9) should be ("IX")
    roman(21) should be ("XXI")
    roman(61) should be ("LXI")
    roman(1981) should be ("MCMLXXXI")
    roman(1991) should be ("MCMXCI")
  }
}
