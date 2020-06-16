package l1

sealed trait Animal {
  val name: String
  val food: Food
  def eats(ifood: Food): Boolean = { food.equals(ifood) }
}

case class Mammals(name: String, food: Food) extends Animal
case class Birds(name: String, food: Food) extends Animal
case class Fishes(name: String, food: Food) extends Animal

object Animal {
  val animal1 = Mammals("cat", Meat)
  val animal2 = Birds("parrot", Vegetables)
  val animal3 = Fishes("goldfish", Plants)
  def knownAnimal(iname: String): Boolean = { iname==animal1.name||iname==animal2.name||iname==animal3.name }
  def applyName(iname: String): Option[Animal] = iname match{
    case animal1.name => Some(animal1)
    case animal2.name => Some(animal2)
    case animal3.name => Some(animal3)
    case _ => None
  }
}

sealed trait Food
case object Meat extends Food
case object Vegetables extends Food
case object Plants extends Food

object Food {
  def apply(ifood: String): Option[Food] = {
    if(ifood=="meat") Some(Meat)
    else if(ifood=="vegetables") Some(Vegetables)
    else if(ifood=="plants") Some(Plants)
    else None
  }
}
