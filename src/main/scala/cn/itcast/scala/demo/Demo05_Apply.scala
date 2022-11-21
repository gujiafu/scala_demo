package cn.itcast.scala.demo

object Demo05_Apply {
  def main(args: Array[String]): Unit = {
    val person: Person = Person.apply("张三", 10)

    val Person2: Person = Person("王五", 10)
  }
}

class Person(val name:String, val age:Int)

object Person{
  def apply(name:String, age:Int):Person = {
    new Person(name, age)
  }
}