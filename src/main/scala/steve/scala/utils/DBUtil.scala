package steve.scala.utils


import com.mysql.cj.jdbc.{Driver, JdbcConnection}

/**
 * @author steve
 */
object DBUtil {
    private var userName = ""
    private var password = ""
    private var url = ""
    private def init(): Unit = {
        classOf[Driver]

//        Ymal
//        url = io.Source.fromFile("jdbc.yml").asInstanceOf[Map]
        //        val connection = DriverManager.getConnection()
    }

}