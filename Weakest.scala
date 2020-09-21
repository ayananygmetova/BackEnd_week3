object Weakest extends App{
  def kWeakestRows(mat: Array[Array[Int]], k: Int): Array[Int] = {
    var res = Array[Int]()
    for (row <- 0 until mat.length) {
       res +:= mat(row).sum
    }
    val (addSorted, indices) = res.zipWithIndex.sorted.unzip
    println(indices.foreach(x=>println(x)))
//    println(res.zipWithIndex.sorted.foreach(x=>println(x)))
    res.sorted

  }
  var m: Array[Array[Int]] = Array(Array(1,1,0,0,0), Array(1,1,1,1,0), Array(1,0,0,0,0), Array(1,1,0,0,0), Array(1,1,1,1,1))
//  println(kWeakestRows(m, 3).foreach(x=>println(x)))
  kWeakestRows(m,3)
//  println(m.foreach(x=>println(x.foreach(i=>print(i)))))
}
