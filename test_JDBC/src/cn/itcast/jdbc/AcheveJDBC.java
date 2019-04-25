package cn.itcast.jdbc;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
public class AcheveJDBC {
	
	public static void main(String[] args) {
		Statement stmt = null;
		ResultSet rs = null;
		Connection conn = null;
		//注册数据库驱动
		try {
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
			//通过 Connection对象获取Streament对象
			try {
				stmt = conn.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//使用statemt执行sql语句
			String sql = "select * from student";
			try {
				rs = stmt.executeQuery(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//执行结果集
			try {
				while(rs.next()) {
					int sal = rs.getInt("sal");//获取属性为sal的值
					String ename = rs.getString("ename");
					int dapton = rs.getInt("depton");
					Date birthday = rs.getDate("hiredate");
					System.out.println("sal:"+sal+"ename:"+ename+"dapton："+dapton+"birthday:"+birthday);	
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("数据库加载不成功");
		}finally {
			//回收资源
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
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
	}
	
}
