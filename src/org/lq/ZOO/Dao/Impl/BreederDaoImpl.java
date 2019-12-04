/**
 * 
 */
package org.lq.ZOO.Dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.lq.ZOO.Dao.BreederDao;
import org.lq.ZOO.Dao.Impl.animalDaoImpl.animalDaoImplBuilder;
import org.lq.ZOO.entity.Animal;
import org.lq.ZOO.entity.Breeder;
import org.lq.ZOO.util.JDBCUtil;

import com.eltima.components.ui.r;

import lombok.Builder;
import lombok.extern.log4j.Log4j;

/**
 * @author 第四组 王威
 *@data 2019年7月4日
*@project_nameZOO
 */
@Log4j
@Builder
public class BreederDaoImpl implements BreederDao {

	private  Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	/* 
	 * @see org.lq.ZOO.Dao.BreederDao#findAll()
	 */
	@Override
	public List<Breeder> findAll() {
		String sql="select * from Breeder";
		Breeder breeder=null;
		List<Breeder> list=new ArrayList<>();
		try {
			conn=JDBCUtil.getConn();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				breeder=Breeder.builder()
						.id(rs.getInt("id"))
						.name(rs.getString("name"))
						.animalId(rs.getInt("animalId"))
						.breederCount(rs.getString("breederCount"))
						.breederName(rs.getString("breederTime"))
						.breederTime(rs.getDate("breederTime"))
						.content(rs.getString("content"))
						.build();
				list.add(breeder);
			}
		} catch (SQLException e) {
			log.error("查询全部时发生错误",e);
		} finally {
			JDBCUtil.closeAll(ps, rs, conn);
		}
		return list;
	}

	/* (non-Javadoc)
	 * @see org.lq.ZOO.Dao.BreederDao#getanimalById(int)
	 */
	@Override
	public List<Breeder> getanimalById(int id) {
		String sql="select * from Breeder where animalId= ?";
		Breeder breeder=null;
		List<Breeder> list=new ArrayList<>();
		try {
			conn=JDBCUtil.getConn();
			ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs=ps.executeQuery();
			while(rs.next()) {
				breeder=Breeder.builder()
						.id(rs.getInt("id"))
						.name(rs.getString("name"))
						.animalId(rs.getInt("animalid"))
						.breederCount(rs.getString("breederCount"))
						.breederName(rs.getString("breederName"))
						.breederTime(rs.getDate("breederTime"))
						.content(rs.getString("content"))
						.build();
				list.add(breeder);
			}
		} catch (SQLException e) {
			log.error("查询全部时发生错误",e);
		} finally {
			JDBCUtil.closeAll(ps, rs, conn);
		}
		return list;
	}

	/* (non-Javadoc)
	 * @see org.lq.ZOO.Dao.BreederDao#addBreeder(org.lq.ZOO.entity.Breeder)
	 */
	@Override
	public int addBreeder(Breeder breeder) {
		String sql="insert into breeder  values(null,?,?,?,?,?,?)";
		return JDBCUtil.executeUpdate(sql, 
				breeder.getName(),
				breeder.getAnimalId(),
				breeder.getBreederCount(),
				breeder.getBreederName(),
				breeder.getBreederTime(),
				breeder.getContent()
				);
	}

}
