package l1

import org.scalatest.FunSuite

class ClassesTest extends FunSuite {

  test("test Animal.applyName") {
    assert(Animal.applyName("none").isEmpty)
    assert(Animal.applyName("cat").contains(Animal.animal1))
    assert(Animal.applyName("parrot").contains(Animal.animal2))
    assert(Animal.applyName("goldfish").contains(Animal.animal3))
  }

  test("test Food.apply"){
    assert(Food.apply("none").isEmpty)
    assert(Food.apply("meat").contains(Meat))
    assert(Food.apply("vegetables").contains(Vegetables))
    assert(Food.apply("plants").contains(Plants))
  }

  test("test KnownAnimal") {
    assert(!Animal.knownAnimal("nobody"))
    assert(Animal.knownAnimal("cat") && Animal.knownAnimal("parrot") &&
      Animal.knownAnimal("goldfish"))
  }
  test("Animal eats food") {
    val anim = Mammals("test", Meat)
    assert(anim.eats(Meat))
    assert(!anim.eats(Plants))
  }
}