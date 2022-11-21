package cn.itcast.scala.demo.day04

/**
 * 在scala中 apply 类似工厂模式, 是构建对象的
 * 除此还有一个叫unapply, 这是解包样例类对象的方法
 */
object Demo05_Unapply {
  def main(args: Array[String]): Unit = {
    val stu = Student("zhangsan", 10)

    stu match {
      case Student(x, y) => println(s"name:$x, age:$y")
    }
  }

  class Student(val name:String, val age:Int)
  object Student{
    def apply(name:String, age:Int):Student = {
      new Student(name, age)
    }

    // 解包方法,将对象的成员变量拆出来放入元组中返回出去
    def unapply(stu:Student):Option[(String, Int)] = {
      if (stu == null) {
        None
      }else {
        Some(stu.name, stu.age)
      }
    }
  }
}
