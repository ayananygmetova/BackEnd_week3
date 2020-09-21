object Intersection extends App{
  def intersection(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
    val res = nums1.intersect(nums2)
    res.distinct
  }
  val nums1 = Array(1,2,2,1)
  val nums2 = Array(2,2)
  println(intersection(nums1, nums2).foreach(x=>(print(x))))

}
