package scalaProject.steve.utils

import java.sql.{Connection, DriverManager, PreparedStatement}

import scala.collection.mutable

/**
 * @author steve
 */
class DBConnectionBuilder(val url: String, val userName: String, val password: String) {
  val dbConnection: Connection = DriverManager.getConnection(url, userName, password)
  var statement: PreparedStatement = _

  private def setPreparedStatement(sql: String, params: Object*): Unit = {
    statement = dbConnection.prepareStatement(sql)
    for (i <- 1 to params.length) statement.setObject(i, params(i))
  }

  def execute(sql: String, params: Object*): Unit = {
    setPreparedStatement(sql, params)
    statement.execute()
  }

  def batchExecute(sql: String, params: Object*): Unit = {}

  def selectOne[A](sql: String, viewClass: Class[A], params: Object*): A = {

    _
  }

  def select[A](sql: String, viewClass: Class[A], params: Object*): mutable.Buffer[A] = {
    val set = statement.executeQuery()
    _
  }
}
