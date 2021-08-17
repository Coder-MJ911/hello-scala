class ClassAndObject private(val color: String) {
  var colorInternal: String = color
  println("调用私有构造函数，且颜色为"+colorInternal)

  override def toString: String = "颜色标记为"+colorInternal
  def printColor(): Unit =
    println("this class color is "+this.colorInternal)
}

//伴生对象object：与类名相同，可以访问类的私有属性和方法
object ClassAndObject {
  private val classAndObjectMaps : Map[String, ClassAndObject] = Map(
    "red" -> new ClassAndObject("redColor"),
    "blue" -> new ClassAndObject("blueColor"),
    "white" -> new ClassAndObject("whiteColor")
  )

  def apply(color :String): Unit = {
    println("this is apply")
    if(classAndObjectMaps.contains(color)) classAndObjectMaps(color) else println("this color is not in map")
  }

  def main(args: Array[String]): Unit = {
    println(ClassAndObject("newColor"))
    println(ClassAndObject apply("color"))
  }
}