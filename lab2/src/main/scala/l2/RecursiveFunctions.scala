package l2

import scala.annotation.tailrec
//import scala.List

/** Реализуйте функции для решения следующих задач.
  * Примечание: Попытайтесь сделать все функции с хвостовой рекурсией, используйте аннотацию для подтверждения.
  * рекурсия будет хвостовой если:
  *   1. рекурсия реализуется в одном направлении
  *   2. вызов рекурсивной функции будет последней операцией перед возвратом
  */
object RecursiveFunctions {

  def length[A](as: List[A]): Int = {
    @tailrec
    def loop(rem: List[A], agg: Int): Int = rem match {
      case Cons(_, tail) => loop(tail, agg + 1)
      case Nil()         => agg
    }

    loop(as, 0)
  }

  /* a) Напишите функцию которая записывает в обратном порядке список:
   *        def reverse[A](list: List[A]): List[A]
   */
  def reverse[A](list: List[A]): List[A] = {
    @tailrec
    def looper(list: List[A], res: List[A]): List[A] = list match {
      case Cons(head, tail) => looper(tail, Cons(head, res))
      case Nil() => res
    }
    looper(list, Nil())
  }

  // используйте функцию из пункта (a) здесь, не изменяйте сигнатуру
  def testReverse[A](list: List[A]): List[A] = reverse(list)

  /* b) Напишите функцию, которая применяет функцию к каждому значению списка:
   *        def map[A, B](list: List[A])(f: A => B): List[B]
   */
  def map[A,B](list: List[A])(f: A => B): List[B] = {
    @tailrec
    def looper(list: List[A], res: List[B])(f: A => B): List[B] = list match {
      case Cons(head,tail) => looper(tail, Cons(f(head),res))(f)
      case Nil() => reverse(res)
    }
    looper(list, Nil())(f)
  }

  // используйте функцию из пункта  (b) здесь, не изменяйте сигнатуру
  def testMap[A, B](list: List[A], f: A => B): List[B] = map(list)(f)
  
  /* c) Напишите функцию, которая присоединяет один список к другому:
   *        def append[A](l: List[A], r: List[A]): List[A]
   */
  def append[A](list: List[A], res: List[A]): List[A] = list match {
    case Cons(head, tail) => Cons(head,append(tail,res))
    case Nil() => res
  }

  // используйте функцию из пункта (c) здесь, не изменяйте сигнатуру
  def testAppend[A](l: List[A], r: List[A]): List[A] = append(l,r)

  /* d) Напишите функцию, которая применяет функцию к каждому значению списка:
   *        def flatMap[A, B](list: List[A])(f: A => List[B]): List[B]
   * 
   *    она получает функцию, которая создает новый List[B] для каждого элемента типа A в 
   *    списке. Поэтому вы создаете List[List[B]]. 
   */
  def flatMap[A,B](list: List[A])(f: A => List[B]): List[B] = {
    @tailrec
    def looper(list: List[A], res: List[B], f: A => List[B]): List[B] = {
      list match {
        case Cons (head, tail) => res match {
          case Cons(_,_) => looper(tail, append(res, f(head)), f)
          case Nil() => looper(tail, f(head), f)
        }
        case Nil() => res
      }
    }
    looper(list, Nil() , f)
  }

  // используйте функцию из пункта  (d) здесь, не изменяйте сигнатуру
  def testFlatMap[A, B](list: List[A], f: A => List[B]): List[B] = flatMap(list)(f)

  /* e) Вопрос: Возможно ли написать функцию с хвостовой рекурсией для `Tree`s? Если нет, почему? */
  /* Ответ:
   * В целом, возможно написать хвостовую рекурсию для дерева и
   * она пройдется по значениям только одной стороны: правой или левой от начала,
   * не охватив значения остальных ветвей.
   * */
}
