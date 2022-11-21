package cn.itcast.scala.demo

/**
 * 演示 Scala中的伴生对象
 * 伴生对象的概念:
 * 1. 一个Object的名字和一个Class的类名一致
 * 2. 同时这个Object和Class在一个文件中
 * 这个时候叫做:这个Object是这个Class的 伴生对象
 */
object Demo04_AssociatedObject {
  def main(args: Array[String]): Unit = {
    Student2.hello(new Student2("zhangsan", 10))
  }
}


/** class复杂非静态部分定义 */
class Student2(private val name:String, val age:Int){
  def whoAmI():Unit = {
    println(s"Im $name")
  }
}
/** 负责 静态部分定义 */
// Object 不支持带参构造器, 默认自带空参构造
object Student2{
  def hello(s:Student2):Unit = {
    // s变量被传入的时候 是已经实例化后的
    println(s"我是学生 ${s.name}")
  }
}
