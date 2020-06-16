package l1
object Functions {
  // a) Напишите функцию, которая рассчитывает площадь окружности
  def circleSquare(r: Double):Double = r*r*Math.PI
  // примените вашу функцию из пункта (a) здесь, не изменяя сигнатуру
  def testCircle(r: Double): Double = circleSquare(r)
  // b) Напишите карированную функцию которая рассчитывает площадь прямоугольника a * b.
  def angleCurry(a: Double): Double => Double = (b: Double) => a*b
  // примените вашу функцию из пукта (b) здесь, не изменяя сигнатуру
  def testRectangleCurried(a: Double, b: Double): Double = angleCurry(a)(b)
  // c) Напишите не карированную функцию для расчета площади прямоугольника.
  def angleSquare(a: Double, b:Double): Double = a*b
  // примените вашу функцию из пункта (c) здесь, не изменяя сигнатуру
  def testRectangleUc(a: Double, b: Double): Double = angleSquare(a,b)
}
