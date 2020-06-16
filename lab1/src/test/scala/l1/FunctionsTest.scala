package l1

import org.scalatest.FunSuite
import l1.Functions._

class FunctionsTest extends FunSuite {
  test("Circle square")  {
    assert(testCircle(4) == 16 * Math.PI)
  }

  test("Rectangle square by curried func")  {
    assert(testRectangleCurried(4, 8) == 32)
  }

  test("Rectangle square by casual func")  {
    assert(testRectangleUc(4, 8) == 32)
  }
}
