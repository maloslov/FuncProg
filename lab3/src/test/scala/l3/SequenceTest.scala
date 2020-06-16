package l3

import l3.Sequence._
import org.scalatest.FunSuite

class SequenceTest extends FunSuite {

  test("test Last Element of sequence") {
    assert(testLastElement(Seq(1, 2, 3, 4)).contains(4))
  }

  test("test Zip") {
    assert(testZip(Seq(1, 2), Seq(3, 4)) == Seq((1, 3), (2, 4)))
  }

  test("test For All elements") {
    assert(testForAll(Seq(1, 2, 3, 4))((x: Int) => x < 5))
  }

  test("test Palindrom") {
    assert(!testPalindrom(Seq(1, 2, 3, 4)))
    assert(testPalindrom(Seq(1, 2, 2, 1)))
  }

  test("test Flat Map to each element") {
    assert(testFlatMap(Seq(1, 2, 3, 4))((x: Int) => Seq.range(1, x)) == Seq(1, 1, 2, 1, 2, 3))
  }
}
