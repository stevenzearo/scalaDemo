package scalaProject.steve.leetcode.triangle

/**
 * 给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
 *
 * 相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。
 * 例如，给定三角形：
 *
 * [
 * [2],
 * [3,4],
 * [6,5,7],
 * [4,1,8,3]
 * ]
 *
 * 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/triangle
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author steve
 */
object Solution {
    def minimumTotal(triangle: List[List[Int]]): Int = {
        var num1 = 0
        var num2 = triangle.head.head
        var cursorIndex = 0
        var sum: Int = triangle.head.head
        for (i <- 1 until triangle.length) {
            num1 = triangle(i)(cursorIndex)
            num2 = triangle(i)(cursorIndex + 1)
            var min = if(num1 > num2) num2 else num1
            cursorIndex = if(num1 > num2) cursorIndex + 1 else cursorIndex
            sum += min
        }
        sum
    }

    def main(args: Array[String]): Unit = {
//        val triangle: List[List[Int]] = List.apply(List.apply(2), List.apply(3, 4), List.apply(6, 5, 7), List.apply(4, 1, 8, 3))
        val triangle: List[List[Int]] = List.apply(List.apply(-1), List.apply(2,3), List.apply(1,-1,-3)) // [[-1],[2,3],[1,-1,-3]]
        val i = minimumTotal(triangle)
        println(i)
    }
}