package org.jvo.kpi

object Taylor {

  def main(args: Array[String]): Unit = {
    val x: Double = 0.3

    println(s"x = $x")
    calculateA(x, 4)
  }

  def calculateA(x: Double, taylorSeries: Int): Double = {
    require(taylorSeries > 0)
    (1 to taylorSeries).toList
      .foldLeft(0.0)((z: Double, series: Int) => {
        println(s"n = $series")
        val taylor = z + 1 / math.pow(1 + x, series)
        println(s"taylor = $taylor")
        taylor
      })
  }
}