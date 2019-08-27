package steve.scala.demo

import java.sql.DriverManager

import com.mysql.cj.jdbc.Driver

/**
 * @author steve
 */
object DbTest {
  def main(args: Array[String]): Unit = {
    val host = "localhost"
    val port = "3306"
    val dBTye = "mysql"
    val dbName = "test"
    val userName = "root"
    val password = "root"
    val url = "jdbc:" + dBTye + "://" + host + ":" + port + "/" + dbName + "?serverTimezone=UTC"

    classOf[Driver]
    val connection = DriverManager.getConnection(url, userName, password)
    val sql = "select * from user_info"
    val statement = connection.prepareStatement(sql)
    try {
      val set = statement.executeQuery()
      while (set.next()) {
        val userId = set.getInt("user_id")
        val userName = set.getString("user_name")
        val userPwd = set.getString("pwd")
        println(userId + "-" + userName + ": " + userPwd)
      }
    } finally {
      statement.close()
      connection.close()
    }
  }




}
