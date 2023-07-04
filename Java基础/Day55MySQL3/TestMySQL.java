package Day55MySQL3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestMySQL {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/RUNOOB?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
	
	static final String USER = "root";
	static final String PASSWORD = "L12688h15952Y";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(JDBC_DRIVER);
		Connection conn = null;
		Statement stat = null;
		System.out.println("连接数据库。。。");
		conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		System.out.println("实例化Statement对象。。。");
		stat = conn.createStatement();
		//CREATE DATABASE [IF NOT EXISTS] db_name CHARACTER SET utf8 COLLATE utf8_bin
		String sql = "CREATE DATABASE IF NOT EXISTS hsp_db01 CHARACTER SET utf8 COLLATE utf8_bin";
		/*
		 * CREATE TABLE tb_name (id int,name varchar(32),price double,introduce text);(创建表)
		 * 
		 * INSERT INTO tb_name values(1,'LHY',2000.22,'童叟无欺');
		 * 
		 * SELECT * FROM tb_name WHERE NAME = 'LHY';
		 */
		stat.executeUpdate(sql);
		
		conn.close();
		stat.close();
	}
}
