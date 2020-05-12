package scalaProject.steve.leetcode.reverselist

import scala.collection.mutable.ListBuffer

/**
 * @author steve
 */
object Solution {
  def reverseList(head: ListNode): ListNode = {
    if (head == null || head.next == null) return head;
    var copyOfHead = head
    val values = new ListBuffer[Int]
    while (copyOfHead.next != null) {
      values.addOne(copyOfHead.x)
      copyOfHead = copyOfHead.next
    }
    values.addOne(copyOfHead.x)
    val nodes = values.reverse.map[ListNode](new ListNode(_))
    for (node <- 0 until nodes.length - 1) {
      nodes(node).next = nodes(node + 1)
    }
    nodes.head
  }

  def main(args: Array[String]): Unit = {
    val node1 = new ListNode(1)
    val node2 = new ListNode(2)
    val node3 = new ListNode(3)
    node1.next = node2
    node2.next = node3
    val node = reverseList(node1)
    println(node)
  }
}
