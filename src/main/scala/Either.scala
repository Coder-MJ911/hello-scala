object Either {
  def main(args: Array[String]): Unit = {
    def div(x:Double, y:Double):Either[String, Double] = if(y==0) Left("y is 0") else Right(x/y)
    println("div(1,2) : "+div(1,2)) // Right(0.5)
    println("div(1,0) : "+div(1,0)) // Left("y is 0")

    def compare(x:Double, y:Double):Either[String, String] = if(x>=y) Left("左边>=右边") else Right("右边>左边")
    println("compare(1,3) : "+compare(1,3))
    println("compare(3,1.2) : "+compare(3,1.2))

    val a:Either[String, Int] = Left("Some error happen")
    println("a.map(_+1) : "+a.map(_+1)) // Left("Some error happen")
    println("a.flatMap(x => div(x, 1)) : "+a.flatMap(x => div(x, 1))) // Left("Some error happen")
    println("a.flatMap(x => div(x, 0)) : "+a.flatMap(x => div(x, 0))) // Left("Some error happen")

    val b:Either[String, Int] = Right(1)
    println("b.map(_+1) : "+b.map(_+1)) // Right(2)
    println("b.flatMap(x => div(x, 1)) : "+b.flatMap(x => div(x, 1))) // Right(1)
    println("b.flatMap(x => div(x, 0)) : "+b.flatMap(x => div(x, 0))) // Left("y is 0")

    val aa = for {
      x1 <- div(1,2)
      x2 <- div(1,2)
      x3 <- div(1,2)
    } yield x1 + x2 + x3 // Right(1.5)

    val bb = for {
      x1 <- div(1,2)
      x2 <- div(1,2)
      x3 <- div(1,0)
    } yield x1 + x2 + x3 // Left("y is 0")

    println("aa = "+aa)
    println("bb = "+bb)
  }
}
