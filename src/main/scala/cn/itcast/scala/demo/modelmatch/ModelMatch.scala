package cn.itcast.scala.demo.modelmatch

import scala.io.StdIn

/**
 * 演示scala的模式匹配功能
 */
object ModelMatch {
  def main(args: Array[String]): Unit = {
    // 1. 简单匹配
    println("Input value......")
//    val name = StdIn.readLine()
    val name = "hadoop"

    name match {
      case "hadoop" => println("分布式存储系统")
      case "zookeeper" => println("分布式协调系统")
      case "spark" => println("分布式计算框架")
      case _ => println(s"不知道你输入的这个:$name 是什么")
    }

    // 2. 守卫(if判断)
    val num = 10
    num match {
      case x if num >= 0 && num <= 7 => println(s"你是0-7 $x")
      case y if num > 7 => println(s"你是大于7 $y")
    }

    // 3. 匹配类型
    val v:Any = ""
    v match {
      case x:String => println("你是字符串")
      case y:Int => println("你是数字")
      case z:Double => println("你是Double")
      case _ => println("我不认识你")
    }

    // 4. 匹配集合
    val arr = Array(0, 1)
    arr match {
      case Array(1, x, y) => println("111" + x + " " + y)
      case Array(0) => println("only 0")
      case Array(0, _*) => println("0 ...")
      case _ => println("something else")
    }

    // 5. 声明变量中的模式匹配
    val arr2 = 1 to 10 toArray

    // 使用模式匹配，获取第二个、第三个、第四个元素的值
//    val x = arr(1)
//    val y = arr(2)
//    val z = arr(3)
    val Array(_, x, y, z, _*) = arr2

    println(s"x=$x, y=$y, z=$z, ")


  }
}
