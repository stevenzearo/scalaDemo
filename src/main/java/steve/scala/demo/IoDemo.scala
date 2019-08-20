package steve.scala.demo

import org.yaml.snakeyaml.Yaml

import scala.collection.mutable
import scala.io.Source

/**
  * @Author steve
  * @Date 2019/8/20
  * @Time 16:08
  * @Version 1.0
  */
object IoDemo {
    def main(args: Array[String]) : Unit = {
        val source = Source.fromFile("D:\\projects\\scalaDemo\\src\\main\\resources\\jdbc.yml")
        val reader = source.mkString
        val yaml = new Yaml
        val iterable = yaml.loadAll(reader)
    }
}
