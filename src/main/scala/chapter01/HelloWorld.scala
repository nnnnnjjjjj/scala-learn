package chapter01

/*
  object: 关键字，声明一个单例对象（伴生对象）
 */
object HelloWorld {
  def main(args: Array[String]): Unit = {

    var name = "zhangsan"
    var age = 15
    println(s"name=$name, age=$age")
  }
}
