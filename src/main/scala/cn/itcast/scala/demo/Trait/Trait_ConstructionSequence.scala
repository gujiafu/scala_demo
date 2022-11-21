package cn.itcast.scala.demo.Trait

class Person_One {
  println("2执行Person构造器!")
}
trait Logger_One {
  println("5执行Logger构造器!")
}
trait MyLogger_One extends Logger_One {
  println("3执行MyLogger构造器!")
}
trait TimeLogger_One extends Logger_One {
  println("4执行TimeLogger构造器!")
}
class Student_One extends Person_One with MyLogger_One with TimeLogger_One {
  println("1执行Student构造器!")
}
object Trait_ConstructionSequence {
  def main(args: Array[String]): Unit = {
    val student = new Student_One
  }
}