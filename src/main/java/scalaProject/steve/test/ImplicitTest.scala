package scalaProject.steve.test

/**
 * @author steve
 */
object ImplicitTest {
  def main(args: Array[String]): Unit = {
    val list = new java.util.ArrayList[Int]()
    for (i <- 1 to 10) list.add(i)
    list.map((_, "a")).groupBy(_._2).map(e => (e._1, e._2.map(_._1).sum)).foreach(println)
  }

  implicit def javaListToScala[A](list: java.util.List[A]): scala.collection.mutable.Buffer[A] = {
    val result: scala.collection.mutable.ListBuffer[A] = new scala.collection.mutable.ListBuffer[A]
    list.forEach(v => result.append(v))
    result
  }
}