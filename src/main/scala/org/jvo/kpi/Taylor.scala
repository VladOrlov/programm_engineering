package org.jvo.kpi

object Taylor {

  def main(args: Array[String]): Unit = {
    val x: Double = 0.3

    println(s"x = $x")
    calculate(x)
  }

  def calculate(x: Double): Double = {
    (1 to 4).toList
      .foldLeft(0.0)((z: Double, i: Int) => {
        println(s"n = $i")
        val taylor = z + 1 / math.pow(1 + x, i)
        println(f"taylor = $taylor%1.5f")
        taylor
      })
  }
}