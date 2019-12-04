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

import org.lq.ZOO.Dao.AnimalCaseInformationDao;
import org.lq.ZOO.entity.BingLi;
import org.lq.ZOO.util.CastUtil;
import org.lq.ZOO.util.DateUtils;
import org.lq.ZOO.util.JDBCUtil;

import lombok.Builder;
import lombok.extern.log4j.Log4j;

/**
 * @author 第四组 王威
 *@data 2019年7月3日
*@project_nameZOO
 */
@Log4j
public class AnimalCaseInformationDaoImpl implements AnimalCaseInformationDao{

	private  Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	/* (non-Javadoc)
	 * @see org.lq.ZOO.Dao.AnimalCaseInformationDao#findAll()
	 */
	@Override
	public List<BingLi> findAll() {
		String sql = "select * from bingli";
		
		BingLi bingLi = null;
		List<BingLi> list = new ArrayList<>();
		try {
			conn=JDBCUtil.getConn();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				bingLi = BingLi.builder()
						.id(rs.getInt("id"))
						.animalId(rs.getInt("animalId"))
						.staffId(rs.getInt("staffId"))
						
						.medicineName(rs.getString("medicineName"))
						.medicineCount(rs.getString("medicineCount"))
						.medicineTime(rs.getDate("medicineTime"))
						.content(rs.getString("content"))
						.build();
				list.add(bingLi);
				//System.out.println(rs.getInt("id"));
			}		
			
		} catch (SQLException e) {
			log.error("查询全部动物病例查询错误", e);
		}finally {
			JDBCUtil.closeAll(ps, rs, conn);
		}	
		return list;
	}

	/* (non-Javadoc)
	 * @see org.lq.ZOO.Dao.AnimalCaseInformationDao#getId(int)
	 */
	@Override
	public List<BingLi> getId(int id) {
		String sql = "select * from bingli where id = ?";
		BingLi bingLi = null;
		List<BingLi> list = new ArrayList<>();
		conn = JDBCUtil.getConn();
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs=ps.executeQuery();
			while(rs.next()) {
				bingLi = BingLi.builder()
						.id(rs.getInt("id"))
						.animalId(rs.getInt("animalId"))
						.staffId(rs.getInt("staffId"))
						
						.medicineName(rs.getString("medicineName"))
						.medicineCount(rs.getString("medicineCount"))
						.medicineTime(rs.getDate("medicineTime"))
						.content(rs.getString("content"))
						.build();
				list.add(bingLi);
			}
						
		} catch (SQLException e) {
			log.error("通过id查询动物病例错误", e);
		}finally {
			JDBCUtil.closeAll(ps, rs, conn);
		}
		return list;
	}

	/* (non-Javadoc)
	 * @see org.lq.ZOO.Dao.AnimalCaseInformationDao#addBingliInformation(org.lq.ZOO.entity.BingLi)
	 */
	@Override
	public int addBingliInformation(BingLi bingLi) {
		int num = 0;
		String sql = "insert into Bingli values(null,?,?,?,?,?,?)";
		 
		try {
			conn = JDBCUtil.getConn();
			ps= conn.prepareStatement(sql);
			ps.setInt(1, bingLi.getAnimalId());
			ps.setInt(2, bingLi.getStaffId());
			
			ps.setString(3, bingLi.getMedicineName());
			ps.setString(4, bingLi.getMedicineCount());
			ps.setDate(5, DateUtils.utilDateTOSqlDate(bingLi.getMedicineTime()));
			ps.setString(6, bingLi.getContent());
			num = ps.executeUpdate();
		} catch (SQLException e) {
			log.error("添加病例错误", e);
		}finally {
			JDBCUtil.closeAll(ps, conn);
		}
		return num;
	}

}//
