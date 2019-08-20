package steve.scala.utils

import java.sql.DriverManager

import com.mysql.cj.jdbc.{Driver, JdbcConnection}
import org.yaml.snakeyaml.Yaml

/**
  * @Author steve
  * @Date 2019/8/20
  * @Time 15:29
  * @Version 1.0
  */
object DBUtil {
    private var userName = ""
    private var password = ""
    private var url = ""
    private def init(): Unit = {
        classOf[Driver]
        val stream = getClass.getResourceAsStream("jdbc.yml")
//        Ymal
//        url = io.Source.fromFile("jdbc.yml").asInstanceOf[Map]
        //        val connection = DriverManager.getConnection()
    }

}
