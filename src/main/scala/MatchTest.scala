case class Dog(name: String, breed: String)
trait B {
  def bId = 2
}

trait A { self: B =>

  def aId = 1
}
object MatchTest {
  def charMatch(ch: Char): String = ch match {
    case '+' => "当前为+"
    case '-' => "当前为-"
    case ch if Character.isDigit(ch) => "当前为数字"+Character.digit(ch, 10)
    case _ => "当前未匹配到"
  }
  def main(args: Array[String]): Unit = {
    println("charMatch('+') : "+charMatch('+'))
    println("charMatch('9') : "+charMatch('9'))
    println("charMatch('-') : "+charMatch('-'))
    println("charMatch('*') : "+charMatch('*'))
    val d1 = Dog("Scooby", "Doberman")
    println(d1.toString)

    //val a = new A  //***does not compile!!!***
    val obj = new A with B
    println(obj.aId + obj.bId)

    val xValues = 1 to 4
    val yValues = 1 to 2
    val coordinates = for {
      x <- xValues
      y <- yValues
    } yield (x, y)
    println(coordinates(4))
    val g: Int = 31
    println(g.toHexString)
    println(-g)

    val list = List(3, 5, 9, 11, 15, 19, 21, 24, 32)
    val it = list sliding 3
    println(it.next())
    println(it.next())
    println(it.next())
  }
}
