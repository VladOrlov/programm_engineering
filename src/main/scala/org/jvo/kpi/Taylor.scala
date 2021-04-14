package org.jvo.kpi

object Taylor {

  def main(args: Array[String]): Unit = {
    val x: Double = 0.3

    println(s"x = $x")
    calculate(x, 4)
  }

  def calculate(x: Double, taylorSeries: Int): Double = {
    (1 to taylorSeries).toList
      .foldLeft(0.0)((z: Double, series: Int) => {
        println(s"n = $series")
        val taylor = z + 1 / math.pow(1 + x, series)
        println(f"taylor = $taylor%1.5f")
        taylor
      })
  }
}