package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrepareStatement {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement preStme = null;
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
			String sql = "insert into student (ename,hiredate,sal,depton)"+"values(?,?,?,?)";
			try {
				preStme = conn.prepareStatement(sql);
				preStme.setString(1,"z1");
				preStme.setString(2,"1999-10-04");
				preStme.setString(3,"1");
				preStme.setString(4,"2");
				preStme.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("数据库加载不成功");
		}finally {
			//回收资源
			if(preStme != null) {
				try {
					preStme.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
