package scala.steve.scala.utils

import java.sql.{Connection, DriverManager}

import com.mysql.cj.jdbc.Driver

/**
 * @author java.steve
 */
object DBUtil {
  private var userName = ""
  private var password = ""
  private var url = ""

  private def init(): Unit = {
    val connection: Connection = DriverManager.getConnection(url, userName, password)

  }

}
