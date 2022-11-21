package cn.itcast.scala.demo.modelmatch

/**
 * 模式匹配 匹配样例类
 */
object ModelMatch2 {
  case class SubmitTask(id: String, name: String)
  case class HeartBeat(time: Long)
  case object CheckTimeOutTask
  case object SUCCESS
  def main(args: Array[String]): Unit = {

    val msg1 = SubmitTask("001", "task-001")
    val msg2 = HeartBeat(1000)
    val msg3 = CheckTimeOutTask
    val msg4 = SUCCESS

    val list: List[Any] = List(msg1, msg2, msg3, msg4)

    list(2) match {
      case SubmitTask(id, name) => println(s"id=$id, name=$name")
      case HeartBeat(time) => println(s"time=$time")
      case CheckTimeOutTask => println("检查超时")
      case SUCCESS => println("任务成功")
    }
  }


}
