package Day56MySQL4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class 删除数据库 {
	
	//恢复数据库前,首先删除hsp_db01这个数据库
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/hsp_db01?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
	
	static final String USER = "root";
	static final String PASSWORD = "L12688h15952Y";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(JDBC_DRIVER);
		Connection conn = null;
		Statement stat = null;
		System.out.println("连接数据库。。。");
		conn = DriverManager.getConnection(DB_URL,USER,PASSWORD);
		System.out.println("创建Statement对象。。。");
		stat = conn.createStatement();
		String sql = "DROP DATABASE hsp_db01";
		stat.executeUpdate(sql);
		
		stat.close();
		conn.close();
	}
}
