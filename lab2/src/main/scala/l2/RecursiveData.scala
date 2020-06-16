package l2

sealed trait List[A]
case class Cons[A](head: A, tail: List[A]) extends List[A]
case class Nil[A]() extends List[A]

/** Напишите свои решения в виде функций. */
object RecursiveData {

  // a) Реализуйте функцию, определяющую является ли пустым `List[Int]`.
  def isEmpty(list: List[Int]): Boolean = list match {
    case Cons(_,_) => false
    case Nil() => true
  }
  // используйте функцию из пункта (a) здесь, не изменяйте сигнатуру
  def testListIntEmpty(list: List[Int]): Boolean = isEmpty(list)

  // b) Реализуйте функцию, которая получает head `List[Int]`или возвращает -1 в случае если он пустой.
  def intHead(list: List[Int]): Int = list match {
    case Cons(head, _) => head
    case Nil() => -1
  }

  // используйте функцию из пункта (b) здесь, не изменяйте сигнатуру
  def testListIntHead(list: List[Int]): Int = intHead(list)

  // c) Можно ли изменить `List[A]` так чтобы гарантировать что он не является пустым?
  // Ответ: можно,наверное поставить head в Nil

  /* d) Реализуйте универсальное дерево (Tree) которое хранит значения в виде листьев и состоит из:
   *      node - левое и правое дерево (Tree)
   *      leaf - переменная типа A
   */
  sealed trait Tree[A]
  case class Node[A](leaf: A, left: Tree[A], right: Tree[A]) extends Tree[A]
  case class Empty[A]() extends Tree[A]
}
