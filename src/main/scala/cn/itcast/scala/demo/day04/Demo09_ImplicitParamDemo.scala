package cn.itcast.scala.demo.day04

// 定义一个分隔符类
case class Delimiters(left:String, right:String)

object MyPredef1 {
  implicit val q1 = Delimiters("<<<", ">>>")
  implicit val q2 = Delimiters("||<", "qqq")
  implicit val q3 = Delimiters("//<", "-->")
  implicit val q4 = Delimiters("TTT", "CCC")
}
object Demo09_ImplicitParamDemo {

  // 使用分隔符将想要引用的字符串括起来
  def quote(what:String)(implicit delims:Delimiters) = delims.left + what + delims.right

  def main(args: Array[String]): Unit = {
    println(quote("itcast")(Delimiters("[[[", "]]]")))

    import MyPredef1.q3
    println(quote("itcast"))


  }
}
