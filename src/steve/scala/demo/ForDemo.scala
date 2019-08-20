package steve.scala.demo

/**
  * @Author steve
  * @Date 2019/8/20
  * @Time 10:39
  * @Version 1.0
  */
object ForDemo {


    // wordCount
    def main(args: Array[String]): Unit = {
        val words: Array[String] = Array("hello", "hello", "world", "you", "are", "how");
        val countMap = wordCountFor(words)
        for (j <- 10 to 100 if j % 2 == 0) {
            print(j)
        }
        for (j <- 10 until 100 if j % 2 == 0) {
            print(j)
        }
//        countMap.foreach(println)
    }

    def wordCount(words: Array[String]): Map[String, Int] = {
        words.map((_, 1)).groupBy(_._1).mapValues(_.length)
    }

    def wordCountFor(words: Array[String]): Map[String, Int] = {
        var resultMap: Map[String, Int] = Map()
        for (word <- words) {
            val maybeInt = resultMap.get(word)
            if (maybeInt.isEmpty) {
                resultMap += (word -> 1)
            } else {
                val newVal = maybeInt.get + 1
                resultMap += (word -> newVal)
            }
        }
        resultMap
    }
}
