package l2

import org.scalatest.FunSuite
import l2.RecursiveData._

class RecursiveDataTest extends FunSuite{

  test("test List Int Empty") {
    assert(testListIntEmpty(Nil()))
    assert(!testListIntEmpty(Cons(1, Cons(2, Cons(3, Cons(4,Nil()))))))
  }

  test("test List Int Head") {
    assert(testListIntHead(Cons(1, Cons(2, Cons(3, Cons(4,Nil()))))) == 1)
    assert(testListIntHead(Nil()) == -1)
  }
}
