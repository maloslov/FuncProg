package l1

import org.scalatest.FunSuite
import l1.PatternMatching._

class PatternsTest extends FunSuite {

  test("test IntToString") {
    assert(testIntToString(1) == "its one")
    assert(testIntToString(2) == "its two")
    assert(testIntToString(3) == "its three")
    assert(testIntToString(100) == "whats that")
  }

  test("test IsMaxAndMoritz") {
    assert(testIsMaxAndMoritz("max") && testIsMaxAndMoritz("Max") &&
          testIsMaxAndMoritz("moritz") && testIsMaxAndMoritz("Moritz"))
    assert(!testIsMaxAndMoritz("notMax"))
  }

  test("test IsEven") {
    assert(testIsEven(10)  == isEven(10))
    assert(testIsEven(11)  == isEven(11))
  }

  test("test winsA - rock-scissor-paper result") {
    assert(testWinsA(Rock, Scissor)  == Win)
    assert(testWinsA(Paper, Scissor)  == Lose)
    assert(testWinsA(Scissor, Scissor)  == Draw)
  }

  test("test Extract Mammal Weight") {
    assert(testExtractMammalWeight(Mammal("cat", Meat, 5))  == 5)
    assert(testExtractMammalWeight(Fish("goldfish", Vegetables))  == -1)
  }

  test("test Update Food") {
    assert(testUpdateFood(Fish("test",Vegetables))  == Fish("test", Plants))
  }


}
