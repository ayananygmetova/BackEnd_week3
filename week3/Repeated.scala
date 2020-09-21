package week3

object Repeated extends App {
  def repeatedNTimes(A: Array[Int]): Int = {
    var nums = scala.collection.SortedSet[Int]()
    val ar = A.sorted
    for (x <- ar)
      nums += x
    for ((x, i) <- nums.zipWithIndex) {
      if (x != ar(i))
        return ar(i)
    }
    return ar(ar.length - 1)
  }

  val nums = Array(2, 1, 2, 5, 3, 2)
  print(repeatedNTimes(nums))

}
