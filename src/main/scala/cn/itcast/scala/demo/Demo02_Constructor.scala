package cn.itcast.scala.demo

/**
 * 演示scala中的构造器
 * scala构造器分为:
 * 1. 主构造器
 * 2. 辅助构造器
 */
object Demo02_Constructor {
  def main(args: Array[String]): Unit = {
    val student = new Student("zhangsan", 10)
    val student2 = new Student("zhangsan", 10, "男")
    val student3 = new Student("zhangsan", 10, "男", "北京")
  }

  /*
这个会完成:
1. 定义两个成员变量 name 和age
2. 构建一个 双参数的 构造函数
3. 完成传入参数 到成员变量的赋值

这种形式叫做主构造器
主构造器: 在类名的后面给上传入参数列表
主构造器肯定存在, 不写参数列表就是默认是无参数的主构造器
 */
  class Student(val name:String, val age:Int) {
    var sex = ""
    var address = ""

    /** 重载的 构造方法 */
    /*
    定义在 类的 类体中的 def this 方法, 被称之为 辅助构造器
    辅助构造器必须: 先调用主构造器 或者其它辅助构造器.
    辅助构造器可以有无限个
     */
    def this(name:String, age:Int, _sex:String) {
      this(name, age)
      this.sex = _sex
    }

    def this(name:String, age:Int, _sex:String, _address:String) {
      this(name, age, _sex)
      this.address = _address
    }

  }
}



