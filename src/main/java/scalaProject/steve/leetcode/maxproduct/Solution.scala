package scalaProject.steve.leetcode.maxproduct

object Solution {
    def maxProduct(nums: Array[Int]): Int = {
        if (nums.length == 1) return nums(0)
        var maxProduct: Int = nums.max
        val nums1 = nums.filter(_ != 1)
        for (i <- 1 to nums1.length) {
            for (j <- 0 until i) {
                val subNums = nums1.slice(j, i)
                val positive = subNums.count(_ == -1) % 2 == 0
                if (!subNums.contains(0)) {
                    var product = subNums.filter(_ != -1).product
                    if (!positive) {
                        product = 0 - product
                    }
                    if (product > maxProduct) {
                        maxProduct = product
                    }
                }
            }
        }
        maxProduct
    }

    def main(args: Array[String]): Unit = {
        val arr1: Array[Int] = Array(2,3, -1, 2, 4, 4)
        println(maxProduct(arr1))
    }
}