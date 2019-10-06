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