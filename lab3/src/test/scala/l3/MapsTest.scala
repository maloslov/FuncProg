package l3

import l3.Maps._
import org.scalatest.FunSuite

class MapsTest extends FunSuite {
  val seq = Seq(
    User("Adam",17),
    User("Mark", 20),
    User("Adam",21)
  )
  val map = Map(
    "Adam" -> User("Adam",28),
    "John" -> User("John", 36)
  )

  test("test Group Users") {
    assert(testGroupUsers(seq) == Map("Adam" -> 19, "Mark" -> 20))
  }

  test("test Number Frodos counts substrings |Adam|") {
    assert(testNumberFrodos(map) == 1)
  }

  test("test Underaged shows all users older 35") {
    assert(testUnderaged(map) == Map("John" -> User("John",36)))
  }

}
