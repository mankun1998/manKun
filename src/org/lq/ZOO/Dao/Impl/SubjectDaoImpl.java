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

import org.lq.ZOO.Dao.SubjectDao;
import org.lq.ZOO.entity.Subject;
import org.lq.ZOO.util.JDBCUtil;

import lombok.Builder;
import lombok.extern.log4j.Log4j;

/**
 * @author 第四组 王威
 *@data 2019年7月2日
*@project_nameZOO
 */
@Builder
@Log4j
public class SubjectDaoImpl implements SubjectDao{

	private  Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	/* (non-Javadoc)
	 * @see org.lq.ZOO.Dao.SubjectDao#findAll()
	 */
	@Override
	public List<Subject> findAll() {
		String sql="select * from subject";
		List<Subject> list = new ArrayList<>();
		Subject subject = null;
		conn = JDBCUtil.getConn();
		try {
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				subject  = Subject.builder()
						.subjectId(rs.getInt("subjectId"))
						.subjectName(rs.getString("subjectName"))
						.build();
				list.add(subject);
			}
		} catch (Exception e) {
			log.error("查询Subject所有错误", e);
		}finally {
			JDBCUtil.closeAll(ps, rs, conn);
		}
		return list;
	}

	/* (non-Javadoc)
	 * @see org.lq.ZOO.Dao.SubjectDao#getSubjectName()
	 */
	@Override
	public Subject getSubjectName(int subjectId) {
		String sql="select * from subject where subjectId = ?";
		
		Subject subject = null;
		conn = JDBCUtil.getConn();
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, subjectId);
			rs=ps.executeQuery();
			while (rs.next()) {
				subject  = Subject.builder()
						.subjectId(rs.getInt("subjectId"))
						.subjectName(rs.getString("subjectName"))
						.build();
			}
	
		} catch (Exception e) {
			log.error("根据id查询Subject所有错误", e);
		}finally {
			JDBCUtil.closeAll(ps, rs, conn);
		}
		return subject;
	}

}
