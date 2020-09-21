package week3

import scala.util.control.Breaks.{break, breakable}

object SumZero extends App {
  def sumZero(n: Int): Array[Int] = {
    val x = -(n / 2)
    var arr = Array[Int]()
    for (i <- x until n / 2 + 1) {
      breakable {
        if (i == 0 && n % 2 == 0) break
        arr +:= i
      }
    }
    arr
  }

  print(sumZero(5).foreach(x => println(x)))
  print(sumZero(6).foreach(x => println(x)))
  //  println()
  print(sumZero(1).foreach(x => println(x)))

}
