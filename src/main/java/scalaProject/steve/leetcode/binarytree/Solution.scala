package scalaProject.steve.leetcode.binarytree

import scala.collection.mutable.ListBuffer

/**
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 * Definition for a binary tree node.
 * class TreeNode(var _value: Int) {
 *   var value: Int = _value
 *   var left: TreeNode = null
 *   var right: TreeNode = null
 * }
 */
object Solution {
    def levelOrder(root: TreeNode): List[List[Int]] = {
        if (root == null) return List.apply()
        if (root.left == null && root.right == null) return List.apply(List.apply(root.value))
        val result: ListBuffer[List[Int]] = ListBuffer.apply(List.apply(root.value))
        var nextLevelNodes = getChildNodes(root)
        do {
            result.append(getNodesValues(nextLevelNodes))
            nextLevelNodes = getNextLevelNodes(nextLevelNodes)
        } while (nextLevelNodes.nonEmpty)
        result.toList
    }

    def getNextLevelNodes(levelNodes: List[TreeNode]): List[TreeNode] = {
        if (levelNodes == null || levelNodes.isEmpty) return List.apply()
        levelNodes.flatMap(getChildNodes)
    }

    def getChildNodes(root: TreeNode): List[TreeNode] = {
        if (root == null) return null
        if (root.left == null && root.right == null) return List.apply()
        val values = new ListBuffer[TreeNode]
        if (root.left != null) {
            values.addOne(root.left)
        }
        if (root.right != null) {
            values.addOne(root.right)
        }
        values.toList
    }

    def getNodesValues(levelNodes: List[TreeNode]): List[Int] = {
        if (levelNodes == null || levelNodes.isEmpty) return List.apply()
        levelNodes.map(_.value)
    }

    def main(args: Array[String]): Unit = {
        val root = new TreeNode(3)
        val left = new TreeNode(9)
        val right = new TreeNode(20)
        val rLeft = new TreeNode(15)
        val rRight = new TreeNode(7)
        val rrLeft = new TreeNode(23)
        val rrRight = new TreeNode(24)

        root.left = left
        root.right = right
        root.right.left = rLeft
        root.right.right = rRight
        root.right.right.left = rrLeft
        root.right.right.right = rrRight
        val values = levelOrder(root)
        println(values)
    }
}