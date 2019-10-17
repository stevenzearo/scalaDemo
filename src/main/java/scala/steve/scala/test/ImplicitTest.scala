package scala.steve.scala.test

import scala.collection.mutable.ListBuffer

/**
 * @author java.steve
 */
object ImplicitTest {
  def main(args: Array[String]): Unit = {
    val list = new java.util.ArrayList[Int]()
    for (i <- 1 to 10) list.add(i)
    list.map((_, "a")).groupBy(_._2).foreach(_._2.foreach(println))
  }

  implicit def javaListToScala[A](list: java.util.List[A]): ListBuffer[A] = {
    val result: ListBuffer[A] = new ListBuffer[A]
    list.forEach(v => result.append(v))
    result
  }
}