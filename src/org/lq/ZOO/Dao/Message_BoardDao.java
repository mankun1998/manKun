package org.lq.ZOO.Dao;
/**
 * @author许浩
 * @2019年6月28日
 * @Message_BoardDao.java
 * @ZOO
 */
/**
 * @author 许浩
 * 2019年6月28日
 */

import java.util.List;

import org.lq.ZOO.entity.Message_Board;

public interface Message_BoardDao {

	//查找全部留言
	List<Message_Board> findAll();
	//添加留言
	int addMessage(Message_Board message_Board);
	
}
