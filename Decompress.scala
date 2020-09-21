import scala.collection.mutable.ArrayBuffer

object Decompress extends App{
  def decompressRLElist(nums: Array[Int]): Array[Int] = {
    var arr = ArrayBuffer[Int]()
    for (i <- 0 until nums.length by 2){
      arr++=ArrayBuffer.fill(nums(i))(nums(i+1))
    }
    arr.toArray
  }
  val nums = Array(1,1,2,3)
  print(decompressRLElist(nums).foreach(x=>println(x)))

}
