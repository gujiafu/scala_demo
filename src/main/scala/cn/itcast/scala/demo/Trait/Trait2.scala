package cn.itcast.scala.demo.Trait

/**
 * trait中 带有 具体实现的方法
 */
object Trait2 {
  def main(args: Array[String]): Unit = {
    println(new Worker2().identity)
  }
}

trait Work{
  // 定义具体的字段
  val identity:String = "工人"
  // 定义抽象的字段
  val identityID:Int  // 工牌
  //* trait中也可有  具体的方法
  def working():Unit = {
    println("我在工作")
  }

  def eat():Unit
}

class Worker2 extends Work{
  override val identityID: Int = 10001

  override def eat(): Unit = println("Eat food.")
}
