package cn.itcast.scala.demo.caseclass

/**
 * 演示Scala的甜品级API 样例类
 */
object CaseClass1 {
  def main(args: Array[String]): Unit = {
    // 1. 自动实现了apply
    val stu = Student("张三", 10)


    // 2. 自动实现了toString 99% val
    println(stu.toString)
    println(new Person("哈哈").toString)

    // 3. 自动实现了equals
    val stu2 = Student("张三", 10)
    val stu3 = Student("张三", 10)
    val stu4 = Student("张三222", 10)
    println(stu2 == stu3)
    println(stu2 == stu4)

    // 4. 自动实现了hash code方法
    println(stu2.hashCode())
    println(stu3.hashCode())
    println(stu4.hashCode())

    // 5. 自动实现了对象的copy方法
    val stu5 = stu2.copy()
    val stu6 = stu2.copy(name="王五")
    println(stu5 eq stu6)
  }
}

// 不写var 默认是val类型
// 多数场景下,我们将样例类作为javabean来使用
// 同时多数情况下我们将数据封装到case class中
// 特别是一些二维表结构
case class Student(name:String, age:Int)

class Person(name:String)