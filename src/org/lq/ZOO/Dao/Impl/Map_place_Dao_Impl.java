package org.lq.ZOO.Dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.lq.ZOO.Dao.Map_place_Dao;
import org.lq.ZOO.entity.Map_place;
import org.lq.ZOO.util.JDBCUtil;

import com.sun.jna.platform.win32.Netapi32Util.DomainTrust;

import lombok.extern.log4j.Log4j;

/**
*@author 曼坤
*@组名 五颜祖
*@version创建时间    2019年6月13日上午11:21:09
*/
@Log4j
public class Map_place_Dao_Impl implements Map_place_Dao {
	private  Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;

	@Override
	public Map_place getMap_palceByID(int id) {
		String sql="select * from Map_place where id=?";
		Map_place map_place=null;
		conn=JDBCUtil.getConn();
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs=ps.executeQuery();
			while (rs.next()){
				map_place=Map_place.builder()
						.id(rs.getInt("id"))
						.icon(rs.getBinaryStream("icon"))
						.name(rs.getString("name"))
						.introduction(rs.getString("introduction"))
						.build();
			}
			
		} catch (SQLException e) {
			log.error("地图查询数据错误",e);
		}finally {
			JDBCUtil.closeAll(ps, rs, conn);
		}
		
		return map_place;
	}

	@Override
	public int update_place(int id,String path) {
		String sql="update map_place set icon=? where id=?";
		Map_place map_place=null;
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs=ps.executeQuery();
			while (rs.next()){
				map_place=Map_place.builder()
						.id(rs.getInt("id"))
						.icon(rs.getBinaryStream("icon"))
						.name(rs.getString("name"))
						.introduction(rs.getString("introduction"))
						.build();
			}
			
		} catch (SQLException e) {
			log.error("地图查询数据错误",e);
		}finally {
			JDBCUtil.closeAll(ps, rs, conn);
		}
		
		return 0;
	}
	

}
