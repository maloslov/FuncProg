package l3

import l3.Strings._
import org.scalatest.FunSuite

class StringsTest extends FunSuite {

  test("test Upper case") {
    assert(testUppercase("uppercase") == "UPPERCASE")
  }

  test("test Interpolations") {
    assert(testInterpolations("MTUCI", 100) ==
      "Hi, my name is MTUCI and I am 100 years old.")
  }

  test("test Computation") {
    assert(testComputation(4, 8) ==
      "Hi,\nnow follows a quite hard calculation. We thry to add" +
        "\ta := 4\n\tb := 8\n\n\tresult is 4+8")
  }

  test("test Take Two first chars") {
    assert(testTakeTwo("Testing") ==  "Te")
  }
}
