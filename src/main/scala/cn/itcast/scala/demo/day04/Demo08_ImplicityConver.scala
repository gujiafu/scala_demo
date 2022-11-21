package cn.itcast.scala.demo.day04

import java.io.File
import scala.io.Source

/**
 * Scala中的隐式转换
 */

// 功能增强的具体实现类
class RichFile(file: File) {
  def read():String = {
    // 从硬盘读取数据, 通过Source可以去读取
    Source.fromFile(file).mkString
  }
}


object A{
  // 2. 隐式转化方法, 将普通对象 通过这个方法 提升到增强类对象
  implicit def abcd(f:File) = {
    println("隐式转换方法被使用了")
    new RichFile(f)
  }
}

object B{
  implicit def erwrwtewrt(f:File) = {
    println("22222222隐式转换方法被使用了")
    new RichFile(f)
  }
}

/*
比如 Scala内部有个String类, 你用字符串觉得功能不强.
你想自己定义一个RichString 可以通过隐式转换
让普通的字符串对象, 有你自定义的增强方法可以用.

这就是作用, 对已存在 你没有办法去改它源码的东西
通过`隐式`转换 对其进行增强
 */

object Demo08_ImplicityConver {
  def main(args: Array[String]): Unit = {
    val file = new File("/Users/caoyu/Desktop/1.txt")

//    println(new RichFile(file).read())
    import B.erwrwtewrt
    println(file.read())
  }
}
