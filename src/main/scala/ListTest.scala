object ListTest {
  //list 链接表结构 列表是不可变的，值一旦被定义了就不能改变
  def main(args: Array[String]): Unit = {
    val a = List(1,2,3)
    val b = 1::a
    val c = List(1) ::: List(1,2,3)  //用 ::: 运算符或 List.:::() 方法或 List.concat() 方法来连接两个或多个列表
    val d = 1::Nil //Nil 也可以表示为一个空列表

    println("a = "+a)
    println("b = "+b)
    println("c = "+c)
    println("d = "+d)

    //用 ::: 运算符或 List.:::() 方法或 List.concat() 方法来连接两个或多个列表:
    val site1 = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
    val site2 = "Facebook" :: ("Taobao" :: Nil)

    // 使用 ::: 运算符
    var fruit = site1 ::: site2
    println( "site1 ::: site2 : " + fruit ) //site1 ::: site2 : List(Runoob, Google, Baidu, Facebook, Taobao)

    // 使用 List.:::() 方法
    fruit = site1.:::(site2)
    println( "site1.:::(site2) : " + fruit ) //site1.:::(site2) : List(Facebook, Taobao, Runoob, Google, Baidu)
    //:::与.:::略有不同

    // 使用 concat 方法
    fruit = List.concat(site1, site2)
    println( "List.concat(site1, site2) : " + fruit  )

    //list.fill(n)(value) 重复value n次
    val site = List.fill(3)("Runoob") // 重复 Runoob 3次
    println( "site : " + site  )

    val num = List.fill(10)(2)         // 重复元素 2, 10 次
    println( "num : " + num  )

    //拼接list
    val abc = for {
      x1 <- List(1,2,3)
      x2 <- List(1,2,3)
    } yield x1+x2
    println("abc = "+abc)

    val aj = 2
    val bj = aj match {
      case x:Int => x
      case _ => -1
    }
    println("bj = "+bj)
  }
}
