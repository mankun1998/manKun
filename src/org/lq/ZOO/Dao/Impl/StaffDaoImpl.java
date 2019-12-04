package org.lq.ZOO.Dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.lq.ZOO.Dao.StaffDao;
import org.lq.ZOO.entity.Staff;
import org.lq.ZOO.util.JDBCUtil;

import lombok.extern.log4j.Log4j;


/**
*@author 曼坤
*@组名 五颜祖
*@version创建时间    2019年6月12日下午12:05:36
*/
@Log4j
public class StaffDaoImpl  implements StaffDao{
	private  Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	@Override
	public List<Staff> findAll() {
		String sql="select * from staffs";
		List<Staff> list=new ArrayList<>();
		Staff staff=null;
		conn=JDBCUtil.getConn();
		try {
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				staff=Staff.builder()
						.id(rs.getInt("id"))
						.name(rs.getString("name"))
						.pinyin(rs.getString("pinyin"))
						.age(rs.getInt("age"))
						.gender(rs.getString("gender"))
						.icon(rs.getBinaryStream("icon"))
						.phone(rs.getString("phone"))
						.password(rs.getString("password"))
						.professtion(rs.getInt("professtion"))
						.condition(rs.getInt("condition"))
						.entryDate(rs.getDate("entryDate"))
						.comment(rs.getString("comment"))
						.idCard(rs.getString("IDCard"))
				.build();
				list.add(staff);
			}
		} catch (SQLException e) {
			log.error("查询所有员工错误", e);
		} finally {
			JDBCUtil.closeAll(ps, rs, conn);
		}
		return list;
	}

	@Override
	public Staff getStaffByID(int id) {
		String sql="select * from staffs where id=?";
		
		Staff staff=null;
		conn=JDBCUtil.getConn();
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1,id);
			rs=ps.executeQuery();
			while(rs.next()) {
				staff=Staff.builder()
						.id(rs.getInt("id"))
						.name(rs.getString("name"))
						.pinyin(rs.getString("pinyin"))
						.age(rs.getInt("age"))
						.gender(rs.getString("gender"))
						.icon(rs.getBinaryStream("icon"))
						.phone(rs.getString("phone"))
						.password(rs.getString("password"))
						.professtion(rs.getInt("professtion"))
						.condition(rs.getInt("condition"))
						.entryDate(rs.getDate("entryDate"))
						.comment(rs.getString("comment"))
						.idCard(rs.getString("IDCard"))
				.build();
				
			}
			
		} catch (SQLException e) {
			log.error("根据id查询员工错误", e);
		}finally {
			JDBCUtil.closeAll(ps, rs, conn);
		}
		return staff;
	}

	@Override
	public List<Staff> getStaffByValue(String value) {
		String sql="select * from staffs where name like ?";
		List<Staff> list=new ArrayList<>();
		Staff staff=null;
		conn=JDBCUtil.getConn();
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, "%"+value+"%");
			rs=ps.executeQuery();
			while(rs.next()) {
				staff=Staff.builder()
						.id(rs.getInt("id"))
						.name(rs.getString("name"))
						.pinyin(rs.getString("pinyin"))
						.age(rs.getInt("age"))
						.gender(rs.getString("gender"))
						.icon(rs.getBinaryStream("icon"))
						.phone(rs.getString("phone"))
						.password(rs.getString("password"))
						.professtion(rs.getInt("profession"))
						.condition(rs.getInt("condition"))
						.entryDate(rs.getDate("entryDate"))
						.comment(rs.getString("comment"))
						.idCard(rs.getString("IDCard"))
						.build();
				list.add(staff);
			}
			
		} catch (SQLException e) {
			log.error("根据姓名模糊查询所有员工错误", e);
		} finally {
			JDBCUtil.closeAll(ps, rs, conn);
		}
		
		return list;
	}

	@Override
	public List<Staff> getStaffByCondition(int condition) {
		String sql="select * from staffs where condition=?";
		List<Staff> list=new ArrayList<>();
		Staff staff=null;
		conn=JDBCUtil.getConn();
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, condition);
			rs=ps.executeQuery();
			while(rs.next()) {
				staff=Staff.builder()
						.id(rs.getInt("id"))
						.name(rs.getString("name"))
						.pinyin(rs.getString("pinyin"))
						.age(rs.getInt("age"))
						.gender(rs.getString("gender"))
						.icon(rs.getBinaryStream("icon"))
						.phone(rs.getString("phone"))
						.password(rs.getString("password"))
						.professtion(rs.getInt("profession"))
						.condition(rs.getInt("condition"))
						.entryDate(rs.getDate("entryDate"))
						.comment(rs.getString("comment"))
						.idCard(rs.getString("IDCard"))
				.build();
				list.add(staff);
			}
			
		} catch (SQLException e) {
			log.error("根据职位查询所有员工错误", e);
		} finally {
			JDBCUtil.closeAll(ps, rs, conn);
		}
		return list;
	}

	@Override
	public int addStaff(Staff staff) {
		String sql="insert into staffs  values(null,?,?,?,?,?,?,?,?,?,?,?,?)";
		return JDBCUtil.executeUpdate(sql, 
				staff.getName(),
				staff.getPinyin(),
				staff.getAge(),
				staff.getGender(),
				staff.getIconBytes(),
				staff.getPhone(),
				staff.getPassword(),
				staff.getProfesstion(),
				staff.getCondition(),
				staff.getEntryDate(),
				staff.getComment(),
				staff.getIdCard()
				);
	}

	@Override
	public int updateStaff(Staff staff) {
		String sql="update  staffs set name=?,pinyin=?,age=?,gender=?,icon=?password=? ,phone=?,professtion=?,condition=?,entryDate=?,comment=?,IDCard=? where id=?";
		return JDBCUtil.executeUpdate(sql, 
				staff.getName(),
				staff.getPinyin(),
				staff.getAge(),
				staff.getGender(),
				staff.getIcon(),
				staff.getPhone(),
				staff.getPassword(),
				staff.getProfesstion(),
				staff.getCondition(),
				staff.getEntryDate(),
				staff.getComment(),
				staff.getId(),
				staff.getIdCard()
				);
	}

	/**
	 *@overriding
	 **/
	@Override
	public int updateStaffByIdCard(Staff staff) {
		String sql="update  staffs set password=?  where name=? and idcard=?";
		return JDBCUtil.executeUpdate(sql, 
				staff.getPassword(),
				staff.getName(),
				staff.getIdCard()
				);
	}

}
