package cn.itcast.scala.demo

import scala.beans.BeanProperty

object Demo01_ClassDefine {
  def main(args: Array[String]): Unit = {
    val student = new Student()
    println(student)
  }

  class Student {
    @BeanProperty
    var name = "zhangsan"
    @BeanProperty
    var age = 10

    def sayHello(): Unit = {
      println(s"Hello My Name is $name age is: $age")
    }
  }
}
