package cn.itcast.scala.demo.day04

object TMP {
  def main(args: Array[String]): Unit = {
    1 to 10


    val calc = (x:Int, y:Int) => {x * y}

    def add(x:Int, y:Int) = {
      calc(x, y)
    }

    println(add(10, 20))
  }

}
/*
闭包不是语法, 是一种使用思想.
通俗来说就是 通过外部变量的修改, 来控制方法内部计算逻辑的变更.

一般用在 定义一些 通用化的参数
比如:折扣率, 返现率
 */