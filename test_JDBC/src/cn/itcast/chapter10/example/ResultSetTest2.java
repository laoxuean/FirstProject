package cn.itcast.chapter10.example;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.commons.dbutils.handlers.BeanListHandler;

public class ResultSetTest2 {
	public static void testBeanHandler() throws SQLException{
		BaseDao basedao = new BaseDao();
		String sql = "select * from user where id=?";
		ArrayList<User> list = (ArrayList<User>) basedao.query(sql, new BeanListHandler(User.class));
		for(int i = 0;i<list.size();i++) {
			System.out.println("第"+(i+1)+"条数据的username的值为："+list.get(i).getName());
		}
	}
	public static void main(String[] args) {
		try {
			testBeanHandler();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
