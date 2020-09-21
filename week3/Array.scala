package week3

object Array extends App {
  def buildArray(target: Array[Int], n: Int): List[String] = {

    if (n == 1) {
      if (target.length == 1) return if (target(0) == 1) List("Push") else List()
      else return List();
    }
    import scala.collection.mutable.ListBuffer
    val lb = new ListBuffer[String]()

    def f(idx: Int, curr: Int): Any = {
      if (idx >= target.length) return
      val cv = target(idx)
      if (cv == curr) {
        lb.append("Push")
        f(idx + 1, curr + 1)
      } else if (cv > curr) {
        var j = curr
        while (j < cv) {
          j += 1
          lb.append("Push")
          lb.append("Pop")
        }
        lb.append("Push")
        f(idx + 1, cv + 1)
      }
    }

    f(idx = 0, curr = 1)
    lb.toList
  }

}
