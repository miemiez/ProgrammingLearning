package Day54MySQL2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestMySQL2 {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/RUNOOB?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
	
	static final String USER = "root";
 	static final String PASSWORD = "L12688h15952Y";
	
	public static void main(String[] args) {
		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection conn = null;
		Statement state = null;
		System.out.println("连接数据库");
		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			state = conn.createStatement();
			String sql = "insert into goods_tb1 value(1,'vivo',4210.99,'质量保证')";
			state.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("实例化Statement对象");
		
	}
}
