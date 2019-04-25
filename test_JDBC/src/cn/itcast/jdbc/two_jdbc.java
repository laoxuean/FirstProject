package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class two_jdbc {
		private static Connection conn=null; //创建connection连接对象
		public static Connection getConn() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver"); //注册数据库的驱动
			}catch(ClassNotFoundException e){
				e.printStackTrace(); //若是加载不成功则提示错误提示
				System.out.println("加载数据不成功！");
			}
			String url="jdbc:mysql://localhost:3306/student?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
			String username="root";
			String userpassage="ak315315";
			try {
				conn=DriverManager.getConnection(url, username, userpassage);
				System.out.print("连接成功！"+conn);
			}catch (SQLException e) {
				
				e.printStackTrace();// 提示错误
				System.out.println("MySql连接不成功!");
			}
			return conn;		
		}
		public two_jdbc() {
			try {
				Statement stm=two_jdbc.getConn().createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//创建Statment对象
		}
}