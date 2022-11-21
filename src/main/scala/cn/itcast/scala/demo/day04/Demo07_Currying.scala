package cn.itcast.scala.demo.day04

/**
 * 演示scala中的柯里化
 * 允许方法接收多个  `参数列表`
 */
object Demo07_Currying {
  def main(args: Array[String]): Unit = {
    val carried: ((Int, Int) => Int) => Int = calc_carried(10, 20)
    val result1 = carried(_ + _)
    val result2 = carried(_ - _)
    val result3 = carried(_ / _)
    val result4 = carried(_ * _)
//
//    println(result)

//    println(calc_carried(10, 20)(_ + _))
  }

  // 柯里化的方法, 允许接收2个 参数列表
  def calc_carried[Int](x:Int, y:Int)(func_calc:(Int, Int)=>Int) = {
    func_calc(x, y)
  }
}
