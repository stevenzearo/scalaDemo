package scala.steve.scala.file

import org.yaml.snakeyaml.Yaml
import scala.io.Source

/**
 * @author java.steve
 */
object IoDemo {
    def main(args: Array[String]) : Unit = {
        val source = Source.fromFile("D:\\projects\\scalaDemo\\src\\main\\resources\\jdbc.yml")
        val reader = source.mkString
        val yaml = new Yaml
    }
}
