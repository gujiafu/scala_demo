package cn.itcast.scala.demo

/**
 * 对类进行判断
 * 对象.getClass == classOf[类] 这样判断是精确判断不受到继承影响
 * 对象.isInstanceOf[类] 判断是不精确的 , 收到继承的影响
 */

object Demo08_IsInstanceOFAndAsInstanceOF {
  def main(args: Array[String]): Unit = {
    // 判断类型
    val bb = new BB
    println(bb.isInstanceOf[AA])
    println(bb.getClass == classOf[AA])

    // 做类型强制转换, 类型转换 本质上是将对象标记的类型进行转换
    // 对象本身(内存空间)不会发生变化
    // 也就是转换后就是: 以父类类型对象 去 指向 子类实例
    val aa: AA = bb.asInstanceOf[AA]
    println(aa.getClass == classOf[AA])

    /**
     * bb.asInstanceOf[AA] 这样等同于
     * val a:AA = bb
     */
  }
}

/**
 * 你是一个 人类, 我把你强制转换成动物
 * 这就是给你身上的标签改成动物
 * 但不影响你是人类的事实
 */

class AA

class BB extends AA
