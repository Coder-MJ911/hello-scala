package ecursion

import java.lang.reflect.Array

case class code(id:String, previousId:String)
object RecursionTest {
  def main(args: Array[String]): Unit = {
    val list = List(code("1",""),code("2","1"),code("3","2"),code("4","3"),code("5","4"))
    Monad[IO].iterateUntilM(List(code("5","4")))(L => List(list.find(a => l.flatMap(_.previousId).head.equals(a.id)).get) ++ l)
    (l => l.exists(a => a.previousId.isEmpty))
  }
}
