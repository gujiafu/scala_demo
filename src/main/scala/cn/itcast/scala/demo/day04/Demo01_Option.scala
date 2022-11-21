package cn.itcast.scala.demo.day04

/**
 * 演示Scala中的Option对象
 */
object Demo01_Option {
  def main(args: Array[String]): Unit = {
    // Option泛型,表示的是 如果有值 这个值是什么
    val result: Option[Int] = div(10,2 )

    // 通过getOrElse方法取得Option对象的内容
    val i = result.getOrElse(0)
    // 通过模式匹配得到返回值
    result match {
      case Some(x) => println("得到结果是:" + x)
      case None => println("没有结果...")
    }

  }

  // 两数相除的方法
  def div(x:Int, y:Int): Option[Int] = {
    if (y != 0) {
      Some(x / y)
    }else {None}
  }
}
