package cn.itcast.scala.demo.Demo11_Abstract

object Demo11 {
  def main(args: Array[String]): Unit = {
    println(new Square(10).area())
    println(new Cirle(5).area())

    println(new Shape {
      override def area(): Double = {
        100.00
      }
      override val name: String = "匿名内部类"
    }.area())
  }
}

abstract class Shape {
  // 抽象方法,没有方法体 但是有方法名和返回值类型的定义
  def area():Double
  val name:String
}

// 正方形实现类
class Square(var edge:Double) extends Shape {
  override val name: String = "长方形"

  override def area(): Double = {
    edge * edge
  }
}

// 圆形实现类
class Cirle(var radius:Double) extends Shape {

  override val name: String = "圆形"

  override def area(): Double = {
    Math.PI * radius * radius
  }
}
