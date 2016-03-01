package cosc250.firststeps

import org.scalatest._


/**
  * This is a specification file for ScalaTest. It's a set of unit tests written in a way that's designed to be
  * read easily.
  */
class FirststepsSpec extends FlatSpec with Matchers {

  import StepOne._

  "factorial" should "calculate factorials correctly" in {
    factorial(1) should be (1)
    factorial(2) should be (2)
    factorial(3) should be (6)
    factorial(12) should be (479001600)
  }

  "equality checks" should "be true" in {
    unspammedEqual should be (true)
    seqEqualsList should be (true)
    listEqualsSameList should be (true)
    tuplesSyntax should be (true)
  }

  "addToMap" should "return a new map with the new mapping" in {
    addToMap(6, "f").get(6) should be (Some("f"))
  }

  "Vec" should "be implemented" in {
    new Vec(1, 2).timesScalar(3) should be (new Vec(3, 6))
    new Vec(1, 2).plus(new Vec(3, 4)) should be (new Vec(4, 6))
    new Vec(3, 3).minus(new Vec(1, 2)) should be (new Vec(2, 1))
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
