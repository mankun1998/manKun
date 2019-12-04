package org.lq.ZOO.Dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.lq.ZOO.Dao.Message_BoardDao;
import org.lq.ZOO.entity.Animal;
import org.lq.ZOO.entity.Message_Board;
import org.lq.ZOO.util.JDBCUtil;

import lombok.extern.log4j.Log4j;

/**
 * @author许浩
 * @2019年6月28日
 * @Message_BoardDaoimpl.java
 * @ZOO
 */
/**
 * @author 许浩
 * 2019年6月28日
 */
@Log4j
public class Message_BoardDaoimpl implements Message_BoardDao {
	private  Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	/**
	 *@overriding
	 **/
	@Override
	public List<Message_Board> findAll() {
		String sql="select * from messageboard ORDER BY id DESC";
		Message_Board mBoard=null;
		List<Message_Board> list=new ArrayList<>();
		try {
			conn=JDBCUtil.getConn();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				mBoard= Message_Board.builder()
						.id(rs.getInt("id"))
						.contact(rs.getString("contact"))
						.textContent(rs.getString("textContent"))
						.messageTime(rs.getDate("messageTime"))
						.build();
			list.add(mBoard);
			}
			
		} catch (SQLException e) {
			log.error("查询全部时发生错误",e);
		} finally {
			JDBCUtil.closeAll(ps, rs, conn);
		}
		
		
		return list;
	}

	/**
	 *@overriding
	 **/
	@Override
	public int addMessage(Message_Board message_Board) {
		String sql = "insert into messageboard values (null ,?,?,?)";
		return JDBCUtil.executeUpdate(sql, 
				message_Board.getContact(),
				message_Board.getTextContent(),
				message_Board.getMessageTime()
				);
	}

}
