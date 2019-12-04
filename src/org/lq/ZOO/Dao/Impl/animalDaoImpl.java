package org.lq.ZOO.Dao.Impl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.lq.ZOO.Dao.animalDao;
import org.lq.ZOO.entity.Animal;
import org.lq.ZOO.util.JDBCUtil;

import lombok.Builder;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;


/**
 *@author 曼坤
 *@组名 五颜祖
 *@version创建时间    2019年6月12日上午11:57:08
 */
@Log4j
@Builder
public class animalDaoImpl implements animalDao {
	private  Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	//查询全部
	@Override
	public List<Animal> findAll() {
		String sql="select * from animal";
		Animal animal=null;
		List<Animal> list=new ArrayList<>();
		try {
			conn=JDBCUtil.getConn();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				animal=Animal.builder()
						.id(rs.getInt("id"))
						.subject(rs.getInt("subject"))
						//.variety(rs.getInt("variety"))
						.name(rs.getString("name"))
						.gender(rs.getString("gender"))
						.birthday(rs.getDate("birthday"))
						.age(rs.getInt("age"))
						.condition(rs.getInt("condition"))
						.icon(rs.getBinaryStream("icon"))
						.joinDate(rs.getDate("joinDate"))
						.comment(rs.getString("comment"))
						.build();
				list.add(animal);
				
			}
			
		} catch (SQLException e) {
			log.error("查询全部时发生错误",e);
		}
		
		
		return list;
	}
	//根据科目查询
	@Override
	public List<Animal> getAnimalBysubject(int subject) {
		String sql="select * from animal where subject=?";
		Animal animal=null;
		List<Animal> list=new ArrayList<>();
		try {
			conn=JDBCUtil.getConn();
			ps=conn.prepareStatement(sql);
			ps.setInt(1, subject);
			rs=ps.executeQuery();
			while(rs.next()) {
				animal=Animal.builder()
						.id(rs.getInt("id"))
						.subject(rs.getInt("subject"))
						//.variety(rs.getInt("variety"))
						.name(rs.getString("name"))
						.gender(rs.getString("gender"))
						.age(rs.getInt("age"))
						.condition(rs.getInt("condition"))
						.icon(rs.getBinaryStream("icon"))
						.joinDate(rs.getDate("joinDate"))
						.comment(rs.getString("comment"))
						.build();
				list.add(animal);
			}
			
		} catch (SQLException e) {
			log.error("查询全部时发生错误",e);
		}
		
		
		return list;
	}
	//根据种类查询
	//@Override
//	public List<Animal> getAnimalByVariety(int variety) {
//		String sql="select * from animal where variety=?";
//		Animal animal=null;
//		List<Animal> list=new ArrayList<>();
//		try {
//			conn=JDBCUtil.getConn();
//			ps=conn.prepareStatement(sql);
//			ps.setInt(1,variety);
//			rs=ps.executeQuery();
//			while(rs.next()) {
//				animal=Animal.builder()
//						.id(rs.getInt("id"))
//						.subject(rs.getInt("subject"))
//						//.variety(rs.getInt("variety"))
//						.name(rs.getString("name"))
//						.gender(rs.getString("gender"))
//						.age(rs.getInt("age"))
//						.condition(rs.getInt("condition"))
//						.icon(rs.getBinaryStream("icon"))
//						.joinDate(rs.getDate("joinZoo"))
//						.comment(rs.getString("comment"))
//						.build();
//				list.add(animal);
//			}
//			
//		} catch (SQLException e) {
//			log.error("查询全部时发生错误",e);
//		}
//		
//		
//		return list;
//	}
	//根据状态查询
	
	@Override
	public List<Animal> getAnimalByCondition(int condition) {
		String sql="select * from animal where `condition` = ? ";
		Animal animal=null;
		List<Animal> list=new ArrayList<>();
		try {
			conn=JDBCUtil.getConn();
			ps=conn.prepareStatement(sql);
			ps.setInt(1,condition);
			rs=ps.executeQuery();
			while(rs.next()) {
				animal=Animal.builder()
						.id(rs.getInt("id"))
						.subject(rs.getInt("subject"))
					//	.variety(rs.getInt("variety"))
						.name(rs.getString("name"))
						.gender(rs.getString("gender"))
						.age(rs.getInt("age"))
						.condition(rs.getInt("condition"))
						.icon(rs.getBinaryStream("icon"))
						.joinDate(rs.getDate("joinDate"))
						.comment(rs.getString("comment"))
						.build();
				list.add(animal);
			}
			
		} catch (SQLException e) {
			log.error("查询全部时发生错误",e);
		}
		
		
		return list;
	}
	//修改
	@Override
	public int updateAnimal(Animal animal) {
		String sql="update animal set subject=?,name=?,gender=?,age=?,condition=?,icon=?,joinZoo=?,comment=? where id=?";
		return JDBCUtil.executeUpdate(sql, 
				animal.getSubject(),
				//animal.getVariety(),
				animal.getName(),
				animal.getGender(),
				animal.getAge(),
				animal.getCondition(),
				animal.getIcon(),
				animal.getJoinDate(),
				animal.getComment(),
				animal.getId()
				);
	}
	
	//添加
	@Override
	public int addAnimal(Animal animal) {
		String sql="insert into animal  values(null,?,?,?,?,?,?,?,?,?)";
		return JDBCUtil.executeUpdate(sql, 
				animal.getSubject(),
				//animal.getVariety(),
				animal.getName(),
				animal.getGender(),
				animal.getBirthday(),
				animal.getAge(),
				animal.getCondition(),
				animal.getIconBytes(),
				animal.getJoinDate(),
				animal.getComment()
				);
	}
	/* (non-Javadoc)
	 * @see org.lq.ZOO.Dao.animalDao#getAnimalById(int)
	 */
	@Override
	public Animal getAnimalById(int id) {
		String sql="select * from animal where id = ?";
		Animal animal=null;
		
		try {
			conn=JDBCUtil.getConn();
			ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs=ps.executeQuery();
			while(rs.next()) {
				animal=Animal.builder()
						.id(rs.getInt("id"))
						.subject(rs.getInt("subject"))
						//.variety(rs.getInt("variety"))
						.name(rs.getString("name"))
						.gender(rs.getString("gender"))
						.birthday(rs.getDate("birthday"))
						.age(rs.getInt("age"))
						.condition(rs.getInt("condition"))
						.icon(rs.getBinaryStream("icon"))
						.joinDate(rs.getDate("joinDate"))
						.comment(rs.getString("comment"))
						.build();
				
			}
			
		} catch (SQLException e) {
			log.error("查询全部时发生错误",e);
		}
		
		
		return animal;
	}
	/* (non-Javadoc)
	 * @see org.lq.ZOO.Dao.animalDao#getAnimalByName(java.lang.String)
	 */
	@Override
	public List<Animal> getAnimalByName(String name) {
		String sql="select * from animal where name = ?";
		Animal animal=null;
		List<Animal> list=new ArrayList<>();
		try {
			conn=JDBCUtil.getConn();
			ps=conn.prepareStatement(sql);
			ps.setString(1, name);
			rs=ps.executeQuery();
			while(rs.next()) {
				animal=Animal.builder()
						.id(rs.getInt("id"))
						.subject(rs.getInt("subject"))
						//.variety(rs.getInt("variety"))
						.name(rs.getString("name"))
						.gender(rs.getString("gender"))
						.age(rs.getInt("age"))
						.condition(rs.getInt("condition"))
						.icon(rs.getBinaryStream("icon"))
						.joinDate(rs.getDate("joinDate"))
						.comment(rs.getString("comment"))
						.build();
				list.add(animal);
			}
			
		} catch (SQLException e) {
			log.error("查询全部时发生错误",e);
		}
		
		
		return list;
	}
	/* (non-Javadoc)
	 * @see org.lq.ZOO.Dao.animalDao#getAnimalByVarietyAndCondition(int, int)
	 */
	@Override
	public List<Animal> getAnimalBySubjectAndCondition(int subject, int condition) {
		String sql="select * from animal where `subject` = ? and `condition` = ?";
		Animal animal=null;
		List<Animal> list=new ArrayList<>();
		try {
			conn=JDBCUtil.getConn();
			ps=conn.prepareStatement(sql);
			ps.setInt(1, subject);
			ps.setInt(2, condition);	
			rs=ps.executeQuery();
			while(rs.next()) {
				animal=Animal.builder()
						.id(rs.getInt("id"))
						.subject(rs.getInt("subject"))
						//.variety(rs.getInt("variety"))
						.name(rs.getString("name"))
						.gender(rs.getString("gender"))
						.age(rs.getInt("age"))
						.condition(rs.getInt("condition"))
						.icon(rs.getBinaryStream("icon"))
						.joinDate(rs.getDate("joinDate"))
						.comment(rs.getString("comment"))
						.build();
				list.add(animal);
			}
			
		} catch (SQLException e) {
			log.error("查询全部时发生错误",e);
		}
		
		
		return list;
	}
	

	

}
