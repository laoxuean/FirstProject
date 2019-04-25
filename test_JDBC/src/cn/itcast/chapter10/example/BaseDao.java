package cn.itcast.chapter10.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbutils.ResultSetHandler;

public class BaseDao {
	//xxQuery语句
	public static Object query(String sql,ResultSetHandler<?> rsh,Object ...params) throws SQLException{
		Connection conn = null;
		PreparedStatement pstmt = null;//sql的虚拟处理
		ResultSet rs = null;
		try {
			//运用连接池中的架包创建Connection
			conn = JDBCUtils.getConnection();
			pstmt = conn.prepareStatement(sql);
			for(int i = 0;params != null && i<params.length ;i++) {
				pstmt.setObject(i+1, params[i]);
			}
			//发送sql
			rs = pstmt.executeQuery();
			//让调用者去执行对结果集的处理
			Object obj = rsh.handle(rs);
			return obj;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rsh;
		
	} 
}
