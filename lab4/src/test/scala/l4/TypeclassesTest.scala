package l4

import org.scalatest.FunSuite
import l4.Typeclasses._

class TypeclassesTest extends FunSuite {

  test("test Reversable String") {
    assert(ReversableString.reverse("Esrever") == "reversE")
    assert(testReversableString("Reverse") == "esreveR")
  }

  test("test Smash for Int") {
    assert(SmashInt.smash(4, 0) == 4)
    assert(testSmashInt(4, 7) == 11)
  }

  test("test Smash for Double") {
    assert(SmashDouble.smash(4.7, 0) == 0)
    assert(testSmashDouble(4.7, 7.4) == 34.78)
  }

  test("test Smash for String") {
    assert(SmashString.smash("concate","") == "concate")
    assert(testSmashString("Concat", "ination") == "Concatination")
  }
}
