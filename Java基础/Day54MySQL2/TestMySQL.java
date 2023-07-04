package Day54MySQL2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestMySQL {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/RUNOOB?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
	
	static final String USER = "root";
	static final String PASSWORD = "L12688h15952Y";
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement state = null;
		try {
			Class.forName(JDBC_DRIVER);
			
			System.out.println("连接数据库...");
			conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			
			System.out.println("实例化Statement对象...");
			state = conn.createStatement();
			
			//得到statement对象，把sql语句发给mysql执行
			String sql = "CREATE TABLE goods_tb1(id int,name varchar(32),price double,introduce text)";
			state.executeUpdate(sql);
			
			state.close();
			conn.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
