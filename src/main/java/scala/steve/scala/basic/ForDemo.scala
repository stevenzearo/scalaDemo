package java.steve.java.basic

/**
 * @author java.steve
 */
object ForDemo {


    // wordCount
    def main(args: Array[String]): Unit = {
        val words: Array[String] = Array("hello", "hello", "world", "you", "are", "how");
        val countMap: Map[String, Int] = wordCountFor(words)
        countMap.foreach(println)
    }

    def wordCount(words: Array[String]): Map[String, Int] = {
        words.map(((_: String), 1)).groupBy((_: (String, Int))._1).mapValues((_: Array[(String, Int)]).length)
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
