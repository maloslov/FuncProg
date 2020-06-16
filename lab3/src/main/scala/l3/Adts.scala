package l3

import scala.util.Try

object Adts {

  // a) Дан List[Int], верните элемент с индексом n
  def getNth(list: List[Int], n: Int, index: Int): Option[Int] = {
    Some(list(n))
  }
  // примените функцию из пункта (a) здесь, не изменяйте сигнатуру
  def testGetNth(list: List[Int], n: Int): Option[Int] = getNth(list, n, 0)

  // b) Напишите функцию, увеличивающую число в два раза.
  def multiply(x: Option[Int]): Option[Int] = {
    if (x.isDefined) Some(2 * x.get)
    else None
  }
  // примените функцию из пункта (b) здесь, не изменяйте сигнатуру
  def testDouble(n: Option[Int]): Option[Int] = multiply(n)

  // c) Напишите функцию, проверяющую является ли число типа Int четным. Если так, верните Right. В противном случае, верните Left("Нечетное число.").
  def isEven(x: Int): Either[String,Int] = x % 2 match {
    case 0 => Right(x)
    case 1 => Left("Not even.")
  }
  // примените функцию из пункта (c) здесь, не изменяйте сигнатуру
  def testIsEven(n: Int): Either[String, Int] = isEven(n)

  // d) Напишите функцию, реализующую безопасное деление целых чисел. Верните Right с результатом или Left("Вы не можете делить на ноль.").
  def safeDivide(x: Int, y: Int): Either[String,Int] = {
    if(y==0) Left("You cannot divide by zero.")
    else Right(x/y)
  }
  // примените функцию из пункта (d) здесь, не изменяйте сигнатуру
  def testSafeDivide(a: Int, b: Int): Either[String, Int] = safeDivide(a,b)

  // e) Обработайте исключения функции с побочным эффектом вернув 0.
  def goodOldJava(impure: String => Int, str: String): Try[Int] = {
    Try(impure(str))
  }

  // примените функцию из пункта (e) здесь, не изменяйте сигнатуру
  def testGoodOldJava(impure: String => Int, str: String): Try[Int] = goodOldJava(impure,str)
}
