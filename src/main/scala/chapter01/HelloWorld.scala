package chapter01

/*
  object: 关键字，声明一个单例对象（伴生对象）
 */
object HelloWorld {
  def main(args: Array[String]): Unit = {

    var arr: Array[int] = new Array[Any](5)

    var arr2 = Array(2, 3, 42, 21, 3)

    for (i <- 0 until arr2.length) {
      println(arr2(i))
    }

    for (i <- arr2.indices) {
      println(arr2(i))
    }

    for (elem <- arr2) {
      println(elem)
    }

    var iter = arr2.iterator
    while (iter.hasNext)
      println(iter.next())

    arr2.foreach(println)
  }
}
