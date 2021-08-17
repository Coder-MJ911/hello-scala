object Collection {
  def main(args: Array[String]): Unit = {
    //定义List
    var list = List(1, 2, 3, 1)
    for(x <- list) println(x)

    //定义set
    var set = Set(2, 5, 2, 9, 10) // 2 只会出现一次
    for(x <- set) println(x)

    //定义map
    var map = Map("key1" -> 211, "key2" -> 123, "key3" -> 345)
    for(x <- map.keys) println(x)
    for(x <- map.values) println(x)

    //定义Option
//    val option : Option[String] = Some["str"]
//    println("the option value is " + option.toString) Todo:this line has a issue while running
    val myMap: Map[String, String] = Map("key1" -> "value")
    var value1 = myMap.get("key1") //Some["value"]
    var value2 = myMap.get("key2") //None
    println(value1)
    println(value2)

    val a:Option[Int] = Some(5)
    val b:Option[Int] = None

    println("a.getOrElse(0): " + a.getOrElse(0) )
    println("b.getOrElse(10): " + b.getOrElse(10) )
    println("b.getOrElse(): " + b.getOrElse() )
  }
}
