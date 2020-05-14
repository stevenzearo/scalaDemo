package scalaProject.steve.leetcode.singlenumber

object Solution {
    def singleNumber(nums: Array[Int]): Int = {
        val value = nums.map((_, 1)).groupBy(_._1).filter(_._2.length == 1).toList
        value.head._1
    }
}