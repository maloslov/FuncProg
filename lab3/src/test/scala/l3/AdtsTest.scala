package l3

import l3.Adts._
import org.scalatest.FunSuite

import scala.util.Success


class AdtsTest extends FunSuite{

  test("test Get Nth element") {
    assert(testGetNth(List(1, 2, 3, 4), 3).contains(4))
  }

  test("test Doubled number") {
    assert(testDouble(Some(4)).contains(8))
    assert(testDouble(None).isEmpty)
  }

  test("test Is Even") {
    assert(testIsEven(4) == Right(4))
    assert(testIsEven(5) == Left("Not even."))
  }

  test("test Safe Divide") {
    assert(testSafeDivide(8, 4) == Right(2))
    assert(testSafeDivide(4, 0) == Left("You cannot divide by zero."))
  }
def div(a:String):Int = 4/0
  test("testGoodOldJava for exceptions Try[]") {
    assert(testGoodOldJava((_:String)=>4, "test") == Success(4))
    assert(testGoodOldJava((_:String)=>4/0,"test") != Success(4))
  }
}
