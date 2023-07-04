package Day58MySQL6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test创建表 {
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
		
		String sql = "CREATE TABLE `emp`(id INT,"
				+ "name VARCHAR(32),"
				+ "sex CHAR(1),"
				+ "brithday DATE,"
				+ "entry_date DATETIME,"
				+ "job VARCHAR(32),"
				+ "salart DOUBLE,"
				+ "resume TEXT)CHARSET utf8 COLLATE utf8_bin ENGINE INNODB";
		/*
		 * INSERT INTO `emp`
		 *             VALUES(100,
		 *                 '羊驼',
		 *                 '雄',
		 *                 '2000-10-12',
		 *                 '2022-10-25 23:05:22',
		 *                 '巡逻',
		 *                 500.25,
		 *                 '吃草')
		 *                 
		 * SELECT * FROM `emp`;
		 */
		
		stat.executeUpdate(sql);
		
		stat.close();
		conn.close();
	}
}
