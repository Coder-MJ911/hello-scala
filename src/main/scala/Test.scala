object Test {
  var x: String = "this can be change" //可修改
  val xx: String = "this can't be changed" //不可修改
  val x1, x2: Int = 12 //x1和x2都是12

  private def newFunction() {
    print("newFunction")
  }

  def main(args: Array[String]): Unit = {
    newFunction()
  }
}
