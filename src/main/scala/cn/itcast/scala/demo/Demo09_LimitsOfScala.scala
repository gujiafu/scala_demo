//package cn.itcast.scala.demo
//
//object Demo09_LimitsOfScala {
//  def main(args: Array[String]): Unit = {
//    new Person().name
//  }
//}
//
//class Person {
//  protected[this] val name = "zhangsan"
//
//  def getName = {
//    println(this.name)
//  }
//
//  def say(p:Person) = {
//    p.name
//  }
//}
//
//object Person{
//  def get(p:Person): Unit = {
//    println(this.name)
//  }
//}
//
//class PersonSub extends Person {
//  def say() = {
//    this.name
//  }
//}
