import Array._

object ArrayTypeTest {
  val newArray : Array[Int] = new Array[Int](3)
  newArray(0) = 12;
  //等同于
  val otherArray = new Array[String](3)
  otherArray(0) = "first"
  //等同于
  val anotherArray: Array[Double] = Array(10.1, 12.2, 13.4)

  var myList: Array[Double] = Array(1.9, 2.9, 3.4, 3.5)
  def main(args: Array[String]): Unit = {
    // 输出所有数组元素
    for ( x <- myList ) {
      println( x )
    }
    // 计算数组所有元素的总和
    var total = 0.0;
    for ( i <- myList.indices) {
      total += myList(i);
    }
    println("总和为 " + total);
    // 查找数组中的最大元素
    var max: Double = myList(0);
    for ( i <- 1 until myList.length) {
      if (myList(i) > max) max = myList(i);
    }
    println("最大值为 " + max);


    // 合并数组
    var combineArray = concat(anotherArray, myList)
    for(x <- combineArray) {
      println(x)
    }

    // 区间数组
    // range() 方法来生成一个区间范围内的数组。range() 方法最后一个参数为步长，默认为 1
    var rangeArray = range(0,10)
    var rangeArrayWith3Step = range(10,20,3)
    for(x <- rangeArray) println(x)
    for(x <- rangeArrayWith3Step) println(x)
  }
}
