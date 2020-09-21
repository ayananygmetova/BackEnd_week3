package week3

object Decimal extends App {

  class ListNode(_x: Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var x: Int = _x
  }

  def prepare(array: Array[Int]): ListNode = {
    var node: ListNode = null
    for (x <- array.reverse) {
      val curNode = new ListNode(x)
      curNode.next = node
      node = curNode
    }
    node
  }

  def getDecimalValue(head: ListNode): Int = {

    def rec(a: ListNode, b: String = ""): String = {
      if (a.next == null) b + a.x.toString
      else
        rec(a.next, b + a.x.toString)
    }

    Integer.parseInt(rec(head), 2)
  }

  val arr = Array(1, 0, 1)
  val head: ListNode = prepare(arr)
  println(getDecimalValue(head))

}
