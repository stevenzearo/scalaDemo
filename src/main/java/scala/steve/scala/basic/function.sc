def plus(a: Int, b: Int): Int = a + b
// function define 1
val plus1 = plus _
// function define 2
val plus2: (Int, Int) => Int = plus
def -(a: Int, b: Int) = a + b
$minus(1, 2)
// tail recursion function(last result as current arg)
@annotation.tailrec
def power(a: Int, b: Int, n: Int = 1): Int = {
    if (b < 1) n
    else power(a, b - 1, n * a)
}
power(2, 3)
// vararg
def sum(nums: Int*): Int = {
    var total: Int = 0
    for (a <- nums) total += a
    total
}
sum()
sum(1, 2, 3)
// args group
def max(a: Int)(b: Int): Int = {
    if (a > b) a else b
}
val func = max(1) _
func(2)
// higher-order function
def safeStringOp(s: String, func: String => String): String = {
    if (s != null) func(s) else s
}
val reverse: String => String = (s: String) => s.reverse
safeStringOp("hello, world", reverse)
safeStringOp(null, reverse)
// placeholder syntax
safeStringOp("asa", _.reverse)
val op = safeStringOp _
val op2: Int => Int = _ * 2
// currying, using args group to use a part of args and the others for next step
def sum(a: Int)(b: Int): Int = if (a > b) a else b
val curryingSum: Int => Int = sum(2)
curryingSum(4)