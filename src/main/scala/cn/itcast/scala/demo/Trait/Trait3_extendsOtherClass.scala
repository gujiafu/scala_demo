package cn.itcast.scala.demo.Trait

/**
 * 演示trait可以集成其它的class
 */
object Trait3_extendsOtherClass {
  def main(args: Array[String]): Unit = {
    val stu = new Stu()
    stu.tech
    stu.eat
  }
}

class Human {
  def eat:Unit = {
    println("吃饭了")
  }
}

class Stu extends teacher

trait teacher extends Human {
  def tech:Unit = {
    this.eat
    println("上课了")
  }
}
