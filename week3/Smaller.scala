package week3

object Smaller extends App {
  def smallerNumbersThanCurrent(nums: Array[Int]): Array[Int] = {
    nums.map(p => nums.count(q => q < p))
  }

  val nums = Array(1, 2, 3, 3, 3, 4, 5)
  smallerNumbersThanCurrent(nums).foreach(x => println(x)) + "\n"

}
