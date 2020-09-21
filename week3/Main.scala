package week3

object Main extends App {
  def find(list: List[Int], num: Int): Boolean = {
    if (list.head == num) true
    else if (list.tail == List()) false
    else find(list.tail, num)
  }

  val list = List(1, 6, 2, 6, 9, 3, 10, 8)
  println(find(list, 6))
}
