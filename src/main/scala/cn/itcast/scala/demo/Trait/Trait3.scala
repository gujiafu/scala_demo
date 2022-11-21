package cn.itcast.scala.demo.Trait

/**
 * 演示 单个对象也可以 with 一个trait
 */
object Trait3 {
  def main(args: Array[String]): Unit = {
    // 给单个对象 在构建的时候 附加trait的特性.   这是临时性的(匿名内部类的实现)
    val p1: Person with Say with Say2 = new Person("张三") with Say with Say2 {
      override def hahaha(): Unit = println("hahaha")
    }
    val p2: Person = new Person("张三")

    p1.roar("")
  }
}

class Person(val name:String){
  def getName(): Unit = {
    println(s"Im $name")
  }
}

trait Say{
  def roar(): Unit = {
    println("汪汪汪汪")
  }
}

trait Say2{
  def roar(msg:String): Unit = {
    println("汪汪汪汪222222")
  }
  def hahaha():Unit
}
