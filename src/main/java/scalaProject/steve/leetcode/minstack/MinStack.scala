package scalaProject.steve.leetcode.minstack

class MinStack() {

  /** initialize your data structure here. */
  var tail: Node = null

  def push(x: Int): Unit = {
    if (tail == null) {
      tail = new Node(x)
    } else {
      tail.next = new Node(x)
      tail.next.previous = tail
      tail = tail.next
    }
  }

  def pop() {
    if (tail == null)  return
    tail = tail.previous
    if (tail != null) tail.next = null
  }

  def top(): Int = {
    tail.x
  }

  def getMin(): Int = {
    var min: Int = tail.x
    while (tail.previous != null) {
      tail = tail.previous
      min = if (tail.x > min)  min else tail.x
    }
    while (tail.next != null) {
      tail = tail.next
    }
    min
  }

}

class Node(_x: Int) {
  val x: Int = _x
  var next: Node = null
  var previous: Node = null
}

object MinStack {
  def main(args: Array[String]): Unit = {
    var minStack = new MinStack()
    minStack.push(-2)
    minStack.push(0)
    minStack.push(-3)
    val min = minStack.getMin()
    println("min:" + min)
    minStack.pop()
    val top = minStack.top()
    println("top:" + top)
    val min2 = minStack.getMin()
    print("min:" + min2)
}
}
/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = new MinStack()
 * obj.push(x)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */