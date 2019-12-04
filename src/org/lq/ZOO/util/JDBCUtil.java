package org.lq.ZOO.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import lombok.extern.log4j.Log4j;
/**
 * 数据库工具类
 * @author 无语
 * @PROJECT SuperCRM
 * @时间 2019年5月25日-下午4:56:59
 *
 */
@Log4j
public class JDBCUtil {
	
	private static String USER;
	private static String PASSWORD;
	private static String URL;
	private static String DRIVER;
	
	static {
		
		Properties prop = PropsUtil.loadProps("jdbc.properties");
		
		USER = PropsUtil.getString(prop, "user");
		PASSWORD = PropsUtil.getString(prop, "password");
		URL = PropsUtil.getString(prop, "url");
		DRIVER = PropsUtil.getString(prop, "driver");
		
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			log.error("数据库连接 用户名,密码或地址错误", e);
		}
		
	}
	
	public static Connection getConn() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			log.error("数据库连接错误", e);
		}
		return conn;
	}

	

	
	public static void closeAll(PreparedStatement ps,Connection conn) {
		try {
			if(ps !=null ) ps.close();
			if(conn !=null ) conn.close();
		} catch (SQLException e) {
			log.error("数据访问:关闭数据流错误",e);
		}
	}
	public static void closeAll(PreparedStatement ps,ResultSet rs ,Connection conn) {
		try {
			if(rs !=null ) rs.close();
			if(ps !=null ) ps.close();
			if(conn !=null ) conn.close();
		} catch (SQLException e) {
			log.error("数据访问:关闭数据流错误",e);
		}
	}
	
	
	public static int executeUpdate(String sql,Object...args) {
		
		int num = 0;
		Connection conn = getConn();
		PreparedStatement ps = null;
		try {
			 ps = conn.prepareStatement(sql);
			for(int i = 0;i<args.length;i++) {
				ps.setObject(i+1, args[i]);
			}
			num = ps.executeUpdate();
		} catch (SQLException e) {
//			e.printStackTrace();
			log.error("数访问层 : 添加,删除,修改错误!",e);
		}finally {
			closeAll(ps, conn);
		}
		
		return num;
	}
	
	
}
