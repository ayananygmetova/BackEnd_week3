package week3

object Weakest extends App {
  def kWeakestRows(mat: Array[Array[Int]], k: Int): Array[Int] = {

    val Weak = Array.ofDim[Int](mat.size)

    for (col <- 0 until mat(0).size; row <- 0 until mat.size) {
      Weak(row) += mat(row)(col)
    }

    Weak.zipWithIndex.sortBy(c => c._1).take(k).unzip._2
  }

  var m: Array[Array[Int]] = Array(Array(1, 1, 0, 0, 0), Array(1, 1, 1, 1, 0), Array(1, 0, 0, 0, 0), Array(1, 1, 0, 0, 0), Array(1, 1, 1, 1, 1))
  println(kWeakestRows(m, 3).foreach(x => println(x)))

  //  println(m.foreach(x=>println(x.foreach(i=>print(i)))))
}
