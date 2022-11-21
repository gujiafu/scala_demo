package cn.itcast.scala.demo

object Demo07_Extends {
  def main(args: Array[String]): Unit = {
    val b = new B

    println(b.get)
    println(b.getName)

    val a = new A
    println(a.name)
  }
}


class A {
  val name:String = "张三"

  def getName:String = {
    this.name
  }
}

// super 不能访问val
/**
 * 如果要复写成员变量, 只能复写 val类型
 * 因为var不需要复写, 重新赋值即可.
 */
/**
 * 复写是在子类实例中的 内存空间中 把从父类继承来的 都替换掉
 * 不影响父类自己
 */
class B extends A{
  override val name: String = "王大锤"
  def get:String = {
    // Scala 没有return , 最后一行就是返回值
    this.name + "hahaha"
  }

  override def getName: String = {
    "这是复写的子类方法, 父类的name是:" + super.getName
  }
}
