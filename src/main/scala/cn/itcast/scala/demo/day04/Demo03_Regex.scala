package cn.itcast.scala.demo.day04

import scala.util.matching.Regex

object Demo03_Regex {
  def main(args: Array[String]): Unit = {
    val emailRE: Regex = """.+@(.+)\..+""".r

    val emailList = List("38123845@qq.com", "a1da88123f@gmail.com", "zhansan@163.com", "123afadff.com")

    // 检查邮箱是否匹配正则
    val size: Iterator[Regex.Match] = emailRE.findAllMatchIn(emailList(0))
    // 如果匹配size为1，否则size为0
    println(size.toArray.mkString(","))

    // 将不合法的邮箱地址过滤出来不
    val errorEmail: List[String] = emailList.filter(
      // 方法去判断 给定的字符串 是否和正则匹配成功
      // 如果匹配成功,将结果返回到 一个迭代器中.
      emailRE.findAllIn(_).size == 1
    )
    println(errorEmail)
  }
}
// _ 不支持 println