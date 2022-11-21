package cn.itcast.scala.demo.day04

object Demo04_Execption {
  def main(args: Array[String]): Unit = {
    1 / 0
    try{
      1 / 0
    }catch {
      // 这里面是偏函数
      case ex1:Exception => println("除数为0异常")
        throw new Exception("这是一个异常")
    }finally {
      // .....
    }
  }
}
