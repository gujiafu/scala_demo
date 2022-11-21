package cn.itcast.scala.demo

object Demo03_Object {
  /** 因为Scala中的静态必须写到Object中,所以main写在这里. */
  def main(args: Array[String]): Unit = {
    // 静态类的特点是;不需要 new
    println(Student.name)
    println(Student.age)
    Student.hello()
  }
}

// 定义object
// object和class一样,可以由成员变量和成员方法
// Object本质上也是类, 只不过都是静态的
// 那么Student这个类,是单例的
// 所以在Scala中 object叫单例对象
object Student {
  val name = "张三"
  var age = 10

  def hello():Unit = {
    println(s"Im $name")
  }
}
