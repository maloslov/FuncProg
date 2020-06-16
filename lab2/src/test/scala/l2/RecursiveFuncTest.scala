package l2

import l2.RecursiveFunctions._
import org.scalatest.FunSuite

class RecursiveFuncTest extends FunSuite {

  test("test Reverse list") {
    assert(testReverse(Cons(1, Cons(2, Cons(3, Cons(4,Nil()))))) ==
      Cons(4, Cons(3, Cons(2, Cons(1,Nil())))))
  }

  test("test Map") {
    assert(testMap(Cons(1, Cons(2, Cons(3, Cons(4,Nil())))), (x: Int) => x * 2) ==
      Cons(2, Cons(4, Cons(6, Cons(8,Nil())))))
  }

  test("test Append") {
    assert(testAppend(Cons(1, Cons(2, Cons(3,Nil()))), Cons(4, Cons(5, Cons(6,Nil())))) ==
      Cons(1, Cons(2, Cons(3, Cons(4, Cons(5, Cons(6,Nil())))))))
  }

  test("test Flat Map") {
    assert(testFlatMap(Cons(2, Cons(3, Cons(4, Cons(5,Nil())))), (x:Int) => Cons(1, Cons(x,Nil()))) ==
      Cons(1,Cons(2,Cons(1,Cons(3,Cons(1,Cons(4,Cons(1,Cons(5,Nil())))))))))
  }
}
