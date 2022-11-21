package cn.itcast.scala.demo.Trait

/**
 * 验证Trait之间的继承关系导致的调用关系
 */

object PaymentService {
  def main(args: Array[String]) {
    val payService = new PaymentService()
    payService.pay("signature:10233123||md5:123889a3d5s1f6123||data:{order:001,money:200}")
  }
}
// 支付数据处理
trait HandlerTrait {
  def handle(data: String) = {
    println(s"处理数据...$data")
  }
}

// 数据校验处理
trait DataValidHandlerTrait extends HandlerTrait {
  override def handle(data: String) = {
    println("验证数据...")
    super.handle("a")
  }
}

// 签名校验处理
trait SignatureValidHandlerTrait extends HandlerTrait {
  override def handle(data: String) = {
    println("检查签名...")
    super.handle("b")
  }
}

// 支付服务
class PaymentService extends DataValidHandlerTrait with SignatureValidHandlerTrait {
  def pay(data:String) = {
    println("准备支付...")

    this.handle(data)

  }
}


// 程序运行输出如下：
// 准备支付...
// 检查签名...
// 验证数据...
// 处理数据...