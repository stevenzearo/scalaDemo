package scalaProject.steve.db

import java.sql.DriverManager

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

    //    classOf[Driver]
    val connection = DriverManager.getConnection(url, userName, password)
    val sql = "select * from user_infos"
    val statement = connection.prepareStatement(sql)
    try {
      val set = statement.executeQuery()
      while (set.next()) {
        val userId = set.getInt("id")
        val userName = set.getString("name")
        val userPwd = set.getString("password")
        println(userId + "-" + userName + ": " + userPwd)
      }
    } finally {
      statement.close()
      connection.close()
    }
  }


}
