package steve.scala.demo

import java.io.{BufferedReader, File, FileInputStream, FileReader, InputStream, InputStreamReader}

import scala.io.Source

/**
 * @author steve
 */
object FileTest {
  def main(args: Array[String]): Unit = {
    val path = "C:\\Users\\steve\\IdeaProjects\\scalaDemo\\src\\main\\java\\steve\\scala\\demo\\test.txt"
    /*val file = new File(path)
    if (file.exists()) {
      val stream = new FileInputStream(file)
      val reader = new BufferedReader(new InputStreamReader(stream))
      val value = reader.lines()
      value.forEach(s => println(s))
    }*/
    val file2 = Source.fromFile(path)
    try {
      file2.getLines().foreach(s => println(s))
    } finally {
      file2.close()
    }

  }

}
