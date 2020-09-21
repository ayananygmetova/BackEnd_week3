package week3

object PositiveSolution extends App {

  class CustomFunction {
    def f(x: Int, y: Int): Int = {}
  };

  def findSolution(customfunction: CustomFunction, z: Int): List[List[Int]] = {
    var solutions = List[List[Int]]()
    for (i <- 1 until z + 1) {
      for (j <- 1 until z + 1) {
        if (customfunction.f(i, j) == z) solutions +: List(i, j)
      }
    }
    solutions
  }

}
