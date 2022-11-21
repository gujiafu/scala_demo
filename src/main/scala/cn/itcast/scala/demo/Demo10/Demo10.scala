package cn.itcast.scala.demo.Demo10

/**
 * 演示Scala中实例化子类的时候如何调用父类构造器
 */
object Demo10 {
  def main(args: Array[String]): Unit = {
    println(new Student("zhangsan", 11).address)
  }
}

class Person(val address:String)

class Student(val name:String, val age:Int) extends Person("北京")
