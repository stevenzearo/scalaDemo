val a: List[Int] = 1::2::Nil
a ::: List(3, 4)
a :+ 3
5 +: a
import scala.collection.mutable.ListBuffer
val b: ListBuffer[Int] = new ListBuffer[Int]
for(i <- 1 to 10) b.append(i)
b