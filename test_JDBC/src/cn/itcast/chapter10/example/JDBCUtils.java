package cn.itcast.chapter10.example;

import java.awt.image.RescaleOp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtils {
	public static Connection getConnection() throws SQLException,ClassNotFoundException{
		Connection conn = null;
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("数据库加载成功");
			//通过DriverMangagement获取数据库连接
			String url="jdbc:mysql://localhost:3306/test_one?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
			String username = "root";
			String userpassage = "ak315315";
			try {
				 conn = DriverManager.getConnection(url, username, userpassage);
				System.out.println("获取数据可连接成功");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("获取数据库连接失败");
			}
		return conn;
	}
	
	//关闭数据库资源
	public static void releas(Statement stmt,Connection conn) {
		if(stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			stmt = null;
		}
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			conn = null;
		}
	}
	public static void release(ResultSet rs,Statement stmt,Connection conn) {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			rs = null;
		}
		releas(stmt, conn);                                                                                                                                                           
	}
	
}
