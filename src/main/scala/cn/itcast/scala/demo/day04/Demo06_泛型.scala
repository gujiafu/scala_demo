package cn.itcast.scala.demo.day04

object Demo06_Pair {
  // 不是case  没有自动的apply
  // 这种定义泛型的方式 叫做 非变,定义: 泛型之间 不理会 继承关系
  case class Pair[T](name:T)

  // 这种方式叫做协变,定义: 泛型之间 理会 继承关系
//  case class Pair[+T](name:T)

  // 这种方式叫做逆变, 定义:泛型之间 理会继承关系, 但是是逆转了这个关系
//  case class Pair[-T](name:Any)
  class Super
  class Sub extends Super
  def main(args: Array[String]): Unit = {
    val p1 = Pair(new Sub)
    // 编译报错，无法将p1转换为p2
    val p2:Pair[Sub] = p1

    println(p2)
  }

  /**
   * 非变:啥符号也不带.   不接受继承关系.
   * 协变:用+, 接受继承关系, 允许泛型之间的多态
   * 逆变:用-, 接受继承关系, 允许泛型之间的反向多态(在泛型中父变子,子变父)
   *
   * class super
   * class sub extends super
   * 在类和类之间, super永远是父类 sub肯定是super的子类
   * 在泛型中, 如果是协变, super是父类
   * 在泛型中, 如果是逆变, super反而是儿子,sub是父类
   */

}
