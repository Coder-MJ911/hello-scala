object GreekPlanets extends Enumeration {
  val Mercury = Value(1, "Hermes")
  val Venus = Value(2, "Aphrodite")
  //Fun Fact: Tellus is Roman for (Mother) Earth
  val Earth = Value(3, "Gaia")
  val Mars = Value(4, "Ares")
  val Jupiter = Value(5, "Zeus")
  val Saturn = Value(6, "Cronus")
  val Uranus = Value(7, "Ouranus")
  val Neptune = Value(8, "Poseidon")
  val Pluto = Value(9, "Hades")
}

object Iterables {
  def main(args: Array[String]): Unit = {
    println(GreekPlanets.Earth == GreekPlanets.Earth)

    var money : BigDecimal = 0.0
    for(month <- 1 to 120) {
      money += 1500.0
      money *= 1.02
    }
    println(s"10 years money with management: ${money}")
    println(s"10 years money without management: "+1500*120 )
  }
}
