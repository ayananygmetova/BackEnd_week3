package week3

object Candies extends App {
  def kidsWithCandies(candies: Array[Int], extraCandies: Int): Array[Boolean] = {
    val max = candies.max
    var withCandies = new Array[Boolean](candies.length)
    for ((x, i) <- candies.zipWithIndex)
      withCandies(i) = (x + extraCandies >= max)
    withCandies
  }

  def test1(): Unit = {
    val candies: Array[Int] = Array[Int](2, 3, 5, 1, 3)
    val extraCandies = 3
    println(kidsWithCandies(candies, extraCandies).foreach(x => println(x)) + "\n")
  }

  test1()
}
