package scalaProject.steve.leetcode.croakfrogs

object Solution {
  val croak: List[Char] = List.apply('c', 'r', 'o', 'a', 'k')

  def minNumberOfFrogs(croakOfFrogs: String): Int = {
    if (croakOfFrogs == null || croakOfFrogs.length % 5 != 0 || !croakOfFrogs.toSet.canEqual(croak.toSet) || !croakOfFrogs.startsWith("c")) return -1
    if (croakOfFrogs.length == 5 || croakOfFrogs.equals("croak")) return 1
    var processedCroak = croakOfFrogs
    if (croakOfFrogs.substring(croakOfFrogs.length >>> 1).equals(croakOfFrogs.substring(0, croakOfFrogs.length >>> 1))) {
      processedCroak = croakOfFrogs.substring(croakOfFrogs.length >>> 1)
    }
    if (processedCroak.isEmpty) return 1
    if (!processedCroak.toCharArray.toSet.canEqual(croak.toSet)) return -1
    val buffer = processedCroak.toCharArray.toBuffer
    var count = 0
    while (buffer.nonEmpty) {
      croak.foreach(c => {
        val i = buffer.indexOf(c)
        if (i == -1) return -1
        buffer.remove(i)
      })
      count += 1
    }
    count
  }


  def main(args: Array[String]): Unit = {
    var x = minNumberOfFrogs("crocakcroraoakk")
    println(x)
  }
}