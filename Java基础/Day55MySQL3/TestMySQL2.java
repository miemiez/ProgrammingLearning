package Day55MySQL3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestMySQL2 {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/RUNOOB?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
	
	static final String USER = "root";
	static final String PASSWORD = "L12688h15952Y";
	
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName(JDBC_DRIVER);
		Connection conn = null;
		Statement stat = null;
		try {
			System.out.println("连接数据库。。。");
			conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			System.out.println("实例化Statement对象。。。");
			stat = conn.createStatement();
			String sql = "SHOW DATABASES";
			/*
			 * SHOW DATABASES 查看当前数据库服务器中的所有数据库
			 * SHOW CREATE DATABASE hsp_db01 查看前面创建的hsp_db01数据库的定义信息（在创建数据库，表的时候，为了规避关键字，可以使用反引号（``）解决）
			 */
			stat.executeUpdate(sql);
			
			conn.close();
			stat.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
