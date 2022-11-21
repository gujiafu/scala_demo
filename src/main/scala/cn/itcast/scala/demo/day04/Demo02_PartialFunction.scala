package cn.itcast.scala.demo.day04

/**
 * 演示Scala中的偏函数
 */
object Demo02_PartialFunction {
  def main(args: Array[String]): Unit = {
    val input:Any = 0

    /**
     * 偏函数就是将模式匹配放入函数中
     * 偏函数接受一个对象的传入,可以有一个返回值
     * 偏函数的类型:PartialFunction[T1, T2]
     * T1泛型指的是传入对象类型, T2表示是返回值类型如果没有返回值就填Unit
     */
    val pFunc: PartialFunction[Any, Unit] = {
      // 通过偏函数的方式,模式匹配就能够复用了.
      case x:String => println("这是String")
      case y:Int => println("这是Int")
      case z:Double => println("这是Double")
    }
    pFunc(input)
  }
}
