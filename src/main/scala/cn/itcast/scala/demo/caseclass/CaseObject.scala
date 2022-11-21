//package cn.itcast.scala.demo.caseclass
//
///**
// * 演示 样例对象 case object
// */
//object CaseObject {
//  def main(args: Array[String]): Unit = {
//    val stu1 = Student("张三", Male)
//    val stu2 = Student("张三", Female)
//  }
//}
//
//// 作为标记使用的场景
//case object SUCCESS
//case object TIMEOUT
//case object NULLPARAMETER
//
//
//// 作为枚举使用的场景
//trait Sex
//case object Male extends Sex
//case object Female extends Sex
//
//case class Student(val name:String, val sex:Sex)
///**
// * 一般我们将case object作为2个用途
// * 1. 用作枚举
// * 2. 用作标记(比如状态是否成功, 传递一个叫SUCCESS的 case object过去)
// */
//
