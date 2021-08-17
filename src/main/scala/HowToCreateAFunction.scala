object HowToCreateAFunction {
  //声明函数
  def functionName (x :Int) : Int = {
    return x + 10;
  }
  //声明方法fun1参数为函数，且参数必须为俩个Int，返回值为俩个Int
  val add = (x: Int, y: Int) => x + y
  def fun1(f: (Int, Int) => Int) : Int = {
    return f(2,5)
  }
  fun1(add)

  //main函数
  def main(args: Array[String]): Unit = {
    val run1 = fun1(add)
    print(run1)
  }
}
