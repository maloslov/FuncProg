package l1

import org.scalatest.FunSuite
import l1.HigherOrder._

class HigherOrderTest extends FunSuite {

  test("Ntimes func") {
    assert(testNTimes((a: Int, b: Int) => a * b,  3, 3, 4)  == 36)
  }

  test("NTimes anonymous func") {
    assert(testAnonymousNTimes(4, 3, 6)  == 24)
    assert(testAnonymousNTimes(3, 4, 6)  == 24)
  }
}
