package cn.itcast.scala.demo.Trait

/**
 * 演示trait作为接口使用
 */
object Trait_Interface {
  def main(args: Array[String]): Unit = {
//    new ConsoleLogger().log("单继承的trait演示")
    new ConsoleLogger().send("")
  }
}

// 当成接口用
trait Logger {
  // 抽象方法
  def log(msg:String):Unit
}

trait MessageSender {
  def send(msg:String):Unit
}

trait Worker {
  def work():Unit
}

/**
 * 在Scala中 无论是继承类还是 实现trait
 * 只有1个的时候, 都可以用extends
 */
class ConsoleLogger extends Logger with MessageSender with Worker {
  override def work(): Unit = println("我干活了")

  override def log(msg: String): Unit = println("log is: " + msg)

  override def send(msg: String): Unit = println("实现两个traint")
}
