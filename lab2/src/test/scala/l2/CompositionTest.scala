package l2

import org.scalatest.FunSuite
import l2.Compositions._

class CompositionTest extends FunSuite {

  test("test Compose") {
    assert(testCompose((i:Int) => "Test" * i)((i: String) => i * 2)
    ((i:String) => i.dropRight(2))(2) == "TestTestTestTe")
  }

  test("test Flat Map") {
    assert(testMapFlatMap((i: Int) => if (i > 0) Some(i) else None)
    ((i: Int) => if (i > 10) Some(i) else None)
    ((i: Int) => i * 2)(Some(-1)).isEmpty)
  }

  test("test For Comprehension") {
    assert(testForComprehension((i: Int) => if (i > 0) Some(i) else None)
    ((i: Int) => if (i > 5) Some(i) else None)
    ((i: Int) => i * 2)(Some(6)).contains(12))
  }

}
