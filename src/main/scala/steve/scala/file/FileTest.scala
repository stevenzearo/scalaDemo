package steve.scala.file

import scala.io.{BufferedSource, Source}

/**
 * @author steve
 */
object FileTest {
  def main(args: Array[String]): Unit = {
    val path: String = "C:\\Users\\steve\\IdeaProjects\\scalaDemo\\src\\main\\java\\steve\\scala\\demo\\test.txt"
    /*val file = new File(path)
    if (file.exists()) {
      val stream = new FileInputStream(file)
      val reader = new BufferedReader(new InputStreamReader(stream))
      val value = reader.lines()
      value.forEach(s => println(s))
    }*/
    val file2: BufferedSource = Source.fromFile(path)
    try {
      file2.getLines().foreach(println(_: String))
    } finally {
      file2.close()
    }

  }

}
