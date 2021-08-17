object NoneAndSomeAndyield {
  def div(x:Double, y:Double):Option[Double] = if(y==0) None else Some(x/y)
  def main(args: Array[String]): Unit = {
    val a:Option[Int] = None
    println("a.map(_+1) : "+a.map(_+1)) // None
    println("a.flatMap(x => div(x, 1)) : "+a.flatMap(x => div(x, 1))) // None
    println("a.flatMap(x => div(x, 0)) : "+a.flatMap(x => div(x, 0))) // None

    val b:Option[Int] = Some(1)
    println("b.map(_+1) : "+b.map(_+1)) // Some(2)
    println("b.flatMap(x => div(x, 1)) : "+b.flatMap(x => div(x, 1))) // Some(1)
    println("b.flatMap(x => div(x, 0)) : "+b.flatMap(x => div(x, 0))) // None

    val aa = for {
      x1 <- div(1,2)
      x2 <- div(1,2)
      x3 <- div(1,2)
    } yield x1 + x2 + x3 // Some(1.5)
    println("aa = "+aa)

    val bb = for {
      x1 <- div(1,2)
      x2 <- div(1,2)
      x3 <- div(1,0)
    } yield x1 + x2 + x3 // None
    println("bb = "+bb)
  }
}
