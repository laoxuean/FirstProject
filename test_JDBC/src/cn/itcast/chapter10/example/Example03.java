package cn.itcast.chapter10.example;

import java.beans.PropertyVetoException;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Example03 {
	public static DataSource ds =null;
	//初始化c3p0数据源
	static {
		ComboPooledDataSource cpds = new ComboPooledDataSource();
		//设置连接数据库需要的配置信息
		try {
			cpds.setDriverClass("com.mysql.cj.jdbc.Driver");
			cpds.setJdbcUrl("jdbc:mysql://localhost:3306/test_one?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true");
			cpds.setPassword("ak315315");
			cpds.setUser("root");
			
			//设置参数
			cpds.setInitialPoolSize(5);
			cpds.setMaxPoolSize(15);
			ds = cpds;
			
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) throws SQLException {
		System.out.println(ds.getConnection());
	}
}
