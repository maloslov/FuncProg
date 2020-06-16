package l1

object PatternMatching {

  sealed trait Hand
  case object Rock    extends Hand
  case object Paper   extends Hand
  case object Scissor extends Hand

  sealed trait Result
  case object Win  extends Result
  case object Lose extends Result
  case object Draw extends Result

  sealed trait Food
  case object Meat       extends Food
  case object Vegetables extends Food
  case object Plants     extends Food

  sealed trait Animal {
    val name: String
    val food: Food
  }
  case class Fish(name: String, food: Food)            extends Animal
  case class Mammal(name: String, food: Food, weight: Int) extends Animal
  case class Bird(name: String, food: Food)            extends Animal

  /* a) Напишите функцию, которая ставит в соответствие числу строку слудеющим образом:
   * Если:
   *     1 => "it is one"
   *     2 => "it is two"
   *     3 => "it is three"
   *     иначе => "what's that"
   */
  def intToString(a: Int): String =
    a match {
      case 1 => "its one"
      case 2 => "its two"
      case 3 => "its three"
      case _ => "whats that"
    }
  // примените вашу функцию из пункта (a) здесь, не изменяя сигнатуру
  def testIntToString(value: Int): String = intToString(value)

  /* b) Напишите функцию которая возвращает true если переменная `value` принимает значение:
   *     "max" или "Max"
   *     "moritz" или "Moritz"
   */
  def IsMaxAndMor(a: String): Boolean =
    if(a=="Max"||a=="max"||a=="Moritz"||a=="moritz") true
    else false
  // примените функции из пункта (b) здесь, не изменяя сигнатуру
  def testIsMaxAndMoritz(value: String): Boolean = IsMaxAndMor(value)

  // c) Напишите функцию проверки является ли `value` четным
  def isEven(a: Int): Boolean = a % 2 == 0
  // примените функции из пункта (c) здесь, не изменяя сигнатуру
  def testIsEven(value: Int): Boolean = isEven(value)

  /* d) Напишите функцию, моделирующую игру в Камень ножницы бумага 
   *     1. камень побеждает ножницы
   *     2. ножницы побеждают бумагу
   *     3. бумага побеждает камень
   *    Выиграет ли игрок `a`?
   */
  def whoWinsRSP(a: Hand, b: Hand): Result = {
    if(a==b) Draw
    else if(a==Rock&& b==Scissor||
      a==Scissor && b==Paper||
      a==Paper && b==Rock) Win
    else Lose
  }
  // примените вашу функцию из пункта (d) здесь, не изменяя сигнатуру
  def testWinsA(a: Hand, b: Hand): Result = whoWinsRSP(a, b)

  // Примечание: используйте определение Animals
  // e) Верните вес (weight: Int) объекта Mammal, иначе верните -1.
  def extractMammalWeight(animal: Animal): Int = animal match {
      case mammal: Mammal => mammal.weight
      case _ => -1
    }
  // примените функцию из пункта (e) здесь, не изменяйте сигнатуру
  def testExtractMammalWeight(animal: Animal): Int = extractMammalWeight(animal)
  // f) Измените поле еда объектов классов Fishes и Birds на Plants, класс Mammal оставьте неизмененным.
  def updateFood(animal: Animal): Animal =
  animal match {
    case bird: Bird => Bird(bird.name,Plants)
    case fish: Fish => Fish(fish.name,Plants)
    case _ => animal
  }
  // примените функцию из пункта (f) здесь, не изменяйте сигнатуру
  def testUpdateFood(animal: Animal): Animal = updateFood(animal)
}
