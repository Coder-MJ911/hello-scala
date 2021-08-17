object StringTest {
  val s : String = "this is a String"

  // 修改字符串 val定义的Array
  val canBeChangedString : StringBuilder = new StringBuilder;
  canBeChangedString += 'c'
  canBeChangedString ++= "add a str"
  def main(args: Array[String]): Unit = {
    println(s)
    print(canBeChangedString.toString)
  }
}
