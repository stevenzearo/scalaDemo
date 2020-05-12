package scalaProject.steve.mapreduce

import scala.collection.mutable
import scala.io.Source

/**
 * @author steve
 *
 *         在朋友圈内有一票人，他们之间加了微信好友，现在我们需要找出他们两两共同的好友
 */
object FriendshipMapReduce {
  def main(args: Array[String]): Unit = {
    /*val source = Source.fromFile("C:\\Users\\steve\\IdeaProjects\\scalaDemo\\src\\main\\resources\\mapreduce\\friends.txt")
    val pairs = source.getLines().toArray.map(line => {
      val key = line.split(":")(0)
      val values = line.split(":")(1).split(",")
      values.map(key + "-" + _)
    }).flatMap(_.iterator).toList
    println(pairs.length)
    val distPairs = pairs.filter(x => pairs.contains(x.reverse))
    val distPairs2 = distPairs
    val newPairList: List[Tuple2[String, String]] = distPairs.map(pair => {
      distPairs2.map(a => {
        var eleExist = false
        for (c <- pair.split("-")) {
          if (a.contains(c)) eleExist = true
        }
        if (eleExist) (pair, a)
      })
    }).flatMap(_.iterator).filter(_.isInstanceOf[Tuple2[String, String]]).asInstanceOf[List[Tuple2[String, String]]]
    val tuples = newPairList.map((v: Tuple2[String, String]) => (v._1, v._2, 1))
      .groupBy((v: Tuple3[String, String, Int]) => v._2)
      .map((group: Tuple2[String, List[Tuple3[String, String, Int]]]) => (group._1, group._2.head._2, group._2.map(_._3).sum))
      .filter((v: Tuple3[String, String, Int]) => v._3 >= 2)
      .filter((v: Tuple3[String, String, Int]) => !v._1.equals(v._2))
        .toList
    tuples.foreach(println)*/
  }
}
